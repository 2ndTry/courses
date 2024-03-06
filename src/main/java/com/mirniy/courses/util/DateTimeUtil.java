package com.mirniy.courses.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateTimeUtil {

    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");

    public LocalDateTime formattedDateTimeNow() {

        return LocalDateTime.parse(LocalDateTime.now().format(DATE_TIME_FORMATTER));
    }
}
