import java.util.Scanner;

public class TwoDistnctPoints {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long l1=sc.nextLong();
            long r1=sc.nextLong();
            long l2=sc.nextLong();
            long r2=sc.nextLong();
            long ans1=(l1+r1)/2;
            long ans2=(l2+r2)/2;

            if(ans1==ans2){
                System.out.println(l1+" "+r2);
            }
            else{
                System.out.println(ans1+" "+ans2);
            }
        }
    }
}
