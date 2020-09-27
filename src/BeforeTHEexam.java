import java.io.*;
import java.util.StringTokenizer;

public class BeforeTHEexam {
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
    public static void main(String[] args) throws Exception
    {
        PrintWriter w = new PrintWriter(System.out);
        FastReader sc = new FastReader();
        int i,j=0;
        int d = sc.nextInt();
        int t = sc.nextInt();
        int a[][] = new int[d][2];
        int smin = 0 , smax = 0;
        for(i=0;i<d;i++){
            a[i][0] = sc.nextInt();
            smin += a[i][0];
            a[i][1] = sc.nextInt();
            smax += a[i][1];
        }

        if(smin<=t && smax>=t){
            w.println("YES");
            int sum = t - smin;
            int b[] = new int[d];
            for(i=0;i<d;i++){
                int temp = a[i][1] - a[i][0];
                b[i]= a[i][0] + Math.min(temp,sum);
                sum -= temp;
                if(sum<=0) sum=0;

            }
            for(i=0;i<d;i++) w.print(b[i]+" ");
        }
        else w.print("NO");

        w.close();
    }


}

