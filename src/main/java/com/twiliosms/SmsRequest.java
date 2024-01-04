package com.twiliosms;




public class SmsRequest {

    private String to;
    private String message;

    // Default constructor for JSON deserialization
    public SmsRequest() {
    }

    public SmsRequest(String to, String message) {
        this.to = to;
        this.message = message;
    }

    // Getters and setters

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SmsRequest{" +
                "to='" + to + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}


