package com.alina1234.app.homework.lesson14;

/**
 * Created by agr on 6/22/2017.
 */

//runner is in runners/homework/Lesson14Runner
public class CustomBicycle extends Bicycle {
    public int speed;
    public int gear;

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("Speed: " + this.speed);
    }

    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println("Gear: " + this.gear);
    }

    @Override
    public void ride(){
        System.out.println("Wshhhh!");
    }
}
