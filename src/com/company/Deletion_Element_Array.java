package com.company;

import java.util.Scanner;

public class Deletion_Element_Array {
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
        System.out.println("Enter the element you want to delete");
        int e= sc.nextInt();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(e==arr[i])
            {
                for(int j=i;j<arr.length-1;j++)
                {
                    arr[i]=arr[i+1];
                }
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("Element not found!!!");
        else
        {
            for(int i=0;i<size-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\nElement deleted successfully.");
        }
    }
}
