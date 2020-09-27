

import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int[]x=new int[n];
        int[]y=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            } int p=0;
            for(int i=0; i<n; i++){
                for(int j=0;j<n;j++)
                { if((s>x[j])&&(x[j]>0))
                {
                    s+=y[j];
                    x[j]=0;
                    y[j]=0;
                    p++;

                }
                }
                if(p==n){
                    System.out.println("YES");
                    break;
                }
            }if(p<n)
            System.out.println("NO");
        }


    }

