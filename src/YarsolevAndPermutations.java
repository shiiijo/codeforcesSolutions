import java.util.Scanner;

public class YarsolevAndPermutations {
    public static void main(String[] args) {
        Scanner Reader=new Scanner(System.in);
        int[] a = new int[100001];
        int n = Reader.nextInt();
        for (int i = 1; i <= n; i++) {
            if (a[Reader.nextInt()]++ >= (n + 1) / 2) {
                System.out.println("NO");
                return;

            }
        }
        System.out.println("YES");
    }

}

