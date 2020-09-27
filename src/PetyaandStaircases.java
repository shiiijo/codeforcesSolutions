import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class  PetyaandStaircases{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter w=new PrintWriter(System.out);
        int i; int j;
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 0) w.print("YES");
        else {
            int a[] = new int[m];
            for (i = 0; i < m; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            boolean f = true;
            if (a[0] == 1 || a[m - 1] == n) w.print("NO");
            else {

                for (i = 2; i < m; i++) {
                    if (a[i] - a[i - 1] == 1 && a[i] - a[i - 2] == 2) {
                        f = false;
                        break;
                    }
                }
                if (f) w.print("YES");
                else w.print("NO");
            }
        }
        w.close();
        w.flush();
    }
}


