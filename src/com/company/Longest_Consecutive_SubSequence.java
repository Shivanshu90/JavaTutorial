package com.company;

import java.util.*;

public class Longest_Consecutive_SubSequence {
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
        HashSet<Integer> hs=new HashSet();
        for(int i:arr)
        {
            hs.add(i);          //Store all elements to HashSet.
        }
        int long_len=0,initial=0,f=0;
        for(int i=0;i<size;i++)
        {
            if( ! hs.contains(arr[i]-1))        //Traverse the array if the (element - 1) is not present in hashset.
            {                                   //if (element - 1) is not present, means subarray starts from that element only.
                int n=arr[i];
                while(hs.contains(n))
                {
                    n++;                    //Increment the element to check how many element is present in subarray.
                }
                if(long_len<(n-arr[i]))
                {
                    long_len=n-arr[i];
                    initial=arr[i];
                    f=n;
                }
            }
        }
        for(int i=initial;i<f;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nLongest Consecutive Length: "+long_len);
    }
}
