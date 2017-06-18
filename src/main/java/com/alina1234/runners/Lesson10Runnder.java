package com.alina1234.runners;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by agr on 5/18/2017.
 */
public class Lesson10Runnder {
    public static String FILENAME = "D:\\input.txt";
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader(FILENAME));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();


/**
        BufferedReader br = null; FileReader fr = null; String sCurrentLine;

        try {
            br = new BufferedReader(new FileReader(FILENAME));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Your file is not found " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) { br.close();}
                if (fr != null) { fr.close();}
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
*/
    }


}
