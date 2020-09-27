import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class coins2b {
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
        int n=sc.nextInt();
        int i,j=0;
        if(n==1) out.print(n);

        else{
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            int cur = 1;
            for(i=2;i<=n;i++){
                if( n%i==0 && i%cur==0) {arr.add(i); cur=i;}
            }
            int l = arr.size();
            // w.println(l);
            for(i=l-1;i>=0;i--) out.print(arr.get(i)+" ");
        }
        out.close();
        out.flush();
    }
    static boolean primes(int n){
        if(n==2){
            return true;
        }
        else if(n%2==0){
            return false;
        }
        else{

            for(int i=3;i*i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
