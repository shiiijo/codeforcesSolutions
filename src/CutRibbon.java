import java.util.Scanner;

public class CutRibbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int ans=0;

        for(int x=0;x<=4000;x++){
            for(int y=0;y<=4000;y++){
                int zc=n-(x*a+y*b);
                if(zc<0)
                    break;
                double z=(zc/(double)c);
                if(z==(int)z)
                    ans= (int) Math.max(ans,(int)x+y+z);

            }
        }

        System.out.println(ans);
    }
}



