import java.util.*;

public class ks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p = t;
        LinkedHashMap<Integer, Integer>  result = new LinkedHashMap<>();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
            int[] a = new int[n];
            int[] f = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int c = 0;
                while (a[i] > k) {
                    a[i] = a[i] - k;
                    c++;
                }
                f[i] = c;
            }
            for (int i = 0; i < f.length; i++) {
                mp.put(i, f[i]);
            }
            List<Map.Entry<Integer, Integer>> capitalList = new LinkedList<>(mp.entrySet());

            Collections.sort(capitalList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

            for (Map.Entry<Integer, Integer> entry : capitalList) {
                result.put(entry.getKey(), entry.getValue());
            }
            System.out.print("Case #" + (p - t) + ":" + " ");
            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                System.out.print(entry.getKey() + 1 + " ");
            }
            System.out.println();
        }
    }
}

