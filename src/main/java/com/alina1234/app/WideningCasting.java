package com.alina1234.app;

/**
 * Created by agr on 2/2/2017.
 */
public class WideningCasting {
        byte byte1 = 127;
        short short1 = 0;
        int int1 = 0;
        long long1 = 0L;
        float float1 = 0.0f;
        double double1 = 0.0d;
        //correct conversion 64f<=32f<64<=32<=16<=8
        public double widening(){
            double1 = float1 = long1 = int1 = short1 = byte1;
            System.out.println(double1);
            return double1;
        }
}
