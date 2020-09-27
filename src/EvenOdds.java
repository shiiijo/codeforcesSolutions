import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long totalEven, totalOdd; //the total no of terms in odd and even
        if (n % 2 == 0) {
            //Even case
            totalEven = ((n - 2) / 2) + 1;
            totalOdd = ((n - 1 - 1) / 2) + 1;
        } else {
            totalOdd = ((n - 1) / 2) + 1;
            totalEven = ((n - 2) / 2) + 1;
        }
        if (k > totalOdd) {
            k = k - totalOdd;
            System.out.println(k * 2);
            return;
        }

        System.out.println(k * 2 - 1);

    }
}


