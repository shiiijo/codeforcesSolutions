import java.util.Arrays;
import java.util.Scanner;

public class TanyaandStairways {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] out=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int index = -1 ;

        for (int i = 0 ;i < n - 1  ; i++ )
        {
            if (a[i] >= a[i+1]){
                index++ ;
                out[index] = a[i] ;
            }
        }

        out[++index] = a[n-1] ;
        System.out.println(index+1);
        for (int i = 0 ;i <=  index  ; i++ )
        {
            System.out.print(out[i]+" ");
        }


    }
}
