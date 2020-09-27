import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Reading {
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

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]a=new int[n];
        int[]b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=1;i<n;i++){
            min=Math.min(a[i],min);
        }
     //   System.out.println(min);
        if(n!=k){
            for(int i=0;i<n;i++){
                    if (a[i] > min) {
                        b[i] = (i+1);
                    }
            }
        }
        Arrays.sort(a);
        System.out.println(a[1]);
        for(int i=0;i<n;i++){
            if(b[i]>0){
                while(k-->0) {
                    out.print(b[i] + " ");
                }
            }
        }
        out.flush();
        out.flush();
    }
}
