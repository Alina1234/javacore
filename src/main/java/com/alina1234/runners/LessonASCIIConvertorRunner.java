package com.alina1234.runners;

import java.util.Arrays;

/**
 * Created by agr on 4/20/2017.
 */
public class LessonASCIIConvertorRunner {
    public static void main(String[] args) {
        char [] a = new char [128];
        for (int i= 0; i<a.length; i++){
            a[i]= (char)i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a);
    }
}
