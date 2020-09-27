import java.util.Arrays;
import java.util.Scanner;

public class ThreePirwiseMaximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int[]a=new int[3];
            for(int i=0;i<3;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            if(a[1]<a[2]){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                if (a[0] < a[1]) {
                    a[1] = a[0];
                }

                for (int i = 0; i < 3; i++) {
                    System.out.print(a[i] + " ");
                }

                System.out.println("");
            }

        }
    }

}
