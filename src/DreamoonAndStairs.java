import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=0;
        if(n%2==0){
           ans=n/2;
        }
        else {
            ans = (n / 2) + 1;
        }
        int i;
        for( i=ans;i<=n;i++){
            if(i%m==0){
                System.out.println(i);
                break;
            }
        }
        if(i==n+1){
            System.out.println(-1);
        }


    }
}
