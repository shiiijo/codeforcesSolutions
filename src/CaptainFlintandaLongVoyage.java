import java.util.Scanner;

public class CaptainFlintandaLongVoyage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k =(n+3)/4;
            for (int i = 0; i <n-k; i++)
                System.out.print(9);
                for(int i=0;i<k;i++)
                    System.out.print(8);
            System.out.println();
        }
    }
}
