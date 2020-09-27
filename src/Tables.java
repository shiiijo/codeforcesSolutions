import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean x=false;
        int[][]a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    if(i==0 || i==n-1 || j==0 || j==m-1){
                        x=true;
                    }
                }
            }
        }
        if(x) System.out.println(2);
        else System.out.println(4);
    }
}
