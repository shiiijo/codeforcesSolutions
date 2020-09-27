import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RoadCostruction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> s=new HashSet<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        m*=2;
        while(m-->0){
            s.add(sc.nextInt());
        }
        int k=0;
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
                k=i;
                break;
            }
        }
        System.out.println(n-1);
        for(int i=1;i<=n;i++){
            if(i!=k){
                System.out.println(i+" "+k);
            }
        }
    }
}
