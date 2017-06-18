package com.alina1234.app.homework.Lesson6;

import com.alina1234.app.classwork.lesson3.MathFunc;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;

/**
 * Created by agr on 4/3/2017.
 */
public class Lesson6Homeworks {
    public static void main(String[] args) {
        //create array
        int arr1[] = new int[10];
        arr1[0] = 2;
        for (int i = 1; i<arr1.length; i++)
        {arr1[i]= arr1[i-1]+2;}

        //print in line;
        for (int i=0; i<arr1.length; i++)
        {
            System.out.printf(String.valueOf(arr1[i]) + ' ');
        }
        System.out.println();

        //printing in colomns;
        for (int i=0; i<arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }

        //create array
        int[] arr2 = new int[50];
        arr2[0] = 1;
        for (int i = 1; i< arr2.length; i++){
            arr2[i]=arr2[i-1]+2;
        }
        //System.out.println(Arrays.toString(arr2));
        //print in line;
        for (int i=0; i<arr2.length; i++)
        {
            System.out.printf(String.valueOf(arr2[i]) + ' ');
        }
       // System.out.println();

        //print in colomn vise versa

        int j = arr2.length-1;
        while (j >= 0) {
            System.out.println(arr2[j]);
            j--;
        }

        //create array
        int[] arr3 = new int [15];
        for (int i=0; i<arr3.length; i++){
            arr3[i] = (int) (Math.random() * 9);
        }

        System.out.println(Arrays.toString(arr3));

        int amount = 0;
        for (int i = 0; i< arr3.length; i++){
           if (arr3[i]%2 == 0) {
               amount++;
           }
        }
        System.out.println("Amount of even is "+ amount);

        int [] arr4 = new int [15];
        for (int i=0; i< arr4.length; i++){
            arr4[i] = (int) (Math.random() * 999);
        }
        System.out.println(Arrays.toString(arr4));

        //find min and max
        int min = arr4[0];
        int max = arr4[0];
        for (int i=0; i< arr4.length; i++){
            if (min > arr4[i]) {
                min = arr4[i];
            }
            if (max < arr4[i]){
                max = arr4[i];
            }
        }
        System.out.println("min is " + min);
        System.out.println("max is " + max);

        //create array
        int[][] arr5 = new int [8][5];
        for (int i=0; i<arr5.length; i++){
            for (int k=0; k<arr5[i].length; k++){
                arr5[i][k] = 10 + (int) (Math.random() * 89);
            }
        }

        for (int i = 0; i< arr5.length; i++){
            System.out.println(Arrays.toString(arr5[i]));
        }

    }
}
