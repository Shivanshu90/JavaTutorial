package com.company;

import java.util.Scanner;

public class SubArray_Longest_same_Sum_Both_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter the elements in array-1");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[size];
        System.out.println("Enter the elements in array-2");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }

        // APPROACH-1  :   O(N*N)
        int i, j = 0, max = 0;
        for (i = 0; i < size; i++)
        {
            int s1=0, s2=0;
            for (j = i; j < size; j++)
            {
                s1 = s1 + arr1[j];
                s2 = s2 + arr2[j];
                if (s1 == s2)
                {
                    if (max < j - i)
                        max = j - i;
                }
            }
        }
        System.out.println(max+1);
    }
}
