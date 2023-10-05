package com.company;

import java.util.Scanner;

public class Bubble_Sort_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }

        int temp=0,swaps=0,rounds=0;
        for(int i=0;i<a.length;i++)     //This loop is used for rounds.
        {
            int flag=0;
            for(int j=0;j<a.length-1-i;j++)     //This loops basically traverse the array, compare and swap the array.
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                    swaps++;    //Counts the number of swapping it takes to sort the array.
                }
            }
            if(flag==0)
                break;

            rounds++;   // Counts the number of rounds it takes to sort the array.
        }               // Maximum number of rounds will be (size of array - 1).

        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nNumber of Rounds: "+rounds);
        System.out.println("Number of Swaps: "+swaps);
    }
}
