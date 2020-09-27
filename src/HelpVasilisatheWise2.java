import java.util.Scanner;

public class HelpVasilisatheWise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long r1 = sc.nextLong();
        long r2 = sc.nextLong();
        long c1 = sc.nextLong();
        long c2 = sc.nextLong();
        long d1 = sc.nextLong();
        long d2 = sc.nextLong();
        int a = (int) (d1 + (r1 - c2 - d1) / 2);
        int b = (int) (d2 - c1 + a);
        int c = (int) (d2 - c1 + a - c2 + r2);
        int d = (int) ((r1 - c2 - d1) / -2);
        boolean x=false;
        if(b + c == d2 && a+b == r1 && c+d == r2 && a!=b && a!=c && a!=d && b!=c && b!=d && c!=d && a<10 && b<10 && c<10 && d<10 && a>0 && b>0 && c>0 && d>0){
            System.out.println(a+" "+b);
            System.out.println(c+" "+d);
        }
        else {
            System.out.println(-1);
        }
    }
}
