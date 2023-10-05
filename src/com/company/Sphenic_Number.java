package com.company;

public class Sphenic_Number {
    public static void main(String[] args) {
        int n=110;
        int t=0,s=1;
        for(int i=2;i<n;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    t=t+1;
                }
            }
            if(t==0)
            {
                if(n%i==0)
                    s=s*i;
            }
        }
    }
}
