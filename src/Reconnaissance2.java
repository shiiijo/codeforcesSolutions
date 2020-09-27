
import java.util.Scanner;
public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int x = 0, y = 0;
        for (int i = 1; i < n; i++) {
            if (Math.abs(a[i] - a[i - 1]) < min) {
                min = Math.abs(a[i] - a[i - 1]);
                x = i - 1;
                y = i;

            }
        }
        if (Math.abs(a[n - 1] - a[0]) < min) {
            x = n - 1;
            y = 0;

        }
        System.out.println((x + 1) + " " + (y + 1));

    }
}
