import java.util.Scanner;

public class petyaAndOrgami {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rr=2*n;
        int gr=5*n;
        int br=8*n;
        System.out.println((long)(Math.ceil(rr*1.0/k)+Math.ceil(gr*1.0/k)+Math.ceil(br*1.0/k)));

    }
}
