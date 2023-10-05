package com.company;

import java.util.Scanner;

public class Selection_Sort_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        String a[]=new String[size];

        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.next();
        }
        int min;
        String temp;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j].compareTo(a[min]) < 0)
                {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(String i:a)
        {
            System.out.print(i+" ");
        }
    }
}
