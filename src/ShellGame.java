import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShellGame {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new File("output.txt"));
        int i,j;
        int n = sc.nextInt();
        int a[] = new int[4];
        a[n] = 1;
        for(i=1;i<=3;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }

        for(i=1;i<=3;i++){
            if(a[i]==1)
                out.print(i);
        }
        out.close();
    }
}
