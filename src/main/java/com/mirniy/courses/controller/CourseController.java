package com.mirniy.courses.controller;

import com.mirniy.courses.exception.ApiException;
import com.mirniy.courses.model.AddCourseRequest;
import com.mirniy.courses.model.ApiResponse;
import com.mirniy.courses.model.Course;
import com.mirniy.courses.service.CourseService;
import com.mirniy.courses.util.SwaggerStringUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CourseController {

    private final CourseService courseService;

    @Operation(
            description = SwaggerStringUtil.ADD_COURSE_DESCR,
            summary = SwaggerStringUtil.ADD_COURSE_DESCR,
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    content = @Content(
                            schema = @Schema(implementation = AddCourseRequest.class),
                            mediaType = "application/json; charset=UTF-8",
                            examples = @ExampleObject(value = SwaggerStringUtil.ADD_COURSE_REQ)
                    )
            ),
            responses = {
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Success response",
                            responseCode = "200",
                            content = @Content(
                                    schema = @Schema(implementation = ApiResponse.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.ADD_COURSE_RES)
                            )
                    ),
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Validation error response",
                            responseCode = "400",
                            content = @Content(
                                    schema = @Schema(implementation = ApiException.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.ADD_COURSE_ERR)
                            )
                    )
            })
    @PostMapping(value = "/api/courses/regCourse")
    @ResponseBody
    public ApiResponse addCourse(@RequestBody AddCourseRequest request) {

        log.info("Request body: " + request.toString());

        return courseService.addCourse(request);
    }

    @Operation(
            description = SwaggerStringUtil.ADD_COURSES_DESCR,
            summary = SwaggerStringUtil.ADD_COURSES_DESCR,
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    content = @Content(
                            schema = @Schema(implementation = Course.class),
                            mediaType = "application/json; charset=UTF-8",
                            examples = @ExampleObject(value = SwaggerStringUtil.ADD_COURSES_REQ)
                    )
            ),
            responses = {
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Success response",
                            responseCode = "200",
                            content = @Content(
                                    schema = @Schema(implementation = ApiResponse.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.ADD_COURSES_RES)
                            )
                    ),
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Validation error response",
                            responseCode = "400",
                            content = @Content(
                                    schema = @Schema(implementation = ApiException.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.ADD_COURSES_ERR)
                            )
                    )
            })
    @PostMapping(value = "/api/courses/loadData")
    @ResponseBody
    public ApiResponse loadData(@RequestBody List<Course> requests) {

        log.info("Request body: " + requests.toString());

        return courseService.loadData(requests);
    }

    @Operation(
            description = SwaggerStringUtil.GET_COURSE_DESCR,
            summary = SwaggerStringUtil.GET_COURSE_DESCR,
            responses = {
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Success response",
                            responseCode = "200",
                            content = @Content(
                                    schema = @Schema(implementation = ApiResponse.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.GET_COURSE_RES)
                            )
                    ),
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Validation error response",
                            responseCode = "400",
                            content = @Content(
                                    schema = @Schema(implementation = ApiException.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.GET_COURSE_ERR)
                            )
                    )
            })
    @GetMapping(value = "/api/courses/getCourse")
    @ResponseBody
    public Course getCourse(@RequestParam String currencyId) {

        log.info("Request param: " + currencyId);

        return courseService.getCourse(currencyId);
    }

    @Operation(
            description = SwaggerStringUtil.GET_MAX_FIVE_COURSES_DESCR,
            summary = SwaggerStringUtil.GET_MAX_FIVE_COURSES_DESCR,
            responses = {
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Success response",
                            responseCode = "200",
                            content = @Content(
                                    schema = @Schema(implementation = ApiResponse.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.GET_MAX_FIVE_COURSES_RES)
                            )
                    ),
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Validation error response",
                            responseCode = "400",
                            content = @Content(
                                    schema = @Schema(implementation = ApiException.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.GET_MAX_FIVE_COURSES_ERR)
                            )
                    )
            })
    @GetMapping(value = "/api/courses/getCourseMax5")
    @ResponseBody
    public List<Course> getCourseMax5(@RequestParam String currencyId) {

        log.info("Request param: " + currencyId);

        return courseService.getCourseMax5(currencyId);
    }


    @Operation(
            description = SwaggerStringUtil.GET_THREE_EXTREMUM_COURSES_DESCR,
            summary = SwaggerStringUtil.GET_THREE_EXTREMUM_COURSES_DESCR,
            responses = {
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Success response",
                            responseCode = "200",
                            content = @Content(
                                    schema = @Schema(implementation = ApiResponse.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.GET_THREE_EXTREMUM_COURSES_RES)
                            )
                    ),
                    @io.swagger.v3.oas.annotations.responses.ApiResponse(
                            description = "Validation error response",
                            responseCode = "400",
                            content = @Content(
                                    schema = @Schema(implementation = ApiException.class),
                                    mediaType = "application/json; charset=UTF-8",
                                    examples = @ExampleObject(value = SwaggerStringUtil.GET_THREE_EXTREMUM_COURSES_ERR)
                            )
                    )
            })
    @GetMapping(value = "/api/courses/getCourseExtremum3")
    @ResponseBody
    public List<Course> getCourseExtremum3(@RequestParam String currencyId) {

        log.info("Request param: " + currencyId);

        return courseService.getCourseExtremum3(currencyId);
    }
}
