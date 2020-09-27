import java.util.Scanner;

public class FedorandNewgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[m + 1];
        int c = 0;
        for (int i = 0; i <= m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int res = a[i] ^ a[m];
            if (count(res) <= k) {
                c++;
            }
        }
            System.out.println(c);
    }
     static int count(int n){
        int k=0;
        while(n!=0){
           n=n&n-1;
           k++;
        }
        return k;
    }
}
