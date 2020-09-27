import java.util.Arrays;
import java.util.Scanner;

public class NextTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
         int c=1;
        for (int i=0;i<n;i++) {
            if (a[i] == c)
                c++;
            else break;
        }
        System.out.println(c);
    }
}
