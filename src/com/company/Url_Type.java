package com.company;

import java.util.*;
public class Url_Type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        if(s.endsWith(".com"))
            System.out.println("Commercial Website");
        else if(s.endsWith(".org"))
            System.out.println("Organisation Website");
        else if(s.endsWith(".in"))
            System.out.println("Indian Website");
    }
}
