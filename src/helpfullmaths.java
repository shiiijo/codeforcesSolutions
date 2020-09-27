import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
import java.util.Scanner;

public class helpfullmaths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c1=0;
        int c2=0;
        int c3=0;
        String s1="";
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c1++;
            }else if(s.charAt(i)=='2'){
                c2++;
            }else if(s.charAt(i)=='3'){
                c3++;
            }

        }
        for(int i=0;i<c1;c1++){
            s1+="1+";
        }for(int i=0;i<c2;c2++){
            s1+="2+";}
        for(int i=0;i<c3;c3++) {
            s1+="3+";
        }
        s1=s1.substring(1,s1.length()-1);

         System.out.println(s1);



            }
        }




