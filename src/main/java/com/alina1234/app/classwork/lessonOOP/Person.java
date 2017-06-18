package com.alina1234.app.classwork.lessonOOP;

import java.util.Calendar;

/**
 * Created by agr on 6/1/2017.
 */
public class Person {

    protected String name;
    public Person (String name){
        this.name = name;
    }

    public Person() {

    }

    public String getResponse(String question){
        return "My answer is " + question;
    }
}
