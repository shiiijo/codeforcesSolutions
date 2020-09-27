import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int ans=0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
             Arrays.sort(a);
            for (int i=0; i<n-1; i++){
                int d=Math.abs(a[i]-a[i+1]);
                if(d<=1)
                    ans++;
            }
            if(ans==n-1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
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
