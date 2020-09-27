import java.util.Scanner;

public class NastyaAndReadingBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[t];
        int[] b = new int[t];
        int c=0;
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for(int i=0;i<t;i++){
            if(n>b[i]){
                c++;
            }
            else
                continue;
        }
        System.out.println(t-c);
    }
}

