import java.util.Arrays;
import java.util.Scanner;

public class Sockets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int l = n-1;
        int s = 0;
        while(m>k && k!=0 && l>=0){
            m-= a[l];
            l--;
            k--;
            s++;
        }
        if(m<=k) System.out.print(s);
        else if(m>k && l<0) System.out.print("-1");
        else if(m>k && k==0){
            while(m>0 && l>=0){
                m -= (a[l]-1);
                l--;
                s++;
            }
            if(m<=0 && l>=0) System.out.print(s);
            else if(m>0 && l<0) System.out.print("-1");
        }
    }
}
