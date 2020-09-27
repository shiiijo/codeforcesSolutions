import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GeorgeANDround {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
    public static void main(String[] args) throws IOException {
        FastReader sc=new FastReader();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]r=new int[n];
        int[]a=new int[m];
        for(int i=0;i<n;i++)r[i]=sc.nextInt();
        for(int i=0;i<m;i++)a[i]=sc.nextInt();
        int j=0;
        j=0;
        int nas = 0;
        for(int i=0;i<m&&j<n;i++){
            if(a[i]>=r[j]){
                j++;
                nas++;
            }
        }
        System.out.println(n-nas);
    }
}
