package com.company;

public class First_NonRepeated_Char {
    public static void main(String[] args) {
        String s="aabcbdceefahi";
        for(int i=0;i<s.length();i++)
        {
            boolean f=true;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j && s.charAt(i) == s.charAt(j))
                {
                    f=false;
                    break;
                }
            }
            if(f)
            {
                System.out.println(s.charAt(i));
                break;  // use 'break' statement here if we want to print only first non-repeating character. Remove 'break' if we want to print all non-repeating character of the string.
            }
        }
    }
}
