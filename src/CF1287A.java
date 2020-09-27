

import java.util.Scanner;

public class CF1287A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            String s=sc.next();

                int pos = 0;
                boolean ok = false;
                for (int i = 0; i < n; ++i) {
                    if(s.charAt(i) == 'A') {
                        pos = i;
                        ok = true;
                        break;
                    }
                }

                int ans = 0, cnt = 0;
                for (int i = pos; i < n && ok; ++i) {
                    if(s.charAt(i) == 'A') {
                        ans = Math.max(ans, cnt);
                        cnt = 0;
                    }
                    else cnt++;
                }
                ans =Math. max(ans, cnt);
            System.out.println(ans);
            }
    }


        }






