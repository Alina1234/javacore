package com.alina1234.runners;

import com.alina1234.app.classwork.lesson4.CircleArea;

import java.util.Scanner;

/**
 *
 */
public class CircleAreaRunner {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter radius1: ");
        double radius1 = scanner.nextDouble();

        System.out.println("Enter radius2: ");
        double radius2 = scanner.nextDouble();

        System.out.println(CircleArea.calculateBigger(radius1, radius2));
    }

}