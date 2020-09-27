import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayCancellation {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            Long n = sc.nextLong();
            Long[] a = new Long[Math.toIntExact(n)];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            Long tot = Long.valueOf(0);
            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    tot += a[i];
                } else {
                    Long k = Math.min(tot, -a[i]);
                    a[i] += k;
                    tot -= k;
                }
            }
            tot = Long.valueOf(0);
            for (int i = 0; i < n; i++) {
                if (a[i] < 0) {
                    tot += Math.abs(a[i]);
                }
            }
            System.out.println(tot);
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
