import java.util.Scanner;

public class CF1316A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0;
            int avg = 0;
            int avg2 = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if(sum<m){
                System.out.println(sum);

            }
            else{
                System.out.println(m);
            }
        }
    }
}
