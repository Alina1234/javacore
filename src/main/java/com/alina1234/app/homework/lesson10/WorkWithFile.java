package com.alina1234.app.homework.lesson10;

import java.io.*;
import java.util.Arrays;

/**
 * Created by agr on 7/15/2017.
 */
public class WorkWithFile {

    public static String readFromFile(String file_name) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        String line;
        StringBuilder sb_line = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            //System.out.println(line);
            sb_line.append(line);
            int i = sb_line.length();
            if (sb_line.charAt(i-1) != ','){
                sb_line.append(',');
            }
        }
        reader.close();
        return  sb_line.toString();
    }

    public static Integer[] convertToInt() throws IOException {
        String [] lineArray = readFromFile("D:\\homework10.txt").split(",");
        Integer [] intArray = new Integer[lineArray.length];
        int i = 0;
        for (String str:lineArray){
            try {
                intArray[i] = Integer.parseInt(str);
                i++;
            }
            catch (NumberFormatException e){
                throw new IllegalArgumentException("Not a number: " + str + " at index " + i, e);
            }
        }

        return intArray;
    }

    public static String[] convertToLines() throws  IOException {
        String [] strArray = readFromFile("D:\\homework10_2.txt").split("\r\n");
        return  strArray;
    }

    public static String sortingIntToString(Integer arrayInt []) {
        String line = "";
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i=0; i<arrayInt.length - 1; i++){
                if (arrayInt[i] > arrayInt[i+1]){
                    int helpInt;
                    helpInt = arrayInt[i];
                    arrayInt[i] = arrayInt[i+1];
                    arrayInt[i+1] = helpInt;
                    flag = true;
                }

            }
        }

        line = Arrays.toString(arrayInt);
        return line;
    }

    public static void writeToFile(String line) throws IOException{
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("D:\\homework10output.txt")
                )
        );
        writer.append(line);
        writer.newLine();
        writer.close();
    }

}
