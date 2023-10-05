package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class SubArray_equal_Zeros_Ones {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size = sc.nextInt();

            int arr[] = new int[size];
            System.out.println("Enter the elements in array");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            /*
            int max=Integer.MIN_VALUE,max_start=0,max_end=0;
            for(int i=0;i<size;i++)
            {
                int a=0,b=0;
                for(int j=i;j<size;j++)
                {
                    if(arr[j]==0)
                        a++;
                    else
                        b++;

                    if(a==b)
                    {
                        if(max<(j-i))
                        {
                            max=j-i;
                            max_start=i;
                            max_end=j;
                        }
                    }
                }
            }
            for(int i=max_start;i<=max_end;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("\n("+max_start+", "+max_end+")");
            System.out.println("Max Sub_Array: "+(max+1));

             */

            int a[]=new int[size];
            for(int i=0;i<size;i++)
            {
                a[i]=arr[i];
            }
            for(int i=0;i<size;i++)
            {
                if(arr[i]==0)
                    arr[i]=-1;
            }
            HashMap<Integer,Integer> hm=new HashMap<>();
            int curr_sum=0,start=0,end=-1,max=Integer.MIN_VALUE,max_start=0,max_end=0;
            for(int i=0;i<size;i++)
            {
                curr_sum=curr_sum+arr[i];
                if((curr_sum)==0)
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
                if(hm.containsKey(curr_sum))
                {
                    start=hm.get(curr_sum)+1;
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
                    System.out.print(a[i]+" ");
                }
                System.out.println("at ("+max_start+", "+max_end+")");
            }


        }


}
