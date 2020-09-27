import java.util.Arrays;
import java.util.Scanner;

public class CaptainFlintandCrewRecruitment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = 2 * 3;
            int b = 2 * 5;
            int c = 2 * 7;
            int ans = a + b + c;
            if (n > 30) {
                System.out.println("YES");
                if (n == 36) {
                    System.out.println(5 + " " + 6 + " " + 10 + " " + 15);
                } else if (a == (n - ans)) {
                    System.out.println(3 * 5 + " " + b + " " + c + " " + (n - (b + c + 15)));
                } else if (b == (n - ans)) {
                    System.out.println(a + " " + 3 * 5 + " " + c + " " + (n - (a + c + 15)));
                } else if (c == (n - ans)) {
                    System.out.println(a + " " + b + " " + 3 * 5 + " " + (n - (a + b + 15)));
                } else
                System.out.println(2 * 3 + " " + 2 * 5 + " " + 2 * 7 + " " + (n - ans));
            } else {
                System.out.println("NO");

            }
        }
    }


    static int mod=1000000007;
    static boolean primes[]=new boolean[1000007];
    static boolean prime(int n){
        //it returns boolean ,ie true or false
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        for(int i=2;i*i<=n;i++){
            if(primes[i]==true){
                for(int p=i*i;p<=n;p+=i){
                    primes[p]=false;
                }
            }
        }
        if(n<1000007){
            return primes[n];
        }
        return false;

    }
    static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static long GCD(long a,long b){
        if(b==0)
            return a;
        return GCD(b,a%b);
    }
}
