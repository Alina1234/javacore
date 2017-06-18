package com.alina1234.runners;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by agr on 3/23/2017.
 */
public class Lesson6Runner {
    public static void main(String[] args) {
        /** Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a1 = scanner.nextInt();
        System.out.println("Enter number 2:");
        int a2 = scanner.nextInt();
        do {
            System.out.println(a1);
            System.out.println(a2);
        }
        while (a1 >= a2);

        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        int a = 1;
        System.out.println("Oriiginal a value " + a);
        System.out.println("Post-incriment a " + a++);
        System.out.println("After post-incriment" + a);
        System.out.println("Pre-increment a " + ++a);
        System.out.println("After pre-increment " + a);

        int count = 0;
        for (int i = 0; i<=20; i++){
            if (i%2==0){
                count++;
            }
        }

        System.out.println(count);

        System.out.println(b);*/

        int[] a = {5,4,7,4,5,12,5,1128,9,1,6,7};
        //for (int i=0; i<a.length; i++) {
            //System.out.println(a[i]);
        //}
        int k = 0;
        int j=0;
        int min = a[0];
        for (int i=0; i<a.length; i++){
            if (min > a[i])
            {min = a[i];
            j = i;}
            k++;
        }

        if (j!=0){
            int mid = a[0];
            a[0]=min;
            a[j]=mid;
        }

        //System.out.println(min);
        System.out.println(Arrays.toString(a));

/**
 * worked code, but try to decriase amont of count
        min = a[0];
        int count = 0;
        for (int i=0; i<a.length; i++){
            for (int j=i; j<a.length; j++) {
                if (a[i] > a[j]) {
                    min = a[j];
                    a[j]=a[i];
                    a[i]=min;

                }
                count++;

            }
        }
 */
        int mid;

        while (k < a.length){
            if (a[k] > a[k+1]) {
                mid = a[k + 1];
                a[k+1]=a[k];
                a[k]=mid;
            }

            k++;
        }

        for (int i=0; i<a.length; i++){

        }

        for (int i = 0; i<a.length; i++)
        {System.out.println(a[i]);}

        //int[] arr2 = new int[3]
        //int[][]arr2 = new int[4][4]

        boolean[] boolArray = {true, false, false, true};
        for (int i = 0; i < boolArray.length; i++)
        {
            System.out.println(boolArray[i]);
        }

        char[] charArray = {'a', 'a', 'b'};
        for (int i=0; i < charArray.length; i++)
        {
            System.out.println(charArray[i]);
        }

        double[] doubleArray = {1.0, 3.5, 4.6778};
        for (int i=0; i < doubleArray.length; i++)
        {
            System.out.println(doubleArray[i]);
        }

        System.out.println(Arrays.toString(boolArray));

       // System.out.println(count1);
        //System.out.println(b);
        System.out.println(k);

    }
}
