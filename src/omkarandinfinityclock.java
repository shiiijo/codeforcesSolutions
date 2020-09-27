import java.util.Scanner;

public class omkarandinfinityclock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                long[] a = new long[n];
                long[] b = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                long max1=Integer.MIN_VALUE;
                for(int i=0;i<n;i++){
                    if(a[i]>max1){
                        max1=a[i];
                    }
                }
                for(int i=0;i<n;i++){
                    a[i]=max1-a[i];
                }
                long max2=Integer.MIN_VALUE;
                for(int i=0;i<n;i++){
                    if(a[i]>max2)
                        max2=a[i];
                }
                for(int i=0;i<n;i++){
                    b[i]=max2-a[i];
                }
                if(k%2==0){
                    for(int i=0;i<n;i++){
                        System.out.print(b[i]+" ");
                    }
                    System.out.print("\n");
                }
                else{
                    for(int i=0;i<n;i++){
                        System.out.print(a[i]+" ");
                    }
                    System.out.print("\n");
                }
            }


        } catch (Exception e) {
            return;
        }
    }
}
