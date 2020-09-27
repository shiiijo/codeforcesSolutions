import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,k=2 * 1000 * 1000 * 1000,j=-k;
        int n = sc.nextInt();
        for(i=0;i<n;i++){
            String sign = sc.next();
            int a = Integer.parseInt(sc.next());
            String ans = sc.next();

            if(sign.equals(">")){
                if(ans.equals("Y"))
                    j = Math.max(a+1,j);
                else k = Math.min(a,k);
            }
            else if(sign.equals(">=")){
                if(ans.equals("Y"))
                    j = Math.max(a,j);
                else k = Math.min(a-1,k);
            }
            else if(sign.equals("<")){
                if(ans.equals("Y"))
                    k = Math.min(a-1,k);
                else j = Math.max(a,j);
            }
            else if(sign.equals("<=")){
                if(ans.equals("Y"))
                    k = Math.min(a,k);
                else j = Math.max(a+1,j);
            }

        }
        boolean  t = false;
        int ans = 0;
        for(i=j;i<=k;i++) {ans = i; t=true; break;}
        if(t) System.out.println(ans);
        else System.out.println("Impossible");

    }
}

