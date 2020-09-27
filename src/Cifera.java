import java.util.Scanner;

public class Cifera {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int num=sc.nextInt();
        int c=-1;
        while(num%k==0){
            num/=k;
            c++;
        }
        if(c>=0 && num==1) {
            System.out.println("YES");
            System.out.println(c);
        }
        else
            System.out.println("NO");
    }

}
