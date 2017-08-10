package com.alina1234.app.finalproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by agr on 8/8/2017.
 */
public class ReadCSV
{
    public static void readFromFile() throws FileNotFoundException {
        //read data from file
        Scanner scanner = new Scanner(new File("D:\\finalproject.csv"));
        //scanner.useDelimiter(",");
        System.out.print("   " + scanner.nextLine()+"\r\n");
        int n = 1;
        while(scanner.hasNextLine()){
            System.out.print(n + ". " + scanner.nextLine()+"\r\n");
            n++;
        }
        scanner.close();
    }

}
