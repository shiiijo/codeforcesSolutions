import java.util.Scanner;

public class lunchRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int T = sc.nextInt();
        int res = -2000000000;
        for (int i = 0; i < n; ++i) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int cur = f;
            if (t > T)
                cur -= (t - T);
            res = Math.max(res, cur);
        }
        System.out.println(res);
    }
}


