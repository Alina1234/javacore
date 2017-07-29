package com.alina1234.app.homework.lesson11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by agr on 7/29/2017.
 */
public class PropertyFile {
    public static void propFile(){
        Properties prop = new Properties();
        OutputStream output = null;
        Scanner scanner = new Scanner(System.in);

        try {

            output = new FileOutputStream("config.properties");

            System.out.println("Enter your 'key, value' : ");
            //set user's properties value
            String str;
            str = scanner.nextLine();
            String strKey;
            String strValue;
            while (!(str.equals(""))){
                //text.append(str);
                //text.append("\r\n");
                int i = str.indexOf(",");
                strKey = str.substring(0,i);
                strValue = str.substring(i+2);
                prop.setProperty(strKey,strValue);
                str = scanner.nextLine();
            }

            // set the properties value
            //prop.setProperty("database", "localhost");
            //prop.setProperty("dbuser", "mkyong");
            //prop.setProperty("dbpassword", "password");

            // save properties to project root folder
            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
