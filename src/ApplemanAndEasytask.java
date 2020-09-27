import java.util.Scanner;

public class ApplemanAndEasytask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.next().charAt(0);
            }
        }
    }
}
