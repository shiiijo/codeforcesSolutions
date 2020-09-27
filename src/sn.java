import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sn{
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        int t=sc.nextInt();
        int c;
        while(t-->0){
            c=0;
            int k=0;
            int n=sc.nextInt();
            int[]a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]==1){
                    k++;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]==1){
                    c++;
                }
                else{
                    break;
                }
            }
            if(k==a.length){
                System.out.println(k%2!=0?"First":"Second");
            }
            else {
                System.out.println(c%2==0?"First":"Second");
            }
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
