import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DistanceANDaxis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int k=sc.nextInt();
                System.out.println(Math.max(k-a,(a+k)%2));
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
    public static void pair(int n) {
        //just give n value and enter array elements;
        Scanner sc=new Scanner(System.in);
        int a[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = i + 1;
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[1] - o2[1];
                }
                return o1[1] - o2[1];
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }

}
