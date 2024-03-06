package com.mirniy.courses.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiException {

    private int errCode;
    private String errMsg;
}
