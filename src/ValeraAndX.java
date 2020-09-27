import java.util.Scanner;

public class ValeraAndX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][]c=new char[n][n];
        char fir,sec;
        boolean x=false;
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                c[i][j]=s.charAt(j);
                fir=c[0][0];
                sec=c[0][1];
                if(i==j){
                    if(fir!=c[i][j])
                       x=true;
                }
                else if(i==n-1-j){
                    if(fir!=c[i][j])
                        x=true;
                }
                else{
                    if(sec!=c[i][j] || fir==c[i][j])
                        x=true;
                }
            }
        }
        if(x)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
