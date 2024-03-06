package com.mirniy.courses.model;

public enum Currency {

    USD("USD"),
    EUR("EUR");

    private final String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    public static boolean isValidEnum(String currency) {
        for (Currency day : values()) {
            if (day.toString().equalsIgnoreCase(currency)) {
                return true;
            }
        }
        return false;
    }
}
