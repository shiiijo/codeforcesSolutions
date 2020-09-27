import java.util.Scanner;

public class FixYou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            char a[][] = new char[n][m];
            int c = 0;
            int k = 0;
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                for (int j = 0; j < m; j++)
                    a[i][j] = s.charAt(j);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(i==n-1) {
                        if (a[i][j] == 'D') {
                            c++;
                        }
                    }
                    if(j==m-1) {
                        if (a[i][j] == 'R') {
                            c++;
                        }
                    }
                }
            }
            System.out.println(c);
        }
    }
}
