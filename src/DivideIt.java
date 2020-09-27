import java.util.Scanner;

public class DivideIt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            long n = sc.nextLong();
            int c = 0;
            while(n>1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else if (n % 3 == 0) {
                    n = (2 * n) / 3;
                } else if (n % 5 == 0) {
                    n = (4 * n) / 5;
                } else {
                    c = -1;
                    break;
                }
                c++;
            }
            System.out.println(c);
        }
    }
}
