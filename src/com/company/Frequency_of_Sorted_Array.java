package com.company;

import java.util.Scanner;

public class Frequency_of_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int i=1,f=1;
        while(i<size)
        {
            while(i<size && a[i]==a[i-1])
            {
                i++;
                f++;
            }
            System.out.println(a[i-1]+" "+f);
            i++;
            f=1;
        }
        if(a[size-1]!=a[size-2])
            System.out.println(a[i-1]+" "+1);

    }
}
