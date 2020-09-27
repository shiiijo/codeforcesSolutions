package com.problems;

import java.util.Scanner;

public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=0;
        for(int i=0;i<5;i++){
            String s=sc.next();
            if(str.charAt(0)==s.charAt(0) || str.charAt(1)==s.charAt(1)){
                k++;
            }
        }
        if(k>0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        }
        }




