package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Odd_Even_Array {
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
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            if(arr[i]%2==0)
                al1.add(arr[i]);
            else
                al2.add(arr[i]);
        }
        int evensum=0,oddsum=0;
        System.out.println("Even Numbers:");
        for(int n:al1)
        {
            evensum+=n;
            System.out.print(n+" ");
        }
        System.out.println("\nSum of even numbers: "+evensum);
        System.out.println("Count of Even numbers: "+al1.size());
        System.out.println("Odd Numbers:");
        for(int n:al2)
        {
            oddsum+=n;
            System.out.print(n+" ");
        }
        System.out.println("\nSum of odd numbers: "+oddsum);
        System.out.println("Count of odd numbers: "+al2.size());
    }
}
