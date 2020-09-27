import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boatscompetition {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
       // int t=1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int ans=0;
            for (int i =1; i <101; i++) {
                int f = 0;
                int l = n-1;
                int c=0;
                while (f < l) {
                    if (a[f] + a[l] == i) {
                        f++;
                        l--;
                        c++;
                    } else if (a[f] + a[l] < i) {
                        f++;
                    } else {
                        l--;
                    }

                }
                if(ans<c){
                    ans=c;
                }
            }
            System.out.println(ans);
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


