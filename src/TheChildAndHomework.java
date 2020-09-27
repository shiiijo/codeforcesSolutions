import java.util.Scanner;

public class TheChildAndHomework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int a=s1.length()-2;
        int x=a/2;
        String s2=sc.next();
        int b=s2.length()-2;
        int y=b/2;
        String s3=sc.next();
        int c=s3.length()-2;
        int z=c/2;
        String s4=sc.next();
        int d=s4.length()-2;
        int o=d/2;
        if(b==2*a && c==2*b && d==2*c){
            System.out.println("C");
        }
      else if(a<=y && a<=z && a<=o){
            System.out.println("A");
        }
        else if(b<=x && b<=z && b<=o){
            System.out.println("B");
        }
        else if(c<=x && c<=y && c<=o){
            System.out.println("C");
        }
        else if(d<=x && d<=y && d<=z){
            System.out.println("D");
        }
        else if(a>=2*b && a>=2*c && a>=2*d){
            System.out.println("A");
        }
        else if(b>=2*a && b>=2*c && b>=2*d){
            System.out.println("B");
        }
        else if(c>=2*a && c>=2*b && c>=2*d){
            System.out.println("C");
        }
        else if(d>=2*a && d>=2*b && d>=2*c){
            System.out.println("D");
        }
        else
            System.out.println("C");
    }
}
