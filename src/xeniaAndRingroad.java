import java.util.Scanner;

public class xeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[m];
        long max = 0;
        for(int i=0;i<m;i++) a[i] = sc.nextInt();
        max += a[0] - 1;
        for(int i=1;i<m;i++){
            if(a[i]-a[i-1]<0){
                max += a[i]-a[i-1] + n;
            }
            else max += a[i]-a[i-1];
        }
        System.out.println(max);
    }
}
