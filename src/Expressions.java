import java.util.Scanner;

public class Expressions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int exp1=a+b+c;
        int exp2=a*b*c;
        int exp3=a+b*c;
        int exp4=a*b+c;
        int exp5=a*(b+c);
        int exp6=(a+b)*c;
        int sol=0;
        sol=Math.max(exp1,Math.max(exp2,(Math.max(exp3,(Math.max(exp4,(Math.max(exp6,exp5))))))));
        System.out.println(sol);
    }
    }

