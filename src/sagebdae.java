import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sagebdae{
    public static void main(String[] args) {
    FastReader sc=new FastReader();
   // int t=sc.nextInt();
        int t=1;
    while(t-->0) {
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int ans=0;
        int p=0;
        if(n%2==0)p=n-2;
        else{
            p=n-1;
        }
        Arrays.sort(a);
        for(int i=0;i<p;i+=2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            ans++;
        }
        System.out.println(ans);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
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
