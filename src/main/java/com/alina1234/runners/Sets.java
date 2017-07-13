package com.alina1234.runners;

import java.util.*;

/**
 * Created by agr on 6/27/2017.
 */
public class Sets {
    public static void main(String[] args) {
        List<String> t1 = new ArrayList<>();
        t1.add("a");
        t1.add("c");
        t1.add("a");
        t1.add("b");

        Set<String> s1 = new HashSet<>(t1);

        for (String s: s1){
            System.out.println(s);
        }

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Google", 800);
        Map<String, List<String>> m2 = new HashMap<>();
        m2.put("Google",t1);
        //List<String> m2 = Map m1.()
        System.out.println(m2.get("Google"));
    }
}
