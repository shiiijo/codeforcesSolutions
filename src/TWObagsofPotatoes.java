import java.util.Scanner;

public class TWObagsofPotatoes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long y=sc.nextInt();
        long k=sc.nextInt();
        long n=sc.nextInt();
        int c=0; int i=0;
        while(k*i<n) {
            i++;
            if(k*i-y>0 && k*i-y<=n-y){
                c++;
                System.out.print(k*i-y+" ");
            }
            }
        if(c==0)
            System.out.println(-1);
        }
}
