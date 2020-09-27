import java.util.Scanner;

public class keyRaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int f1=(n*v1)+(2*t1);
        int f2=(n*v2)+(2*t2);
        if(f1<f2){
            System.out.println("First");
        }
        else if(f1>f2){
            System.out.println("Second");
        }else{
            System.out.println("Friendship");
        }
    }
}