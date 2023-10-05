package com.company;

import  java.util.*;
public class Stone_paper_scissor {
    public static void main(String[] args) {
        String y;
        do {
            int i=1,w=0,l=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Stone");
            System.out.println("Enter 2 for Paper");
            System.out.println("Enter 3 for Scissor");

            while (i <= 3) {
                System.out.println("\nMatch " + i);
                int n = sc.nextInt();

                if (n != 1 && n != 2 && n != 3)
                {
                    System.out.println("Choose valid option");
                    continue;
                }

                Random rg = new Random();
                int r = rg.nextInt(3) + 1;
                System.out.println(r);

                if ((n == 1 && r == 1) || (n == 2 && r == 2) || (n == 3 && r == 3))
                    System.out.println("Tie");
                else if ((n == 2 && r == 1) || (n == 3 && r == 2 || (n == 1 && r == 3))) {
                    System.out.println("You Win!..");
                    w++;
                } else if ((n == 1 && r == 2) || (n == 2 && r == 3 || (n == 3 && r == 1))) {
                    System.out.println("You Loose!..");
                    l++;
                }
                i++;
            }
            if (w > l)
                System.out.println("\nCongratulations!!! You won the match.");
            else if (w == l)
                System.out.println("\nMatch Tie!!! Start Again.");
            else
                System.out.println("\nSorry!!! You lost the match.");

            System.out.println("\nDo you wanna Play Again?\nEnter Y for Yes and N for No");
            y=sc.next();
        }
        while(y.equals("y") || y.equals("Y"));
    }
}
