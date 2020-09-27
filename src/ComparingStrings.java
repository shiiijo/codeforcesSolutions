import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();


        int l1 = s1.length();
        int l2 = s2.length();

        if (l1 != l2) System.out.println("NO");
        else {
            int a[] = new int[26];
            int b[] = new int[26];

            for (i = 0; i < l1; i++) {
                a[s1.charAt(i) - 'a']++;
            }

            for (i = 0; i < l2; i++) {
                b[s2.charAt(i) - 'a']++;
            }

            boolean t = true;

            for (i = 0; i < 26; i++) {
                if (a[i] != b[i]) {
                    t = false;
                    break;
                }
            }

            if (!t) System.out.print("NO");
            else {
                int c = 0;

                for (i = 0; i < l1; i++) {
                    if (s1.charAt(i) != s2.charAt(i)) c++;
                }
                if (c == 2) System.out.print("YES");
                else System.out.print("NO");
            }
        }
    }
}