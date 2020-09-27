package com.problems;

import java.util.Scanner;
public class phoenixAndBalance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=n/2;
            int sum=0;
            int sum2=0;
            for(int i=m;i<=n-1;i++){
                sum+=Math.pow(2,i);
            }
            for(int i=1;i<m;i++){
                sum2+=Math.pow(2,i);
            }
            int sum3=(int)Math.pow(2,n)+sum2;
            System.out.println(Math.abs(sum3-sum));
        }

    }}


