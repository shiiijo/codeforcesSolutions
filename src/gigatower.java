import java.util.Scanner;

public class gigatower{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int a=0;
        int b=0;
        while(true){
        n++;
        b++;
            if(n<0)n=-n;
            while(n-->0){
                if(n%10==8) {
                    c++;
                }
                a=n/10;

            }
        if(c>=1)
            break;
        }
        System.out.println(b);
    }
}
