package com.alina1234.runners.homework;

import com.alina1234.app.homework.lesson10.WorkWithFile;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by agr on 7/17/2017.
 */
public class Lesson10Runner {
    public static void main(String[] args) throws IOException {
        String line;
        WorkWithFile line_file = new WorkWithFile();
        line = line_file.readFromFile("D:\\homework10.txt");
        System.out.println(line);

        Integer [] arrInt = line_file.convertToInt();
        System.out.println(arrInt);


        String test;
        test = WorkWithFile.sortingIntToString(arrInt);
        System.out.println(test);

        WorkWithFile.writeToFile(test);

        line = line_file.readFromFile("D:\\homework10_2.txt");

        System.out.println(line);

        String [] arrStr = line_file.convertToLines();

        System.out.println(Arrays.toString(arrStr));

    }}