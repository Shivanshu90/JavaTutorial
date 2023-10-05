package com.company;
import java.util.*;
public class Reverse_Each_Word_in_Given_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();

        String w[]=s.split(" ");
        String rev="";

        for(int i=0;i<w.length;i++)
        {
            for(int j=w[i].length()-1;j>=0;j--)
            {
                rev=rev+w[i].charAt(j);
            }
            rev=rev+" ";
        }
        System.out.println(rev);
    }
}
