import java.util.Scanner;

public class WaterBuying {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ans=0;
            if(2*a<=b){
                ans=n*a;
            }
            else {
                if (n % 2 == 0) {
                    ans = (n / 2) * b;
                } else {
                    ans = (n / 2) * b + a;
                }
            }
            System.out.println(ans);
        }

    }
}
