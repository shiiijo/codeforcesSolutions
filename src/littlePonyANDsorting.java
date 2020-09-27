import java.util.Scanner;

public class littlePonyANDsorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int[] a = new int[n];
        for (i = 0; i < n; i++) a[i] = sc.nextInt();
        int ind = -1 , flag = 0;
        for(i=1;i<n;i++){
            if(a[i]<a[i-1]){
                if(a[0]>=a[n-1]){
                    ind = i;
                    flag++;
                }
                else flag+=2;
            }
        }

        if(flag>1){
            System.out.print("-1");}
        else{
            if(ind == -1)  {
                System.out.print("0");}
            else{
                System.out.print(n-ind);
            }
        }
    }
}
