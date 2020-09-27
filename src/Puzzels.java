import java.util.Arrays;
import java.util.Scanner;

public class Puzzels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        ans=a[n-1]-a[0];

            for (int i = 0; i <m-n+1; i++) {
                if(a[i+n-1]-a[i] < ans){
                    ans=a[i+n-1]-a[i];
                }
            }
        System.out.println(ans);
    }
}
