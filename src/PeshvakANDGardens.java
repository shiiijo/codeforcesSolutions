import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;
import static java.lang.StrictMath.abs;

public class PeshvakANDGardens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        if(x2==x1)
            System.out.println((x1+(Math.abs(y2-y1)))+" "+y1+" "+(x1+(Math.abs(y2-y1))+" "+y2));
        else if(y2==y1)
            System.out.println(x1+" "+(y1+(abs(x2-x1)))+" "+x2+" "+(y1+(abs(x2-x1))));
        else if(y2-y1==x2-x1)
            System.out.println(max(x1,x2)+" "+min(y1,y2)+" "+min(x1,x2)+" "+max(y1,y2));
        else if((y2-y1)+(x2-x1)==0)
            System.out.println(max(x1,x2)+" "+max(y1,y2)+" "+min(x1,x2)+" "+min(y1,y2));
        else
            System.out.println(-1);
    }
}
