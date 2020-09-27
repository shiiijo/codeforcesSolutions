import java.util.Scanner;

public class ThreePilesofCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long ans=(a+b+c)/2;
            System.out.println(ans);

        }

    }
}
