import java.util.Scanner;

public class cplusequals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int c=0;
            while(n>=Math.max(a,b)){
                if(a>b)
                    b+=a;
                else
                    a+=b;
                c++;

            }
            System.out.println(c);

        }

    }
}
