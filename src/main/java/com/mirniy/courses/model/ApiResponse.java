package com.mirniy.courses.model;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class ApiResponse {

    private Integer errCode;
    private String errMsg;
}
