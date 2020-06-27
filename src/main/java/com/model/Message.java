package com.model;

public class Message {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}