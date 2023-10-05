package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Median_Array
{
    public static void main(String[] args)
    {
        int[] a1={1,3};
        int[] a2={2};

        ArrayList<Integer> al=new ArrayList<>();
        for(int i:a1)
            al.add(i);
        for(int i:a2)
            al.add(i);

       Object[] arr=al.toArray();
       Arrays.sort(arr);

       for(Object i:arr)
           System.out.println(i);

        int[] intArray = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            intArray[i] = (int) arr[i];

        int len=intArray.length;
        double median;
        int mid=len/2;
        if(len%2==0)
            median=(intArray[mid] + intArray[(mid-1)])/2;
        else
            median= (double) arr[mid];

        System.out.println(median);
    }
}
//WRONG SOLUTION