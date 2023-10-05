package com.company;

public class Remove_White_Space {
    public static void main(String[] args) {
        String s="  j        a  v a  aa   ";
        String st=s.replaceAll(" ", "");
        System.out.println(st);
    }
}
