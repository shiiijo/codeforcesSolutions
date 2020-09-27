import java.util.Scanner;

public class VasyaAndDigitalRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long k=sc.nextLong();
        long d=sc.nextLong();
         if(d>0){
            System.out.print(d);
            while(k-->1){
                System.out.print(0);
            }
        }
        else{
            if(k==1){
                System.out.println(0);
            }
            else
            System.out.println("No solution");
        }
    }
}
