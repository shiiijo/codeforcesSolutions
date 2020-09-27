import java.util.Scanner;

public class shovelsandswords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=0;
            if(Math.max(a,b)>2*(Math.min(a,b))){
                System.out.println(Math.min(a,b));
            }
            else {
                System.out.println((a+b)/3);
            }
        }
    }
}
