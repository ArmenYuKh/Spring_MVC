package com.itvdn.lesson7.dto;

public class RequestBodyResponse {
    private String nameWithID;

    public RequestBodyResponse(String nameWithId) {
        this.nameWithID = nameWithId;
    }

    public String getNameWithID() {
        return nameWithID;
    }
}
