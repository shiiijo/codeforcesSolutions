import java.util.Scanner;

public class GiftFixinng {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            int min1 = Integer.MAX_VALUE;
            int min2 = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
                min1 = Math.min(min1, arr1[i]);
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
                min2 = Math.min(min2, arr2[i]);
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                int diff1 = arr1[i] - min1;
                int diff2 = arr2[i] - min2;
                res += Math.max(diff1, diff2);


            }
            System.out.println(res);
        }

    }
}
