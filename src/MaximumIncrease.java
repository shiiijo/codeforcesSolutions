import java.util.ArrayList;
import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        int[]a=new int[n];
        int c=1;int m=1;
        for(int i=0;i<a.length;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++) {
            if (a[i] < a[i + 1]) {
                c += 1;
                if (m < c) {
                    m = c;
                }
            }
                else {
                    c = 1;
                }
            }

        System.out.println(m);
        }

    }

