import java.util.Scanner;

public class drinks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        double div=n*100;
        int sum=0;
        double ans=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];

        }
        ans=(sum/div)*100;
        System.out.println(ans);
    }
}
