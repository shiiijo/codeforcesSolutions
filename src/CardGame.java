import java.util.Arrays;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k1 = sc.nextInt();
            int k2=  sc.nextInt();
            int[]s1=new int[k1];
            int[]s2=new int[k2];
             int sum1=0; int sum2=0;
            for(int i=0;i<s1.length;i++){
                s1[i]=sc.nextInt();
            }
            Arrays.sort(s1);
            for(int i=0;i<s2.length;i++){
                s2[i]=sc.nextInt();
            }
            Arrays.sort(s2);
            if(s1[s1.length-1]>s2[s2.length-1]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
