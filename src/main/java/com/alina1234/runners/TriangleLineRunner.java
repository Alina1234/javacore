package com.alina1234.runners;

import com.alina1234.app.classwork.lesson4.TriangleLine;

import java.util.Scanner;

/**
 * Created by agr on 3/2/2017.
 */
public class TriangleLineRunner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line1: ");
        int line1 = scanner.nextInt();
        System.out.println("Enter line2: ");
        int line2 = scanner.nextInt();
        System.out.println("Enter line3: ");
        int line3 = scanner.nextInt();
        TriangleLine test = new TriangleLine();
        boolean result = test.rightTriangle(line1, line2, line3);
        if (result) {
            System.out.println("Triangle is right");
        }
        else System.out.println ("Triangle isn't right");


    }
}
