import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        Vector<Integer> ans = new Vector<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            if (map.get(a[i]) == null) {
                ans.add(a[i]);
            }
            map.put(a[i], true);
        }
        System.out.println(ans.size());
        Collections.reverse(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}



