import java.util.Scanner;

public class DevutheSingerandChurutheJoker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[]a=new int[n];
        long sum=0;
        long sol=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int m= (int) ((n-1)*10+sum);
        if(m<=d){
            sol=(n-1)*2+(d-m)/5;
            System.out.println(sol);
        }

        else if(d<m)
            System.out.println(-1);
    }
}
