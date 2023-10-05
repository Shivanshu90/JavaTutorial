package com.company;

import java.util.*;
public class Sort_String {
    public static void main(String[] args) {
        String s="Shivanshu Agarwal";
        char arr[]=s.toCharArray();
        /*
        char temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }

         */
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
