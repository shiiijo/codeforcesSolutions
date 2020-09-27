import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class RestorethePermutationbyMerger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[2*n];

            for (int i = 0; i < (2 * n); i++) {
                a[i] = sc.nextInt();

            }
            Vector<Integer> ans = new Vector<>();
            HashMap<Integer, Boolean> map = new HashMap<>();
            for (int i =2*n - 1; i >=0; i--) {
                if (map.get(a[i]) == null) {
                    ans.add(a[i]);
                }
                map.put(a[i], true);
            }
            Collections.reverse(ans);
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println("");
        }
    }
}



