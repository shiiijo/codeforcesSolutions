import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class combination {
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
    static class pair{
        int a;
        int b;
        public pair(int x, int y){
            a=x;
            b=y;
        }

    }
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        pair[]a=new pair[n];
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[i]=new pair(x,y);
        }
       // Arrays.sort(a);
       Arrays.sort(a,new Comparator<pair>()
        {
            public int compare(pair x,pair y)
            {
                if(x.b==y.b)
                    return y.a-x.a;
                else
                    return y.b-x.b;
            }
        });
        int count=1;
        int score=0;
        for(int i=0;i<n;i++){
            count-=1;
            score+=a[i].a;
            count+=a[i].b;
            if(count<=0)break;
        }
        System.out.println(score);
    }
}
