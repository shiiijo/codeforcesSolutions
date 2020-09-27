import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class RookBishopandKing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c1=sc.nextInt();
        int r1=sc.nextInt();
        int c2=sc.nextInt();
        int r2=sc.nextInt();
        int rook=0; int bishop=0; int king=0;
        if(c1==c2 || r1==r2) rook=1;
        else rook=2;
        if(abs(c2-c1)==abs(r2-r1)) bishop=1;
        else if((r1+c1)%2!=(r2+c2)%2) bishop=0;
        else bishop=2;
        king =Math.max(Math.abs(r1-r2),Math.abs(c1-c2));
        System.out.println(rook+" "+bishop+" "+king);
    }
}
