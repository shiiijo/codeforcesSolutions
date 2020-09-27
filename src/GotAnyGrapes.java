

import java.util.Scanner;

public class GotAnyGrapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        int a,b,c;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(x<=a &&  y<=a+b-x && z<=a+b+c-x-y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


    }
}
