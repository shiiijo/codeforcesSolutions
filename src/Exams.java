import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(k<3*n){
            System.out.println(3*n-k);
        }
        else
            System.out.println(0);
    }
}

