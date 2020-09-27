import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int t=sc.nextInt();
       while(t-->0){
        int n = sc.nextInt();
        int[] a = new int[n];
        int c = 0;
        int even=0;int odd=0;int fine=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (a[i] % 2 == 0) {
                        fine++;
                    } else {
                        even++;
                    }
                }
                if (i % 2 != 0) {
                    if (a[i] % 2 != 0) {
                        fine++;
                    } else {
                        odd++;
                    }
                }
            }

            if (fine == n) {
                System.out.println("0");
            } else if (odd == even) {
                System.out.println(even);
            } else {
                System.out.println("-1");
            }
        }
    }
}