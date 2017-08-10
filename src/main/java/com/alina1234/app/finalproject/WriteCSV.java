package com.alina1234.app.finalproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Created by agr on 8/7/2017.
 */
public class WriteCSV {

    private static String firstRow;

    public static void addNewRecord() throws IOException {

        //true need for adding next text for existing
        FileWriter pw = new FileWriter("D:\\finalproject.csv",true);
        StringBuilder sb = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter middle name:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter last name:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter date of birth:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter faculty:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter address:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter phone:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter course:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter qualification:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter postion:");
        sb.append(scanner.nextLine());
        sb.append(',');

        System.out.println("Enter cabinet:");
        sb.append(scanner.nextLine());
        sb.append(',');

        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }

    public static void updateRecord() throws IOException {

        //Save data from file to List
        List<String> record = WriteCSV.csvToList();

        //Show .csv file for user
        Scanner scanner = new Scanner(System.in);
        ReadCSV.readFromFile();
        int choose;
        do {
            System.out.println("Choose number line for update:");
            choose = scanner.nextInt();
        }
        while ((choose <= 0) || (choose > record.size()));
        //scanner.close();

        System.out.println("Ok! Let's update:");

        StringBuilder sb = new StringBuilder();
        System.out.println("Enter first name:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter middle name:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter last name:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter date of birth:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter faculty:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter address:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter phone:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter course:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter qualification:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter postion:");
        sb.append(scanner.next());
        sb.append(',');

        System.out.println("Enter cabinet:");
        sb.append(scanner.next());
        sb.append(',');

        //sb.append('\n');
        scanner.close();

        record.remove(choose-1);
        record.add(choose-1, sb.toString());
        record.add(0,firstRow);

        for (int j=0; j<record.size(); j++){
            System.out.println(record.get(j));
        }
        WriteCSV.listToCSV(record);

    }

    public static List<String> csvToList () throws FileNotFoundException {
        //save data from file
        Scanner scanner1 = new Scanner(new File("D:\\finalproject.csv"));
        List<String> record = new ArrayList<String>();
        int i = 0;
        firstRow = scanner1.nextLine();
        while(scanner1.hasNextLine()){
            record.add(i,scanner1.nextLine());
            i++;
        }
        scanner1.close();
        return record;
    }

    public static void listToCSV(List<String> record) throws IOException {
        FileWriter pw = new FileWriter("D:\\finalproject.csv");
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j< record.size(); j++){
            sb.append(record.get(j));
            sb.append("\r\n");
        }
        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }

    public static void deleteRecord() throws IOException {

        //Save data from file to List
        List<String> record = WriteCSV.csvToList();

        //Show .csv file for user
        Scanner scanner = new Scanner(System.in);
        ReadCSV.readFromFile();
        int choose;
        do {
            System.out.println("Choose number line for delete:");
            choose = scanner.nextInt();
        }
        while ((choose <= 0) || (choose > record.size()));
        scanner.close();


        //delete number from List
        record.remove(choose-1);

        record.add(0,firstRow);


        for (int j=0; j<record.size(); j++){
            System.out.println(record.get(j));
        }

        WriteCSV.listToCSV(record);
    }
}
