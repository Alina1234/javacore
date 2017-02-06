package com.alina1234.app;

/**
 * Created by agr on 2/2/2017.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 300000000000f;

    public void narrowing(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}
