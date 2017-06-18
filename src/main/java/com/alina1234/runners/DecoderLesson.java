package com.alina1234.runners;

/**
 * Created by agr on 5/16/2017.
 */
public class DecoderLesson {
    public static void main(String[] args) {
        String original = "ABC";
        String decoded = "EFD";
        String toDecode = "CAB";
        String result = "";
        for (int k = 0; k < toDecode.length(); k++){
            char a = toDecode.charAt(k);
            for (int g = 0; g < original.length(); g++){
                if (a == original.charAt(g)){
                    result += decoded.charAt(g);
                    break;
                }
            }

        }
        System.out.println(result);

        //decoding
        String b = "";
        String result1 = "DEF";
        for (int k = 0; k < toDecode.length(); k++){
            char a = result1.charAt(k);
            for (int g = 0; g < decoded.length(); g++){
                if (a == decoded.charAt(g)){
                    b += original.charAt(g);
                    break;
                }
            }

        }
        System.out.println(b);
    }
}
