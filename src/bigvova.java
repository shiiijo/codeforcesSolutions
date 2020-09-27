import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bigvova {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int o=0;
            int z=0;
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++) {
                l.add(sc.nextInt());
                if (l.get(i) == 1) {
                    o++;
                } else {
                    z++;
                }
            }
               if(o<=z){
                    for(int i=0;i<l.size();i++){
                        if(l.get(i)==1){
                            l.remove(i--);
                        }
                    }
                }
                else if(z<o){
                    for(int i=0;i<l.size();i++){
                        if(l.get(i)==0){
                            l.remove(i--);
                        }
                    }
                }
                if(o>z && o%2!=0){
                    l.remove(l.indexOf(1));

                }
          //  System.out.println(o+" "+z);
            System.out.println(l.size());
                for(int i=0;i<l.size();i++){
                    System.out.print(l.get(i)+" ");
                }
            System.out.println();
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
