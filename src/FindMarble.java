import java.util.Scanner;

public class FindMarble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;

        int n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int a[] = new int[n+1];

        for(i=1;i<=n;i++)  a[i] = sc.nextInt();
        int ans = 0;

        if(s==t) System.out.print(ans);
        else{
            boolean tf = false;
            i=1;
            j=s;
            while(!tf && i<=n){
                int f = a[j];
                if(f == t) {tf = true; break;}
                j=f;
                i++;
            }

            if(tf) System.out.print(i);
            else System.out.print("-1");
        }
        }
    }
