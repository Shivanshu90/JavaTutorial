package com.company;

public class Alternate_Prime {
    public static void main(String[] args) {
        int t=0,c=0;
        for(int i=2;i<=40;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    t=t+1;
            }
            if(t==0)
            {
                if(c%2==0)
                    System.out.print(i+",");
                c=c+1;
            }
            else
                t=0;
        }
    }
}
