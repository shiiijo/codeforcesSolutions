import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int v=0;
        int s1=0,s2=0;
        int u=0,l=0;
        while(t-->0){
            u=sc.nextInt();
            l=sc.nextInt();
            s1+=u;
            s2+=l;
            if(u%2!=l%2)
                v++;

        }
        s1=s1%2;
        s2=s2%2;
        if( s1 == 0 && s2== 0) {
            System.out.println(0);
        } else if(s1 != s2|| v == 0) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }
    }
}
