package com.problems;

import java.util.*;
public class ChoosingTeam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}
            Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]<=(5-k)){
                c++;
            }
        }
        int ans=c/3;
        System.out.println(ans);

        }

    }

