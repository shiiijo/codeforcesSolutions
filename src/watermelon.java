import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int sum=0;
            int[]a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                a[i]=a[i]-(i+1);
            }
            for(int i=0;i<n;i++){
                sum+=a[i];
            }
          //  System.out.println(sum);
            if(sum==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
