package com.company;

import java.util.*;

public class SubArray_Longest_given_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum");
        int s = sc.nextInt();

        HashMap<Integer,Integer> hm=new HashMap<>();
        int curr_sum=0,start=0,end=-1,max=Integer.MIN_VALUE,max_start=0,max_end=0;
        for(int i=0;i<size;i++)
        {
            curr_sum=curr_sum+arr[i];
            if((curr_sum-s)==0)
            {
                start=0;
                end=i;
                if(max<(end-start))
                {
                    max = end - start;
                    max_start=start;
                    max_end=end;
                }
            }
            if(hm.containsKey(curr_sum-s))
            {
                start=hm.get(curr_sum-s)+1;
                end=i;
                if(max<(end-start))
                {
                    max = end - start;
                    max_start=start;
                    max_end=end;
                }
            }
            else
                hm.put(curr_sum,i);
        }

        if(end==-1)
            System.out.println("No Sub-Array found");
        else
        {
            for(int i=max_start;i<=max_end;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("at ("+max_start+", "+max_end+")");
        }
    }
}
