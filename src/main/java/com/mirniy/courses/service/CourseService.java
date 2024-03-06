package com.mirniy.courses.service;

import com.mirniy.courses.model.AddCourseRequest;
import com.mirniy.courses.model.ApiResponse;
import com.mirniy.courses.model.Course;

import java.util.List;

public interface CourseService {

    ApiResponse addCourse(AddCourseRequest request);

    ApiResponse loadData(List<Course> requests);

    Course getCourse(String currencyId);

    List<Course> getCourseMax5(String currencyId);

    List<Course> getCourseExtremum3(String currencyId);
}
