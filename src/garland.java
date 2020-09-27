import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class garland {
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
        String n=sc.next();
        String m=sc.next();
        int[]f1=new int[26];
        int[]f2=new int[26];
        for(int i=0;i<n.length();i++){
            f1[n.charAt(i)-'a']++;
        }
        for(int i=0;i<m.length();i++){
            f2[m.charAt(i)-'a']++;
        }
        int sum=0;
        boolean tf=true;
        for(int i=0;i<26;i++){
            if(f1[i]>0 && f2[i]>0){
                sum+=Math.min(f1[i],f2[i]);
            }
            else if(f1[i]==0 && f2[i]>0){
                tf=false;
            }
        }
        if(tf) {
            System.out.println(sum);
        }
        else{
            System.out.println(-1);
        }
    }
}
