import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int c=0;
        while(n-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(b>a)
                c++;
        }
        if(c>0){
            System.out.println("Happy Alex");
        }
        else{
            System.out.println("Poor Alex");
        }
    }
}
