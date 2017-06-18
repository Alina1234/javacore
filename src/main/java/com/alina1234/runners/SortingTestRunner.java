package com.alina1234.runners;

import java.util.Arrays;

/**
 * Created by agr on 4/1/2017.
 */
public class SortingTestRunner {
    public static void main(String[] args) {
        int[] a = {5,4,7,4,5,12,5,1128,9,1,6,7};
        //sorting1(a);
        sorting2(a);
    }
    public static void sorting1(int[] a){
        int min;
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
        System.out.println("Sorting 1:");
        System.out.println(Arrays.toString(a));
        System.out.println("count is " + count);
    }

    public static void sorting2 (int[] a){
        int min;
        min = a[0];
        int count =0;
        int index =0;
        for (int i = 0; i<a.length; i++){
            if (min > a[i]){
                min = a[i];
                index = i;
            }
            count++;
        }
        System.out.println(index);
        if (index != 0){
            int mid = a[0];
            a[0] = a[index];
            a[index] = mid;
        }
        System.out.println(Arrays.toString(a));

        int m;
        for (int i = 0; i< a.length-1; i++){
            if (a[i] > a[i+1]){
                m = a[i];
                a[i] = a[i+1];
                a[i+1] = m;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
