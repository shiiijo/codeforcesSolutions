import java.util.Arrays;
import java.util.Scanner;

public class trace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int rsum = 0;
        int bsum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

            for (int i =n-1; i >=0; i -= 2) {
                rsum +=(a[i])*(a[i]);
            }
            for (int i = n - 2; i > 0; i -= 2) {
                bsum += (a[i])*(a[i]);
            }
            if(n%2==0){
                System.out.println(((3.1415926536)*(Math.abs(rsum - bsum)))-((3.1415926536)*a[0]*a[0]));

            }
            else
            System.out.println((3.1415926536)*(Math.abs(rsum - bsum)));
    }
}
