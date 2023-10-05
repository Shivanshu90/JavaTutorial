package com.company;

import java.util.Scanner;

public class Missing_Number_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        /*  APPROACH-1
        int explength=size+1;
        int exptotal=(explength*(explength+1))/2;
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.println("Missing Element in Array: "+(exptotal-sum));

         */
        //APPROACH-2
        int xor1=arr[0];
        for(int i=1;i<size;i++)
        {
            xor1=xor1^arr[i];
        }
        int xor2=1;
        for(int i=2;i<=size+1;i++)
        {
            xor2=xor2^i;
        }
        System.out.println("Missing Element in Array: "+(xor1^xor2));
    }
}
