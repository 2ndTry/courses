package com.mirniy.courses.model;

import lombok.Data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

@Data
public class Course {

    private Currency currencyId;
    private BigDecimal currencyVal;
    private LocalDateTime regTime;

    public Course(Currency currencyId, BigDecimal currencyVal, LocalDateTime regTime) {
        this.currencyId = currencyId;
        this.currencyVal = currencyVal;
        this.regTime = regTime;
    }

    public BigDecimal getCurrencyVal() {
        if (currencyVal != null) {
            return currencyVal.setScale(4, RoundingMode.DOWN);
        } else {
            return currencyVal;
        }
    }
}
