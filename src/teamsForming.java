import java.util.*;

public class teamsForming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       int[] a=new int[n];
       int sum=0;
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       }
        Arrays.sort(a);
       for(int i=0;i<n-1;i++){
           sum+=(a[i+1]-a[i]);
           i++;
       }
        System.out.println(sum);

    }
}

