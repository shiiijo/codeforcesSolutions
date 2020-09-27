import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ArtUnion {
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

    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter w=new PrintWriter(System.out);
        int i,j=0;
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int ans[] = new int[m];
        int free = 0;

        for(i=0;i<n;i++){
            free = 0;
            for(j=0;j<m;j++){
                int max = Math.max(free , ans[j]);
                ans[j]  = max + a[j][i];
                free = ans[j];
            }

        }

        for(i=0;i<m;i++) w.print(ans[i]+" ");
        w.close();
    }
}
