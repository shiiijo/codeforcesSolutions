import java.util.Scanner;

public class MinimumDifficulty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int best=100000;
        for (int i=1; i+1<n; i++) {
            int diff=0;
            for (int j=0; j+1<n; j++)
                if (j+1==i)
                    diff=Math.max(diff, a[j+2]-a[j]);
                else
                    diff=Math.max(diff, a[j+1]-a[j]);
            best=Math.min(best, diff);
        }
        System.out.println(best);
    }
}
