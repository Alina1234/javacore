package com.alina1234.app.homework.lesson11;

import java.io.*;
import java.util.Scanner;

/**
 * Created by agr on 7/22/2017.
 */
public class UserFile {
    public static String userFile() {
        String fileName;
        System.out.println("Please, enter file name: ");
        Scanner scanner = new Scanner(System.in);
        return fileName = scanner.next();


    }

    public static String userText(){
        System.out.println("Enter your text, write 'exit' for finish:");
        Scanner scanner = new Scanner(System.in);
        String str;
        StringBuilder text = new StringBuilder();
        str = scanner.next();
        while (!(str.equals("exit"))){
            text.append(str);
            text.append("\r\n");
            str = scanner.next();
        }
        return text.toString();
    }

    public static void saveUserText(String file, String text) throws IOException{
        String userFile;
        userFile = "D:\\" + file + ".txt";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(userFile)
                )
        );
        writer.append(text);
        writer.newLine();
        writer.close();

    }
}
