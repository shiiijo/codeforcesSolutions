import java.util.Scanner;

public class TWOrabbits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            if((y-x)%(a+b)==0){
                System.out.println((y-x)/(a+b));
            }
            else{
                System.out.println("-1");
            }


                }

    }
}
