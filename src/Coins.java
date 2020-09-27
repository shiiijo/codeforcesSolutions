import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int c=0;
        if(s%n!=0){
            c=1;
        }
            c+=s/n;
        System.out.println(c);

    }
}
