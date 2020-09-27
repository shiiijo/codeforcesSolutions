import java.util.Scanner;

public class Paralellopiped {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        Double a=Math.sqrt((x*y)/z);
        Double b=Math.sqrt((y*z)/x);
        Double c=Math.sqrt((z*x)/y);
        System.out.println((int)(4*(a+b+c)));
    }
}
