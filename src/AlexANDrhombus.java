import java.util.Scanner;

public class AlexANDrhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((int)(Math.pow(n,2)+Math.pow(n-1,2)));
    }
}
