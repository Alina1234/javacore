package com.alina1234.runners;

import com.alina1234.app.NarrowingCasting;
import com.alina1234.app.WideningCasting;

import java.util.Scanner;

/**
 * Created by agr on 2/2/2017.
 */
public class WideningCastingRunner {

    public static void main(String[] agrs){
        WideningCasting casting1 = new WideningCasting();
        casting1.widening();

        System.out.println("Enter float:");
        Scanner scanner = new Scanner(System.in);
        float flo = scanner.nextFloat();
        NarrowingCasting narrowing1 = new NarrowingCasting();
        narrowing1.narrowing(flo);
    }
}
