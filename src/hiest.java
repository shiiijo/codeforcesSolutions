import java.util.Arrays;
import java.util.Scanner;

public class hiest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){

           c+= a[i+1]-a[i];

        }
        System.out.println(c-(n-1));
    }
}
