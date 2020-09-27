
     import java.util.Scanner;
     public class NewAndHurry
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        int c = 0;
        int newsum = 240 - k;
        for (int i = 1; i <= n; i++) {
            sum += 5 * i;
            if (sum <=newsum) {
                c++;
            }
        }
        System.out.println(c);
     }

 }
