package com.pluralsight.classDemo1.service;

public class StudentAlreadyRegisteredException extends RuntimeException {
    public StudentAlreadyRegisteredException(String message) {
        super(message);
    }

    public StudentAlreadyRegisteredException(){
        super("Student is already registered!");
    }
}
