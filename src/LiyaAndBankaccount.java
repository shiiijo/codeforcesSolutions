import java.util.Scanner;

public class LiyaAndBankaccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r1=0; int r2=0;
        int d1=0;int d2=0;
        if(n<0){
            r1=Math.abs((int)n%10);
            d1=Math.abs((int)n/10);
            r2=Math.abs((int)d1%10);
            if(r1>r2){
                System.out.println((n+r1)/10);
            }
            else{
                int c=-d1-r1+r2;
                System.out.println(c);
            }
        }
        else{
            System.out.println(n);
        }
    }
}
