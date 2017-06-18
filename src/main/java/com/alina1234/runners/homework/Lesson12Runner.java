package com.alina1234.runners.homework;

import com.alina1234.app.homework.lesson12.Human;
import com.alina1234.app.homework.lesson12.WhiteCollar;

import java.util.Scanner;

/**
 * Created by agr on 6/18/2017.
 */
public class Lesson12Runner {
    public static void main(String[] args) {
        //Human user1 = new Human("Alina",19);
        //Human user2 = new Human("Lida", 128);

        //WhiteCollar user3 = new WhiteCollar("Ksenia", 55,"Ciklum");
        //WhiteCollar user4 = new WhiteCollar("Angela", -5, "Ciklum");
        //WhiteCollar user5 = new WhiteCollar("Irina",22,"user42");

        String username;
        int userage;
        String usercompany;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User's name:");
        username = scanner.next();

        System.out.println("Enter User's age:");
        userage = scanner.nextInt();

        System.out.println("Enter User's company");
        usercompany = scanner.next();

        WhiteCollar user6 = new WhiteCollar(username, userage, usercompany);

    }
}
