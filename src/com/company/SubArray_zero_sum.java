package com.company;

import java.util.*;

public class SubArray_zero_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        /* APPPROACH-1: O(N*N)

        int f=0,i,j=0;
        for(i=0;i<size;i++)
        {
            int sum=0;
            for(j=i;j<size;j++)
            {
                sum=sum+arr[j];
                if(sum==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
                break;
        }
        if(f==1)
            System.out.println(i+","+j);
        else
            System.out.println("No Sub-Array with zero sum");

         */

        HashMap<Integer,Integer> hm=new HashMap<>();
        int curr_sum=0,start=0,end=-1;
        for(int i=0;i<size;i++)
        {
            curr_sum=curr_sum+arr[i];
            if((curr_sum)==0)
            {
                start=0;
                end=i;
                break;
            }
            if(hm.containsKey(curr_sum))
            {
                start=hm.get(curr_sum)+1;
                end=i;
                break;
            }
            hm.put(curr_sum,i);
        }
        if(end==-1)
            System.out.println("No Sub-Array found");
        else
        {
            for(int i=start;i<=end;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("at ("+start+", "+end+")");
        }
    }
}
