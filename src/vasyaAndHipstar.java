import java.util.Scanner;

public class vasyaAndHipstar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans1=Math.min(a,b);
        int maximum=Math.max(a,b);
        int c=maximum-ans1;
        int ans2=c/2;
        System.out.println(ans1+" "+ans2);
    }
}
