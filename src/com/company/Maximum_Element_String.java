package com.company;
import java.util.*;
public class Maximum_Element_String {
    public static void main(String[] args) {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        s=sc.nextLine();

        int arr[]=new int[127];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        int max=-1;
        char ch=' ';
        for(int i=0;i<s.length();i++)
        {
            if(max<arr[s.charAt(i)])
            {
                max=arr[s.charAt(i)];
                ch=s.charAt(i);
            }
        }
        System.out.println(ch);

    }
}
