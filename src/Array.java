import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int m=0,z=0,o=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            if(a[i]<0)
                m++;
            else if(a[i]>0)
                o++;
            else z++;
        }
        Arrays.sort(a);
        System.out.println(1+" "+a[0]);
        if(o>0){
            System.out.println(1+" "+a[a.length-1]);
            System.out.println((a.length-2));
            for (int i = 1; i < a.length-1; i++) {
                System.out.println(a[i]);
            }
        }
        else {
            System.out.println(2+" "+a[1]+" "+a[2]);
            System.out.println(a.length-3);
            for (int i = 3; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}