import java.util.Scanner;

public class Worms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean x=false;
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j=0; j<n; j++) {
                for (int k =0; k<n; k++) {
                    if (a[j] + a[i] == a[k]) {
                        if(i!=j && j!=k && i!=k) {
                            System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                            return;
                        }
                    }
                }
            }
        }
            System.out.println(-1);
    }
}
