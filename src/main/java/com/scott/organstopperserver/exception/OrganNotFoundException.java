package com.scott.organstopperserver.exception;

public class OrganNotFoundException extends Exception {
    public OrganNotFoundException(Long id) {
        super("Could not find organ for id: " + id);
    }
}
