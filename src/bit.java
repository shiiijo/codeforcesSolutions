import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        int X = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.charAt(1)=='+') {
                X++;
            }
            else
                X--;
            }
        System.out.println(X);
        }
    }

