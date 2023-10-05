package com.company;

import java.util.*;

public class First_Duplicate_Element {
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
        /*
        for(int i=0;i<size;i++)
        {
            boolean f=false;
            for(int j=0;j<size;j++)
            {
                if(i!=j && arr[i] == arr[j])
                {
                    f=true;
                    break;
                }
            }
            if(f)
            {
                System.out.println("First Duplicate Element: "+arr[i]);
                break;  // use 'break' statement here if we want to print only first non-repeating character. Remove 'break' if we want to print all non-repeating character of the string.
            }
        }

         */
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr)
        {
            hs.add(i);
        }
        System.out.println(hs);
    }
}