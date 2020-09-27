import java.util.Scanner;
public class ChecfWars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int p = sc.nextInt();
            if(h/2>p) System.out.println(0);
            else System.out.println(1);
        }
    }
}
