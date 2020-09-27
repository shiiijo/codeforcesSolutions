import java.util.Scanner;

public class colourBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long r = sc.nextLong();
            long g = sc.nextLong();
            long b = sc.nextLong();
            long w = sc.nextLong();
            int odd = 0;
            long k = Math.min(r, Math.min(g, b));
            if (r % 2 == 1)   ++odd;
            if (g % 2 == 1)   ++odd;
            if (b % 2 == 1)   ++odd;
            if (w % 2 == 1)   ++odd;
            if (odd < 2)
            {
                System.out.println("YES");
            }
           else if (odd == 2)
            {
                System.out.println("NO");
            }
            else
            {
                if (k == 0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
}

