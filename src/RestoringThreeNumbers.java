
import java.util.*;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[3]-a[2]+" ");
        System.out.print(a[3]-a[1]+" ");
        System.out.print(a[3]-a[0]);
    }
}
