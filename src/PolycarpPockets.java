
import java.util.*;

public class PolycarpPockets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[101];
        int c = 0;

        for (int i = 0; i < n; i++) {
            int j=sc.nextInt();
            a[j]++;

        }
        Arrays.sort(a);
        System.out.println(a[100]);
    }}
