import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        boolean x=false;
        Set<Integer> s=new HashSet<>();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            while(n-->0){
                int a=sc.nextInt();
                s.add(a);
            }
            int ans=0;
            while(m-->0) {
                int p=sc.nextInt();
                if(s.contains(p)==true){
                    x=true;
                     ans=p;
                }
            }
            if(x==true && s.contains(ans)==true){
                System.out.println("YES");
                System.out.println(1+" "+ans);
            }
            else {
                System.out.println("NO");
            }

        }
    }
}