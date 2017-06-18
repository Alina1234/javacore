package com.alina1234.app.homework.lesson12;

/**
 * Created by agr on 6/18/2017.
 */
public class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        setAge(age);
    }

    public String getName(){
       return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int userAge){
        if ((userAge < 120) && (userAge > 0)){
            this.age = userAge;
            System.out.println("New age setted");
        }
        else
            System.out.println("Age invalid");
    }


}
