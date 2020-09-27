import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ahhahhhaaa {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (n == 2) {
                if (a[0] == a[1]) {
                    System.out.println(2);
                    System.out.println(a[0] + " " + a[1]);
                } else {
                    System.out.println(1);
                    System.out.println(0);
                }
                continue;
            }
                for (int i = 0; i < n - 2; ) {
                    int curr = a[i];
                    int curr1 = a[i + 1];
                    int curr2 = a[i + 2];
                    if (curr != curr1) {
                        if (curr == curr2) {
                            al.add(curr);
                            al.add(curr2);
                            i += 3;
                        } else {
                            al.add(curr1);
                            al.add(curr2);
                            i += 3;

                        }


                    } else {
                        al.add(curr);
                        al.add(curr1);
                        i += 2;
                    }
                }
                System.out.println(al.size());
                for (int i : al) {
                    System.out.print(i + " ");
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
