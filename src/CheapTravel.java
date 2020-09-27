import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int  x=b/m;
        int ans=0;
        if(x>=a){
            System.out.println(n*a);
        }
        else{
            ans=b*(n/m);
            n%=m;
            ans+=Math.min(a*n,b);
            System.out.println(ans);
            }
        }
    }
