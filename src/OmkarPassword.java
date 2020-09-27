import java.util.Scanner;

public class OmkarPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[]a=new int[n];
            boolean x=true;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(a[i]!=a[0]){
                    x=false;
                }
            }
            System.out.println(x?n:1);
        }
    }
}
