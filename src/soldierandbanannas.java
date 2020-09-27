import java.util.Scanner;

public class soldierandbanannas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int tot=0;
        int borrow=0;
        for(int i=1;i<=w;i++){
            tot+=k*i;
        }
        borrow=tot-n;
        if(borrow<0){
            System.out.println("0");
        }
        else{

        System.out.println(borrow);

    }
}}
