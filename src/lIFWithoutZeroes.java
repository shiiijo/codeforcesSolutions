import java.util.Scanner;

public class lIFWithoutZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        String x=Integer.toString(a);
        x=x.replace("0","");
        int m=Integer.parseInt(x);
       String y=Integer.toString(b);
       y=y.replace("0","");
       int n=Integer.parseInt(y);
       String z=Integer.toString(c);
       z=z.replace("0","");
       int o=Integer.parseInt(z);
       if(m+n==o){
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }


    }
}
