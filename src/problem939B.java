import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class problem939B {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        PrintWriter w=new PrintWriter(System.out);
        StringBuffer out=new StringBuffer();
        long n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            int a1 = -1, a2 =-1, maxt = 0;
                int x=sc.nextInt();
                int cur = (int) (n/x);
                if(maxt<cur*x)
                {
                    a1 = i+1;
                    a2 = cur;
                    maxt = cur*x;
                }

            if(a1==-1) {
                System.out.println(1 + " " + 0);
                return;
            }
            else
                System.out.println(a1+" "+a2);
            break;

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
