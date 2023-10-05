package com.company;

public class Remove_Special_Char {
    public static void main(String[] args) {
        String s="ja%vaa@is&ago#od^!lan!@#gua#ge.";
        String st=s.replaceAll("[^a-zA-Z]", "");
        System.out.println(st);
    }
}
// '^' --> characters other than this.