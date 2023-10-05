package com.company;

import java.util.Scanner;

public class Maximum_Difference_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        //      APPROACH-1
        /*
        int min=Integer.MIN_VALUE;
        for(int i=0;i<size-1;i++)
        {
            for(int j=1;j<size;j++)
            {
                if(j>i && (a[j]-a[i])>min)
                {
                    min=a[j]-a[i];
                }
            }
        }
        System.out.println(min);

         */



        //      APPROACH-2 (Better)
        int r=a[1]-a[0], min=a[0];
        for(int i=1;i<size;i++)
        {
            r=Math.max(r,a[i]-r);
            min=Math.min(min,a[i]);
        }
        System.out.println(r);
    }
}
