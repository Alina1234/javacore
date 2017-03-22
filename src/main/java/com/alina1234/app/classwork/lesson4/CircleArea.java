package com.alina1234.app.classwork.lesson4;

/**
 * Created by agr on 2/14/2017.
 */
public class CircleArea {
    public static double calculate(double radius){

        return Math.PI * radius * radius;
    }

    public static String calculateBigger(double radius1, double radius2){

        double circleArea1 = calculate(radius1);
        double circleArea2 = calculate(radius2);
        String resultArea;

        if (circleArea1 > circleArea2)
            return  resultArea = "Area 1 is bigger";

        else if (circleArea1 < circleArea2)
            return resultArea = "Area 2 is bigger";

        else
            return resultArea = "Area 1 is the same area 2";
    }
}
