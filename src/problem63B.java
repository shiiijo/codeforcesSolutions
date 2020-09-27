import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
//codeforces.com/problemset/problem/63/B

public class problem63B {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter w=new PrintWriter(System.out);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]a=new int[n+1];
        int c=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=0;
        while(a[0]!=k)
        {
            for(int i=0;i<n;i++)
                if(a[i]!=a[i+1])
                    a[i]++;
            ans++;
        }
        w.println(ans);
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


