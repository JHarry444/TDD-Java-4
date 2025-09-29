package com.qa.demo;

public class StringTokeniser {


    public static String[] tokenise(String input) {
        String[] split = input.split(",");
        String[] output = new String[split.length];
        for (int i = 0; i < split.length; i++) {
            output[i] = split[i].trim();
        }
        return output;
    }
}
