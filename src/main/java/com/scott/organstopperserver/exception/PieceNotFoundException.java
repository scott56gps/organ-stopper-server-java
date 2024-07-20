package com.scott.organstopperserver.exception;

public class PieceNotFoundException extends Exception {
    public PieceNotFoundException(Long id) {
        super("Could not retrieve piece for id: " + id);
    }
}
