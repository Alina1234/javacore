package com.alina1234.runners;

import java.util.DoubleSummaryStatistics;

/**
 * Created by agr on 4/25/2017.
 */
public class Lesson9Runner {
    public static void main(String[] args) {
        int intValue = 15560;
        String intSt = String.valueOf(intValue);
        int intValue1 = Integer.valueOf(intSt);
        System.out.println(intValue);
        System.out.println(intValue1);

        double doubleValue = 154545448d;
        String doubleSt = String.valueOf(doubleValue);
        double doubleValue1 = Double.valueOf(doubleSt);
        System.out.println(doubleValue);
        System.out.println(doubleValue1);

        String longSt = "1487454512455455";
        long longValue = Long.valueOf(longSt);
        System.out.println(longValue);


    }
}
