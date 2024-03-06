package com.mirniy.courses.service.impl;

import com.mirniy.courses.model.AddCourseRequest;
import com.mirniy.courses.model.ApiResponse;
import com.mirniy.courses.model.Course;
import com.mirniy.courses.model.Currency;
import com.mirniy.courses.service.CourseService;
import com.mirniy.courses.util.DateTimeUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class CourseServiceImpl implements CourseService {

    private static final Map<String, List<Course>> coursesStorage = new HashMap<>();

    private final DateTimeUtil dateTimeUtil;

    @Override
    public ApiResponse addCourse(AddCourseRequest request) {

        Course course = new Course(
                Currency.valueOf(request.getCurrencyId().toString()),
                request.getCurrencyVal(),
                dateTimeUtil.formattedDateTimeNow());

        if (coursesStorage.containsKey(request.getCurrencyId().toString())) {
            if (coursesStorage.get(course.getCurrencyId().toString()).size() > 99) {
                coursesStorage.get(course.getCurrencyId().toString()).sort(Comparator.comparing(Course::getRegTime));
                coursesStorage.get(course.getCurrencyId().toString()).remove(0);
            }
            coursesStorage.get(request.getCurrencyId().toString()).add(course);
        } else {
            List<Course> courses = new ArrayList<>(100);
            courses.add(course);
            coursesStorage.put(request.getCurrencyId().toString(), courses);
        }

        log.info("Курс успешно добавлен. Курс: " + course);

        return new ApiResponse(0, "SUCCESS");
    }

    @Override
    public ApiResponse loadData(List<Course> requests) {

        for (Course course : requests) {

            if (coursesStorage.containsKey(course.getCurrencyId().toString())) {
                if (coursesStorage.get(course.getCurrencyId().toString()).size() > 99) {
                    coursesStorage.get(course.getCurrencyId().toString())
                            .sort(Comparator.comparing(Course::getRegTime));
                    coursesStorage.get(course.getCurrencyId().toString()).remove(0);
                }
                coursesStorage.get(course.getCurrencyId().toString()).add(course);
            } else {
                List<Course> courses = new ArrayList<>(100);
                courses.add(course);
                coursesStorage.put(course.getCurrencyId().toString(), courses);
            }
        }

        log.info("Курсы успешно добавлен. Курcы: " + requests);
        return new ApiResponse(0, "SUCCESS");
    }

    @Override
    public Course getCourse(String currencyId) {
        return coursesStorage.get(currencyId).stream()
                .max(Comparator.comparing(Course::getCurrencyVal))
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Course> getCourseMax5(String currencyId) {

        return coursesStorage.get(currencyId).stream()
                .sorted(Comparator.comparing(Course::getCurrencyVal).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    @Override
    public List<Course> getCourseExtremum3(String currencyId) {

        List<Course> result = coursesStorage.get(currencyId).stream()
                .sorted(Comparator.comparing(Course::getRegTime).reversed())
                .collect(Collectors.toList());

        List<Course> extremums = new ArrayList<>();

        for (int i = 0; i < result.size() - 2; i++) {
            if (result.get(i).getCurrencyVal().compareTo(result.get(i + 1).getCurrencyVal()) < 0 &&
                    result.get(i + 1).getCurrencyVal().compareTo(result.get(i + 2).getCurrencyVal()) > 0
            ) {
                extremums.add(result.get(i + 1));
            }
        }

        return extremums.stream()
                .sorted(Comparator.comparing(Course::getRegTime).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
