import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class RoadsideTReees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int sum=a[0]+1;
        for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                sum+=2;
            }
            else {
                sum+=abs(a[i]-a[i+1])+2;
            }
        }
        System.out.println(sum);
    }
}

