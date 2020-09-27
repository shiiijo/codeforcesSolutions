package com.problems;

import java.util.*;
public class TeamOlympiad{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        List<Integer> a=new LinkedList<Integer>();
        List<Integer> b=new LinkedList<Integer>();
        List<Integer> c=new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            int d=ob.nextInt();
            if(d==1)
                a.add(i+1);
            else if(d==2)
                b.add(i+1);
            else
                c.add(i+1);
        }
        int l=Math.min(a.size(),Math.min(c.size(), b.size()));
        System.out.println(l);
        if(l!=0)
            for(int i=0;i<l;i++){
                System.out.println(a.get(i)+" "+b.get(i)+" "+c.get(i));
            }

    }
}