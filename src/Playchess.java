import java.util.Arrays;
import java.util.Scanner;

public class Playchess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println(x+" "+y);
                if(j!=m-1)
                    y=y%m +1;

            }
            x=x%n +1;
        }


    }
    static int mod = 1000000007;
    static boolean primes[] = new boolean[1000007];

    static boolean prime(int n) {
        //it returns boolean ,ie true or false
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (primes[i] == true) {
                for (int p = i * i; p <= n; p += i) {
                    primes[p] = false;
                }
            }
        }
        if (n < 1000007) {
            return primes[n];
        }
        return false;
    }
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static long GCD(long a, long b) {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }
    static int findGCD(int arr[], int n)
    //to find gcd of more than two numbers
    {
        int result = 0;
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }
        return result;
    }
}
