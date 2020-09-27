import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class petyaANDcountryside {
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
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        int a[]=new int[n];
        int i,j,k=0,water=0,check;
        for(i=0;i<n;i++) a[i]= sc.nextInt();

        int w[]=new int[n];
        for(i=0;i<n;i++){
            water = 1;
            if(i==0){
                check = a[i];
                for(j=i+1;j<n;j++){
                    if(check >= a[j]) {water++; check=a[j];}
                    else break;
                }
                w[k++] = water;
            }

            else if(i>0 && i<n-1){
                check = a[i];
                for(j=i-1;j>=0;j--){
                    if(check >= a[j]) {water++; check=a[j];}
                    else break;
                }
                check = a[i];
                for(j=i+1;j<n;j++){
                    if(check >= a[j]) {water++; check=a[j];}
                    else break;
                }
                w[k++] = water;
            }

            else if(i==n-1){
                check = a[i];
                for(j=i-1;j>=0;j--){
                    if(check >= a[j]) {water++; check=a[j];}
                    else break;
                }
                w[k++]=water;
            }

        }

        int max=w[0];
        for(i=1;i<n;i++){
            if(max<w[i]) max=w[i];
        }
        out.print(max);
        out.close();
        out.flush();

    }
}
