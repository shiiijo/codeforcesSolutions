
    import java.util.*;


    public class chatRoom {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String ans = "hello";
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (ans.length() > c && s.charAt(i) == ans.charAt(c)) {
                    c++;
                }
            }
            if (ans.length() == c) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        }
