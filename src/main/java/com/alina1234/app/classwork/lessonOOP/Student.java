package com.alina1234.app.classwork.lessonOOP;

/**
 * Created by agr on 6/1/2017.
 */
public class Student extends Person{

    private String university;

    public Student (String name, String university){
        super(name);
        this.university = university;
    }

    @Override
    public String getResponse(String question){
        return "Ehhh, what was the question?";
    }
}
