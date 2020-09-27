import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Unary {
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
        PrintWriter out=new PrintWriter(System.out);
        String s=sc.next();
        String ans="";
        int mod=1000003;
        char[]c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='>'){
                ans+="1000";
            }
            else if(c[i]=='<'){
                ans+="1001";
            }
            else if(c[i]=='+'){
                ans+="1010";
            }
            else if(c[i]=='-'){
                ans+="1011";
            }
            else if(c[i]=='.'){
                ans+="1100";
            }
            else if(c[i]==','){
                ans+="1101";
            }
            else if(c[i]=='['){
                ans+="1110";
            }
            else if(c[i]==']'){
                ans+="1111";
            }
        }
        int k = ans.length();
        int base = 1;
        int sol = 0;
        for(int i=k-1;i>=0;i--){
            if(ans.charAt(i)=='1') sol=(sol+base)%mod;
            base=(base*2)%mod;
        }
        out.print(sol);
        out.close();
        out.close();
    }
}
