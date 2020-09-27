import java.util.Scanner;

public class THERank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rank=1;
        long sum=0;
        int x=1;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d=sc.nextLong();
            sum=a+b+c+d;
            if(i==0){
                x= (int) sum;
            }
            else if(sum>x){
                rank++;
            }
        }
        System.out.println(rank);
    }
}
