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
        StringBuilder task1 = fileWork.readFile("D:\\homework10_1.txt");

        Integer [][] arr = FilesWork.convertInt(task1);
        Integer [][] sortArr = FilesWork.sorting(arr);

        String sortedStr = FilesWork.intToString(sortArr);
        FilesWork.writeFile(sortedStr, "D:\\homework10outputTask1.txt");

        StringBuilder task2 = fileWork.readFile("D:\\homework10_2.txt");
        String [] str = FilesWork.convertLine(task2);

        String newStr;
        newStr = FilesWork.palindrome(str);
        System.out.println(newStr);
        FilesWork.writeFile(newStr, "D:\\homework10outputTask2.txt");

        String file;
        String text;
        UserFile fileUser = new UserFile();
        text = fileUser.userText();
        file = fileUser.userFile();
        fileUser.saveUserText(file, text);

        PropertyFile property = new PropertyFile();
        property.propFile();

    }
}
