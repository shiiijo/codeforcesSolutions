import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubStringRemovalgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int l=s.length();
            ArrayList<Integer> a=new ArrayList<Integer>();
            int c=0;
            for(int i=0;i<l;i++) {
                char c1=s.charAt(i);
                if(c1=='1')
                    c++;
                else {
                    a.add(c);
                    c=0;
                }
            }
            if(c!=0)
                a.add(c);
            Collections.sort(a);
            c=0;
            int ans=0;
            for(int i=a.size()-1;i>=0;i--) {
                if(c%2==0)
                    ans+=a.get(i);
                c++;
            }

            System.out.println(ans);
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