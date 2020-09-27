import java.util.Scanner;

public class hitTheLottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=n/100;
        int left=n%100;

        ans+=left/20;
        left=left%20;

        ans+=left/10;
        left=left%10;

        ans+=left/5;
        left=left%5;

        ans+=left/1;

        System.out.println(ans);
        }}


