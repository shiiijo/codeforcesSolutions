import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem245B {
    public static void main(String[] args) {
        FastReader sc=new FastReader();
        String next=sc.next();
        if (next.charAt(2)=='p') {
            if (next.endsWith("ru")) {
                System.out.println("ftp://"+next.substring(3, next.length()-2)+".ru");
            }
            else {
                System.out.println("ftp://"+next.substring(3, next.lastIndexOf("ru"))+".ru/"+next.substring(next.lastIndexOf("ru")+2));
            }
        }
        else {
            if (next.substring(5).endsWith("ru")) {
                System.out.println("http://"+next.substring(4, next.length()-2)+".ru");
            }
            else {
                System.out.println("http://"+next.substring(4, next.lastIndexOf("ru"))+".ru/"+next.substring(next.lastIndexOf("ru")+2));
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
