package com.alina1234.app.classwork.lessonOOP;

/**
 * Created by agr on 6/1/2017.
 */
public class Teacher extends Person{

private String university;

    public Teacher (String name, String university){
        super(name);
        this.university = university;
    }

    public String lessonFinished(){
        return "Do not forget to make homework!";
    }
}
