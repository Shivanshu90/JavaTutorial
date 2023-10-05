package com.company;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements in array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to search:");
        int e=sc.nextInt();

        int f=0,i;
        for(i=0;i<size;i++)
        {
            if(arr[i]==e)
            {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("Element found at "+(i+1)+" position.");
        else
            System.out.println("Element not found");
    }
}
