import java.util.Scanner;

public class stones {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        String s=sc.next();
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                }
            }


        System.out.println(count);
        }}


