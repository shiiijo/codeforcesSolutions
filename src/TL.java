import java.util.Arrays;
import java.util.Scanner;

public class TL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]a=new int[n];
        int[]b=new int[m];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        Arrays.sort(b);
        int val=Math.max(2*a[0],a[n-1]);
        if(val<b[0]){
            System.out.println(val);
        }
        else
            System.out.println(-1);

    }
}
