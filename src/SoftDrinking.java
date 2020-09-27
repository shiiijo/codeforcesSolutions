import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long l=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
        long p=sc.nextLong();
        long nl=sc.nextInt();
        long np=sc.nextInt();
        int ans= (int) Math.min((l*k/nl),(c*d));
        int ans2= (int) Math.min(ans,p/np);
        System.out.println(ans2/n);
    }
}
