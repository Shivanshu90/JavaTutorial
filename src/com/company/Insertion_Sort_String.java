package com.company;

import java.util.Scanner;

public class Insertion_Sort_String {
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
        String temp;
        int j;
        for(int i=1;i<a.length;i++)
        {
            temp=a[i];
            j=i;
            while(j>0 && (temp.compareTo(a[j-1]) < 0))
            {
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        for(String i:a)
        {
            System.out.print(i+" ");
        }
    }
}
