import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//https://codeforces.com/problemset/problem/862/A
public class problem862A {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter w = new PrintWriter(System.out);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int count = 0; int t=0;
        for (int i = 0; i < n; i++) {
            int x= sc.nextInt(); if(x<m || m==0&&x==0)
                count++;
            if(x==m)
                t=1;
        }
        w.print(m-count<0?1:m-count+t);
        w.close();
        w.flush();
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
