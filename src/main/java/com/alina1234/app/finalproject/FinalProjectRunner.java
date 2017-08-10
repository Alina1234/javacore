package com.alina1234.app.finalproject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created by agr on 8/7/2017.
 */
public class FinalProjectRunner {
    public static void main(String[] args) throws IOException {
        /** write to csv
        try {
            WriteCSV.addNewRecord();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

        //read from csv
        //ReadCSV.readFromFile();


        //delete record
        //WriteCSV.deleteRecord();

        //update record
        //WriteCSV.updateRecord();
        int choose = 0;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Do your choose: ");

            System.out.println("1. Add new record");
            System.out.println("2. Delete record");
            System.out.println("3. Update record");
            System.out.println("4. View file");
            System.out.println("0. EXIT");

            choose = scanner.nextInt();

            switch (choose){
                case 1:
                    WriteCSV.addNewRecord();
                    break;
                case 2:
                    WriteCSV.deleteRecord();
                    break;
                case 3:
                    WriteCSV.updateRecord();
                    break;
                case 4:
                    ReadCSV.readFromFile();
                    break;
                case 0:
                    break;
            }
        }
        while (choose != 0);






    }
}
