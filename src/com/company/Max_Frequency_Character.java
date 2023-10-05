package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Max_Frequency_Character {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                int v=hm.get(ch);
                v=v+1;
                hm.put(ch,v);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        System.out.println(hm);

        char max_freq_char=s.charAt(0);
        for(char c:hm.keySet())
        {
            if(hm.get(c)>hm.get(max_freq_char))
                max_freq_char=c;
        }
        System.out.println("Max repeated character is "+max_freq_char+" with frequency: "+hm.get(max_freq_char));
    }

}
