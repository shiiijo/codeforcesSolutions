package com.problems;

import java.util.*;

              public class ShortSubstrings
{
             public static void main(String[] args)
    {
              Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               while(n-->0)
       {
               String s = sc.next();
                for (int i = 0; i < s.length() - i; i++)
           {
               System.out.print(s.charAt(2 * i));
           }
               System.out.print(s.charAt(s.length() - 1));
               System.out.println("");
       }

    }
}
