import java.util.Scanner;

public class AcaciusandString {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String ans = "abacaba";
            String ans2="???????";
            String ans3="?";
            int M = ans.length();
            int N = s.length();
            int res = 0;
            for (int i = 0; i <= N - M; i++) {
                int j;
                for (j = 0; j < M; j++) {
                    if (s.charAt(i + j) != ans.charAt(j)) {
                        break;
                    }
                }
                if (j == M) {
                    res++;
                    j = 0;
                }
            }
            if(s.contains(ans)) {
                System.out.println("yes");
            }
            else if(s.contains(ans2)){
                s=s.replace(ans2,ans);
                System.out.println("YES");
            }
            else{
                System.out.println("no");
            }

        }
    }
}








