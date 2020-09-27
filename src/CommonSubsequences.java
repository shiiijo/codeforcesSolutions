import java.util.Scanner;

public class CommonSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            int[] ans=new int[1];
            int c=0;
            boolean x=false;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }
            for(int i=0;i<n;i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i] == b[j]) {
                        for (int k = 0; k < ans.length; k++) {
                            ans[k] = a[i];
                            x = true;
                            break;
                        }
                    }
                }
            }

       if(x){
           System.out.println("YES");
           System.out.println(1+" "+ans[0]);
       }
       else{
           System.out.println("NO");
       }

        }
    }
}






