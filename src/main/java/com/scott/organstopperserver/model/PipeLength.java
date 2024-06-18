package com.scott.organstopperserver.model;

public enum PipeLength {
    TWO("2'"),
    FOUR("4'"),
    EIGHT("8'"),
    SIXTEEN("16'"),
    TWO_TWO_THIRDS("2 2/3'");

    private String displayLength;
    PipeLength(String displayLength) {
        this.displayLength = displayLength;
    }

    public String getDisplayLength() {
        return displayLength;
    }
}
