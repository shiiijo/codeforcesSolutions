import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class subsetmex{
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter w = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = 0;
            int b=0;
            int[]f=new int[101];
            int[]a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                f[a[i]]++;
            }
            for(int i=0;i<f.length;i++){
                if(f[i]>0){
                    f[i]--;
                }
                else{
                    c=i;
                    break;
                }
            }
            for(int i=0;i<f.length;i++){
                if(f[i]>0){
                    f[i]--;
                }
                else{
                    b=i;
                    break;
                }
            }
            w.println(b+c);
        }
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



