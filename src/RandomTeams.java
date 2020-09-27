import java.util.Scanner;

public class RandomTeams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long max=((n+1-m)*(n-m))/2;
        long div=n/m;
        long mod=n%m;
        long min= ((div * (div + 1)) * mod) / 2 + ((div * (div - 1)) * (m - mod)) / 2;
        System.out.println(min+" "+max);
    }
}
