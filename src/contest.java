import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System .in);
        long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
        long mis=Math.max(3*a/10,a-a/250*c);
        long vas=Math.max((3*b)/10,b-b/250*d);
        if(mis>vas){
            System.out.println("Misha");
        }
      else if(vas>mis){
            System.out.println("Vasya");
        }
        else{
            System.out.println("Tie");
        }
    }
}
