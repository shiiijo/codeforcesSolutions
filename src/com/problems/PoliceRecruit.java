package com.problems;

import java.util.Scanner;
public class PoliceRecruit {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    int sum=0;
    while(n-->0){
        int num=sc.nextInt();
        if(sum+num<0){
            c++;
        }
        else{
            sum+=num;
        }
    }


        System.out.println(c);
}}
