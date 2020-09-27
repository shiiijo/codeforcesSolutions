import java.util.Scanner;

public class CollectingBeatsisFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=4;
        boolean x=false;
        while(n-->0){
            String s=sc.next();
            for(int i=0;i<4;i++) {
                if (s.charAt(i) != '.') {
                    int p=Integer.parseInt(String.valueOf(s.charAt(i)));
                    if (p<=2*k)
                        x = true;
                    else {
                        x = false;
                    }
                    p=0;
                }
            }
        }
        if(x) System.out.println("YES");
        else System.out.println("NO");
    }
}
