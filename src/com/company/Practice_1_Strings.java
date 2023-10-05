package com.company;

import java.sql.SQLOutput;

public class Practice_1_Strings {
    public static void main(String[] args) {
        String letter="Dear <|name|>, Thanks alot.";
        System.out.println(letter.replace("<|name|>", "Shivanshu"));
        String spaces="There are  double and   triple spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
    }
}
