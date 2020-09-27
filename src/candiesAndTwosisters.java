
import java.util.*;
public class candiesAndTwosisters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int ans=0;
         while(n>=1) {
             n--;
           long num = sc.nextLong();
           if (num % 2 == 0) {
               ans = ((int) (num / 2)) - 1;

           } else if (num % 2 != 0) {
               ans = (int) (num / 2);
           }
           System.out.println(ans);
       }
    }
}
