import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int sol=0;
        int n=sc.nextInt();
        int q=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sol=a[q-1];

        }
        for(int i=0;i<a.length;i++){
            if(a[i]>=sol &&a[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
