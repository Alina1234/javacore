package com.alina1234.app.homework.lesson14;

/**
 * Created by agr on 6/22/2017.
 */
abstract public class Bicycle {

    public void ride(){
        System.out.println("Wrooom!");
    }

    abstract public void setSpeed(int speed);

    abstract public void setGear(int gear);
}
