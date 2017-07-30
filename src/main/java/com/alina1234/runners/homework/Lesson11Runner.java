package com.alina1234.runners.homework;

import com.alina1234.app.homework.lesson11.FilesWork;
import com.alina1234.app.homework.lesson11.PropertyFile;
import com.alina1234.app.homework.lesson11.UserFile;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by agr on 7/19/2017.
 */
public class Lesson11Runner {
    public static void main(String[] args) throws IOException {
        FilesWork fileWork = new FilesWork();








        System.out.println("This is homework 11. Choose 1 of 4 task.");
        System.out.println("1: read from file, sort, write to other file");
        System.out.println("2: palindrome (read from file, write to file");
        System.out.println("3: write to your file");
        System.out.println("4: property file");

        int choose;
        Scanner scanner = new Scanner(System.in);
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                StringBuilder task1 = fileWork.readFile("D:\\homework10_1.txt");

                Integer [][] arr = FilesWork.convertInt(task1);
                Integer [][] sortArr = FilesWork.sorting(arr);

                String sortedStr = FilesWork.intToString(sortArr);
                FilesWork.writeFile(sortedStr, "D:\\homework10outputTask1.txt");
                break;

            case 2:
                StringBuilder task2 = fileWork.readFile("D:\\homework10_2.txt");
                String [] str = FilesWork.convertLine(task2);

                String newStr;
                newStr = FilesWork.palindrome(str);
                System.out.println(newStr);
                FilesWork.writeFile(newStr, "D:\\homework10outputTask2.txt");
                break;

            case 3:
                String file;
                String text;
                UserFile fileUser = new UserFile();
                text = fileUser.userText();
                file = fileUser.userFile();
                fileUser.saveUserText(file, text);
                break;

            case 4:
                PropertyFile property = new PropertyFile();
                property.propFile();
                break;
        }

    }
}
