import java.util.Scanner;

public class ShashaANDSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if((k==1 && n==1) ){
            System.out.println("YES");
        }
        else if((n/k)%2!=0){
            System.out.println("YES");

        }
        else{
            System.out.println("NO");
        }




    }
}
