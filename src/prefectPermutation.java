import java.util.Scanner;

public class prefectPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println("-1");
        }
        else{
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.println(i-1);
                }
                else{
                    System.out.println(i+1);
                }
            }
        }
    }
}
