import java.util.Scanner;

public class FrogJumping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();
            if(k%2==0){
                System.out.println(((k/2)*a)-((k/2)*b));
            }
            else{
                System.out.println(((k/2)+1)*a-((k/2)*b));
            }
        }
    }
}
