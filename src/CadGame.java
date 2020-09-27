import java.util.Scanner;

public class CadGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<10 && b<10) System.out.println(1+" "+1);
            else if(a<10 && b>10) System.out.println(0+" "+1);
            else if(b<10 &&a>10) System.out.println(1+" "+1);
            else{
                int x=a/2; int y=b/2;
                String s1=Integer.toString(x);
                String s2=Integer.toString(y);
              //  System.out.println(s1.length()+" "+s2.length());
                if(s1.length()>s2.length()) System.out.println(1+" "+s1.length());
                else if(s2.length()>s1.length()) System.out.println(0+" "+s2.length());
                else System.out.println(1+" "+s2.length());
            }
        }
    }
}
