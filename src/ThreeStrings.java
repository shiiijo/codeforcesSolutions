

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k=0;
        while(t-->0)
        {
           String a=sc.next();
           String b=sc.next();
           String c=sc.next();
           boolean x=false;
           for(int i=0;i<a.length();i++) {
               if (a.charAt(i) != c.charAt(i) && b.charAt(i) != c.charAt(i)) {
                   x = true;
               }
           }
           if(x)
               System.out.println("NO");

           else
               System.out.println("YES");

        }

    }
}

