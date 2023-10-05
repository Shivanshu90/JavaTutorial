package com.company;

import java.util.Scanner;

public class Max_Min_Element_Array {
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

        int max=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Maximum Element: "+max);
    }
}
