package com.mirniy.courses.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.RoundingMode;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class AddCourseRequest {

    private Currency currencyId;
    private BigDecimal currencyVal;

    public BigDecimal getCurrencyVal() {
        if (currencyVal != null) {
            return currencyVal.setScale(4, RoundingMode.DOWN);
        } else {
            return currencyVal;
        }
    }
}
