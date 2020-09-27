import java.util.Scanner;

public class CF1090A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

            for ( int i=c; i>=1; i--)
            {
                if ((i-1) <= b && (i-2) <= a)
                {
                    System.out.println(3*i-3);
                    break;
                }
            }
    }
}
