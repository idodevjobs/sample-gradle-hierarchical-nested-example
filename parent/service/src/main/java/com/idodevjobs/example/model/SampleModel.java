package com.idodevjobs.example.model;

public class SampleModel {
    private String message;
    private int id;

    public SampleModel() {
    }

    public SampleModel(String message, int id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
