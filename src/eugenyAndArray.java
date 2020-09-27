import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class eugenyAndArray {
    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        int k = sc.nextInt();

        int p = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            if (r == -1) p++;
            else q++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int d = y - x + 1;
            if (d % 2 == 1) sb.append(0);
            else {
                int h = d / 2;
                if (p >= h && q >= h) sb.append(1);
                else sb.append(0);
            }
            sb.append("\n");
        }
        System.out.println(sb);

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

        static int binarySearch(long a[], long k, int l, int h) {
            int min = Integer.MAX_VALUE;
            while (l <= h) {
                int mid = (l + h) / 2;
                if (a[mid] == k) return mid;
                else if (a[mid] > k) h = mid - 1;
                else if (a[mid] < k) l = mid + 1;
            }

            return min;
        }

    }
}
