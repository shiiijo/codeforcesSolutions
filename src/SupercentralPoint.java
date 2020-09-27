import java.util.Scanner;

public class SupercentralPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int[]a=new int[n];
        int[]b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           int right=0,left=0,up=0,down=0;
            for(int j=0;j<n;j++){
                if(b[i]==b[j]){
                    if(a[i]>a[j]){
                         right++;
                    }
                    if (a[j]>a[i]) {
                        left++;
                    }
                }
                if(a[i]==a[j]){
                    if(b[i]>b[j]){
                        up++;
                    }
                    if(b[j]>b[i]){
                        down++;
                    }
                }

            }
            if(right>0 && left>0 && up>0 && down>0)
                ans++;
        }
        System.out.println(ans);

    }
}
