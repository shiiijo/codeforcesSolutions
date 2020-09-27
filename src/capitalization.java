import java.util.Scanner;

public class capitalization {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans=s.toUpperCase();
       if(s.toCharArray()[0]==ans.toCharArray()[0]) {
           System.out.println(s);
       }


       if(Character.isLowerCase(s.charAt(0)))
       {
           System.out.println(Character.toUpperCase(s.charAt(0))+s.substring(1));
       }
       }


    }

