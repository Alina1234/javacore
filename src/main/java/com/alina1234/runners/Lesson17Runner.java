package com.alina1234.runners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by agr on 6/27/2017.
 */
public class Lesson17Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String word = "";
        List<String> wordArray = new ArrayList<String>();
        int i = 0;
        while (!word.equals("0")) {
            System.out.println("Enter word or 0 for exit:");
            word = scanner.next();
            wordArray.add(i,word);
            i++;
        }

        for (int j = 0; j < (wordArray.size()- 1); j++){
            System.out.println(wordArray.get(j));
        }
    }
}
