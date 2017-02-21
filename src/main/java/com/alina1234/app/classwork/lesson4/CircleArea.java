package com.alina1234.app.classwork.lesson4;

import java.util.Scanner;

/**
 * Created by agr on 2/14/2017.
 */
public class CircleArea {
    public static void calculate(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area is " + circleArea);
    }

    public static void calculateBigger(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter radius1: ");
        double radius1 = scanner.nextDouble();
        System.out.println("Enter radius2: ");
        double radius2 = scanner.nextDouble();
        double circleArea1 = Math.PI * radius1 * radius1;
        double circleArea2 = Math.PI * radius2 * radius2;
        if (circleArea1 > circleArea2)
            System.out.print("Area 1 is bigger");
        else if (circleArea1 < circleArea2)
            System.out.print("Area 2 is bigger");
        else
            System.out.print("Area 1 is the same area 2");
    }
}
