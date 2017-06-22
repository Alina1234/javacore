package com.alina1234.runners.homework;

import com.alina1234.app.homework.lesson14.Bicycle;
import com.alina1234.app.homework.lesson14.BicycleWithRing;
import com.alina1234.app.homework.lesson14.CustomBicycle;

/**
 * Created by agr on 6/22/2017.
 */
public class Lesson14Runner {

    public static void main(String[] args) {
        BicycleWithRing mintBike = new BicycleWithRing();
        mintBike.ring();

        Bicycle roseBike = new CustomBicycle();
        roseBike.setGear(88);
        roseBike.setSpeed(222);
        roseBike.ride();
    }

}
