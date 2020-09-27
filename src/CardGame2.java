import java.util.Scanner;

public class CardGame2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s1=sc.next(); char[] a=s1.toCharArray();
       String s2=sc.next(); char[] b=s2.toCharArray();
       String s3=sc.next(); char[] c=s3.toCharArray();
        if(b[1]==a[0] && c[1]!=a[0])
            System.out.println("YES");
        else if(b[1]==c[1])
        {
            if(b[0]=='T')
                b[0]='A';
            else if(b[0]=='A')
                b[0]='T';
            else if(b[0]=='K')
                b[0]='R';
            if(c[0]=='T')
                c[0]='A';
            else if(c[0]=='A')
                c[0]='T';
            else if(c[0]=='K')
                c[0]='R';
            if(b[0]>c[0])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else
            System.out.println("NO");
    }
}
