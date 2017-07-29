package com.alina1234.app.homework.lesson11;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.*;
import java.util.Arrays;

/**
 * Created by agr on 7/19/2017.
 */
public class FilesWork {

    public static StringBuilder readFile(String file_name) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        String line;
        StringBuilder sb_line = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb_line.append(line);
            sb_line.append("\r\n");
        }
        return sb_line;
    }

    public static Integer[][] convertInt(StringBuilder sb_line){
        String line = sb_line.toString();

        //split lines to different arrays
        String [] lines = line.split("\r\n");

        System.out.println(Arrays.toString(lines));

        Integer [][] intArr = new Integer[lines.length][];

        String [] oneLine;

        for (int i = 0; i < lines.length; i++){
            oneLine = lines[i].split(",");

            Integer [] helpInt = new Integer[oneLine.length];
            int k = 0;
            for (String str:oneLine){
                try {
                    helpInt[k] = Integer.parseInt(str);
                    k++;
                }

                catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Not a number: " + str + " at index " + i, e);
                }
            }

            System.out.println(Arrays.toString(helpInt));

            for (int j = 0; j < helpInt.length; j ++){
                intArr[i] = helpInt;
            }
        }

        return intArr;

    }

    public static String[] convertLine(StringBuilder sb_line){
        String line = sb_line.toString();

        String [] lines = line.split("\r\n");
        return lines;
    }

    public static Integer[][] sorting(Integer[][] intArr){
        for (int n = 0; n < intArr.length; n++){
            boolean flag = true;
            while (flag) {
                flag = false;
                for (int i=0; i<intArr[n].length - 1; i++){
                    if (intArr[n][i] > intArr[n][i+1]){
                        int helpInt;
                        helpInt = intArr[n][i];
                        intArr[n][i] = intArr[n][i+1];
                        intArr[n][i+1] = helpInt;
                        flag = true;
                    }

                }
            }
        }

        for (int i = 0; i < intArr.length; i++){
            for (int j = 0; j< intArr[i].length; j++){
                System.out.println(intArr[i][j]+ " ");
            }
            System.out.println("\r\n");
        }

        return intArr;
    }

    public static String intToString(Integer[][] intArr){
        StringBuilder finalStr = new StringBuilder();
        for (int n = 0; n < intArr.length; n++){
            String str = Arrays.toString(intArr[n]);
            finalStr.append(str);
            finalStr.append("\r\n");
        }
        System.out.println(finalStr);
        return  finalStr.toString();
    }

    public static String palindrome(String [] line){

        StringBuilder newTempSt = new StringBuilder();
        for (int i = 0; i<line.length; i++) {
            StringBuilder tempSt = new StringBuilder();
            String oldLine;
            String newLine;
            oldLine = line[i];
            newLine = oldLine.toLowerCase();
            tempSt.append(newLine);
            int ln = tempSt.length();
            int helper = 0;
            if (ln % 2 == 0) {
                for (int j = 0; j < ln/2; j++) {
                    if (tempSt.charAt(j) == tempSt.charAt(ln - j - 1)) {
                        helper++;
                    }
                }
                helper = helper * 2;
            }
            else {
                for (int n = 0; n < (ln -1)/2; n++){
                    if (tempSt.charAt(n) == tempSt.charAt((ln - n -1))){
                        helper++;
                    }
                }
                helper = helper * 2 + 1;
            }
            if (helper == ln) {
                newTempSt.append(oldLine);
                newTempSt.append(" - palindrome\r\n");
            }
            else {
                newTempSt.append(oldLine);
                newTempSt.append(" - not palindrome\r\n");
            }

        }
        return  newTempSt.toString();
    }

    public static void writeFile(String line, String file) throws IOException{
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(file)
                )
        );
        writer.append(line);
        writer.newLine();
        writer.close();

    }

}
