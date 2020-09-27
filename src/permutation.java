import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class permutation {
    public static void main(String[] args) {
    FastReader sc=new FastReader();
        PrintWriter w=new PrintWriter(System.out);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]a=new int[2*n+1];
        for(int i=1;i<a.length;i++){
            a[i]=i;
        }
      for(int i=1;i<=k;i++){
          a[2*i]=2*i-1;
          a[2*i-1]=2*i;
      }
      for(int i=1;i<=2*n;i++){
          System.out.print((a[i])+" ");
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
