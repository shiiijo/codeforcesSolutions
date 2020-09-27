import java.util.Scanner;
import java.lang.*;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class DimaandContinuousLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean x=false;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n - 1; j++) {
                if ((min(a[i], a[i + 1]) < min(a[j], a[j + 1]) && min(a[j], a[j + 1]) < max(a[i], a[i + 1]) && max(a[i], a[i + 1]) < max(a[j], a[j + 1])) ||
                        (min(a[j], a[j + 1]) < min(a[i], a[i + 1]) && min(a[i], a[i + 1]) < max(a[j], a[j + 1]) && max(a[j], a[j + 1]) < max(a[i], a[i + 1]))) {
                    x = true;
                }
            }
        }
            if(x) System.out.println("yes");
            else System.out.println("no");
    }
}
