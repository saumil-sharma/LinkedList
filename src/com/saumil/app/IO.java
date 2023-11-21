package com.saumil.app;

import java.util.Scanner;

public class IO {
    private static Scanner mainScanner = new Scanner(System.in);

    public static String prompt(String prompt){
        System.out.println(prompt);
        return mainScanner.next();
    }
}
