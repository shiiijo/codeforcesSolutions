import java.util.Scanner;
import java.lang.Math;

public class EqualizePricesAgain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int sum=0;
            int n=sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i <a.length; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

             if(sum%n==0){
                 System.out.println(sum/n);
             }
             else
                 System.out.println((sum/n)+1);


        }
    }
}
