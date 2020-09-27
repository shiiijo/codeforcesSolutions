package com.problems;

import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k=0;
        String[][] s=new String[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++){
                s[i][j]=sc.next();
                if(s[i][j].equals("C")||s[i][j].equals("Y")||s[i][j].equals("M")){
                     ++k;
                }

            }
        }
        if(k>0){
            System.out.println("#Color");
        }

      else{
            System.out.println("#Black&White");
        }



    }}
