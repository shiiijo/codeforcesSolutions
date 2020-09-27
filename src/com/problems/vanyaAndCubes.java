package com.problems;

import java.util.Scanner;

public class vanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;int b=0;
        while(n>=c){
            b++;
            c+=(b*(b+1)/2);

        }
        System.out.println(b-1);

    }
}
