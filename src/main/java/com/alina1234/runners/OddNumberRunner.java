package com.alina1234.runners;

import com.alina1234.app.classwork.lesson4.OddNumber;
import com.alina1234.app.classwork.lesson4.TriangleLine;

import java.util.Scanner;

/**
 * Created by agr on 3/2/2017.
 */
public class OddNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = scanner.nextInt();
        OddNumber number = new OddNumber();
        if (number.isOdd(a)) System.out.println("it is Odd");
        else System.out.println("it is Even");
    }
}
