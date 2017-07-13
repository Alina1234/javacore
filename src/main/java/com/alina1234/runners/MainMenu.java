package com.alina1234.runners;

import com.alina1234.app.classwork.lesson3.MathFunc;
import com.alina1234.runners.homework.Lesson12Runner;
import com.alina1234.runners.homework.Lesson14Runner;

import java.util.Scanner;

/**
 * Created by agr on 7/13/2017.
 */
public class MainMenu {
    public static void main(String[] args) {
        int userChoose;
        userChoose = inputMethod();
        chooseMethod(userChoose);
    }

    public static int inputMethod(){

        System.out.println("Choose number of lesson:");
        Scanner scanner = new Scanner (System.in);
        int choose = scanner.nextInt();
        return choose;
    }

    public static void chooseMethod(int choose){

        switch (choose){
            case 3:
                Lesson3Runner.main(null);
                break;
            case 4:
                CircleAreaRunner.main(null);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                Lesson12Runner.main(null);
                break;
            case 13:
                Lesson12Runner.main(null);
                break;
            case 14:
                Lesson14Runner.main(null);
                break;
            case 15:
                break;
            case 16:
                break;
            default: System.out.println("You have made incorrect choice");
        }

    }
}
