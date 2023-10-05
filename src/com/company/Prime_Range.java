package com.company;

public class Prime_Range {
    public static void main(String[] args) {
        int i,j,t=0;
        for(i=1;i<=40;i++)
        {
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                    t=t+1;
            }
            if(t==0)
                System.out.print(i+",");
            else
                t=0;
        }
    }
}
