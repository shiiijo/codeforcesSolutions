import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class sale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
       int i=0;
       int sum=0;
        while(m-->0){
            if(a[i]<=0){
                sum+=a[i];
            }
            i++;
        }
        System.out.println(abs(sum));
    }
}
