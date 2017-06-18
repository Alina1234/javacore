package com.alina1234.runners;

import java.util.Arrays;

/**
 * Created by agr on 4/18/2017.
 */
public class SortingRunner {
    public static void main(String[] args) {
        int amount = 0;
        int [] a = {14,5,88,8,4,44,-7,0,0,0,0,1};
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i=0; i<a.length-1; i++)
            {
                if (a[i]>a[i+1]){
                    amount++;
                    int b = a[i];
                    a[i] = a[i+1];
                    a[i+1]=b;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(a));

        }
        System.out.println(amount);

    }

}
