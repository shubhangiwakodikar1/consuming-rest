package com.example.consumingrest;

import java.util.StringTokenizer;

public class FindAcronym {
    public static void main(String[] args) {
        String sentence = "Java runtime engine";

        StringTokenizer stringTokenizer = new StringTokenizer(sentence, " ");
        String returnAcronym = "";
        String nextToken;
        while (stringTokenizer.hasMoreTokens()) {
            nextToken = stringTokenizer.nextToken();
//            System.out.println("nextToken: " + nextToken);
            returnAcronym += nextToken.charAt(0);
        };

        System.out.println("returnAcronym: " + returnAcronym.toUpperCase());
    }
}
