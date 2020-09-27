import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class VasyaAndwrestling {
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

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter w=new PrintWriter(System.out);
        int i , j=0;
        int n = sc.nextInt();
        ArrayList<Integer> f = new ArrayList<Integer>();
        ArrayList<Integer> s = new ArrayList<Integer>();

        long sa = 0 , sb = 0;
        int lf = 0 , ls = 0;
        int b=0;
        for(i=0;i<n;i++){
            int a = sc.nextInt();
            if(i==n-1) b = a;

            if(a>0){
                sa += a;
                f.add(a);
            }
            else{
                a = Math.abs(a);
                sb += a;
                s.add(a);
            }
        }

        lf = f.size();
        ls = s.size();

        if(sa>sb) w.print("first");
        else if(sb>sa)  w.print("second");
        else{

            for(i=0;i<Math.min(lf,ls);i++){
                if(s.get(i)>f.get(i)){w.print("second"); j=1;break;}
                else if(s.get(i)<f.get(i)){w.print("first");j=1; break;}
            }

            if(j==0){
                if(lf>ls) {w.print("first"); j=1;}
                else if(ls>lf) {w.print("second"); j=1;}
            }
            if(j==0){
                if(b>0) w.print("first");
                else  w.print("second");
            }
        }
        w.flush();
        w.close();
    }
}
