import java.util.Scanner;

public class LittleElephantandMagicSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]a=new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
        }
        sum=sum/2;
        a[0][0]=sum-(a[0][1]+a[0][2]);
        a[1][1]=sum-(a[1][0]+a[1][2]);
        a[2][2]=sum-(a[2][0]+a[2][1]);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }


    }
}
