package com.alina1234.runners;

import java.io.*;

/**
 * Created by agr on 5/23/2017.
 */
public class Lesson10WriteToFile {
    public static void main(String[] args) throws IOException {
        String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(
                    new FileOutputStream("D:\\output.txt")
            )
        );
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();

    }
}
