package com.alina1234.runners;

import com.alina1234.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by agr on 2/6/2017.
 */
public class Lesson3Runner {
    public static void main (String args[]){
        PrimitiveConvertor convertion = new PrimitiveConvertor();
        float myFlo = 64.0f;
        int myIn = 66;
        char myCh = 'Y';

        System.out.println("input float value is " + myFlo + ". Output char value is " + convertion.floatToChar(myFlo));
        System.out.println("Input int value is " + myIn + ". Output char value is " + convertion.intToChar(myIn));
        System.out.println("Input char value is " + myCh + ". Output int value is " + convertion.charToInt(myCh));
    }
}
