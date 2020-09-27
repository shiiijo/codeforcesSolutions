import java.util.Scanner;

public class AmrANDpins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        double d = Math.pow(a-x,2) + Math.pow(b-y,2);
        double s = Math.sqrt(d);
        int min = (int)Math.ceil(s/(2*r)) ;
        System.out.println(min);
    }
}
