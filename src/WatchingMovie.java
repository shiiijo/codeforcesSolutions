import java.util.Scanner;

public class WatchingMovie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=1;
        int m=0;
        while(n-->0){
            int l=sc.nextInt(),r=sc.nextInt();
            m+=(l-c)%x+(r-l)+1;
            c=r+1;
        }
        System.out.println(m);
    }
}
