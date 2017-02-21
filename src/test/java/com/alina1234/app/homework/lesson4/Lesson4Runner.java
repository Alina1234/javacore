package com.alina1234.app.homework.lesson4;

import com.alina1234.app.classwork.lesson4.CircleArea;
import com.alina1234.app.classwork.lesson4.OddNumber;
import com.alina1234.app.classwork.lesson4.TriangleLine;

import java.util.Scanner;

/**
 * Created by agr on 2/20/2017.
 */
public class Lesson4Runner {
    public static void main(String[] args) {
        int choose = 0;
        do {
            inputMethod();
            Scanner scanner = new Scanner (System.in);
            choose = scanner.nextInt();
            if (choose == 1) CircleArea.calculateBigger();
            else if (choose == 2) calculateIsRightTriangle();
            else if (choose == 3) calculateOddEven();
            else if (choose == 0);
            else System.out.println("Please, enter number from 1 till 3");
        }
        while (choose != 0);
    }

    public static void inputMethod() {
        System.out.println("---------------------------------");
        System.out.println("Hello! There is list of methods:");
        System.out.println("---------------------------------");
        System.out.println("|1|    What circle is more?      |");
        System.out.println("|2|    Is it right triangle?     |");
        System.out.println("|3|   Is number odd or even?     |");
        System.out.println("---------------------------------");
        System.out.println("|0| for exit");
        System.out.println("Please, choose a number of method for it execution: ");
    }

    public static void calculateOddEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scanner.nextInt();
        OddNumber number = new OddNumber();
        if (number.isOdd(a)) System.out.println("it is Odd");
        else System.out.println("it is Even");
    }

    public static void calculateIsRightTriangle(){
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
