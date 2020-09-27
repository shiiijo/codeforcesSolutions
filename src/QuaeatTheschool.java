import java.util.Scanner;

public class QuaeatTheschool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        StringBuilder sol = new StringBuilder(s);
        while (t-- > 0) {
            for (int i = 0; i < sol.toString().length()-1; i++) {
                if (sol.charAt(i) == 'B' && sol.charAt(i + 1) == 'G') {
                    sol.setCharAt(i, 'G');
                    sol.setCharAt(i + 1, 'B');
                    i=i+1;
                }
            }
        }
        System.out.println(sol.toString());
    }
}



