import java.util.Scanner;

public class jzhuAndSequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int n=sc.nextInt();
        int[]a={(x-y),x,y,(y-x),-x,-y};
        long mod= (long) (1e9+7);
        int ans= (int) ((a[n%6])%mod);
        if(ans<0){
            System.out.println(ans+mod);
        }
        else{
            System.out.println(ans);
        }
    }
}

