package com.devsuperior.demo.dto.exceptions;

public class FieldMessage {
    private String fielName;
    private String message;

    public FieldMessage(String fieldName, String message) {
        this.fielName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fielName;
    }

    public String getMessage() {
        return message;
    }
}