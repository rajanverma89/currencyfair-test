package com.test.currencyfair.enums;

/**
 * Enum for Countries.
 */
public enum Country {

    FR("France"),
    IRE("Ireland"),
    SPA("Spain"),
    GE("Germany"),
    IND("India"),
    ENG("England"),
    IT("Italy"),
    US("United States");

    private String countryName;

    Country(String countryName){
        this.countryName = countryName;
    }
}
