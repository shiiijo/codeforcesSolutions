import java.util.Scanner;

public class LittlepigsAndwolves {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        char[][] a=new char[r][c];
        for(int i=0;i<r;i++){
            a[i]=sc.next().toCharArray();
        }
        int ans=0,ind1=0,ind2=0,w=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int k=0;

                if(a[i][j]=='W'){
                    w++;
                    if(i<r-1&&a[i+1][j]=='P'){
                        k++;
                        ind1=i+1;ind2=j;
                    }
                    if(i>0&&a[i-1][j]=='P'){
                        k++;
                        ind1=i-1;ind2=j;
                    }
                    if(j<c-1&&a[i][j+1]=='P'){
                        k++;
                        ind1=i;ind2=j+1;
                    }
                    if(j>0&&a[i][j-1]=='P'){
                        k++;
                        ind1=i;ind2=j-1;
                    }
                    if(k>=1)
                        w++;
                    if(k==1){
                        a[i][j]='.';
                        a[ind1][ind2]='.';
                        w--;
                        ans++;
                    }
                }

            }

        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int k=0;

                if(a[i][j]=='W'){
                    w++;
                    if(i<r-1&&a[i+1][j]=='P'){
                        k++;
                        ind1=i+1;ind2=j;
                    }
                    if(i>0&&a[i-1][j]=='P'){
                        k++;
                        ind1=i-1;ind2=j;
                    }
                    if(j<c-1&&a[i][j+1]=='P'){
                        k++;
                        ind1=i;ind2=j+1;
                    }
                    if(j>0&&a[i][j-1]=='P'){
                        k++;
                        ind1=i;ind2=j-1;
                    }
                    if(k>=1)
                        w++;
                    if(k>0){
                        a[i][j]='.';
                        a[ind1][ind2]='.';

                        ans++;
                    }
                }

            }

        }
        System.out.println(ans);

    }
}
