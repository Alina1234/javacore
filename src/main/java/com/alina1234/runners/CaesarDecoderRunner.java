package com.alina1234.runners;

/**
 * Created by agr on 5/18/2017.
 */
public class CaesarDecoderRunner {
    public static void main(String[] args) {
        String abc = "abcdet";
        String original = "cat";
        String res = "";
        int shift = 5;
        for (int i = 0; i < original.length(); i++){
            char b = original.charAt(i);
            for (int j = 0; j < abc.length(); j++){
                if (b == abc.charAt(j)){
                    res += abc.charAt((j+shift)% abc.length());
                }
            }
        }
        System.out.println(res);
    }

    //endcoding

}
