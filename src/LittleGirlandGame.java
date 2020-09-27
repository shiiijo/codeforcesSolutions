import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LittleGirlandGame {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(in.readLine());
        StringBuilder out = new StringBuilder();
        PrintWriter p = new PrintWriter(System.out);
        String s = tk.nextToken();
        char[] c = s.toCharArray();
        int k = 0; int sum=0;
        int[]a=new int[26];
        for (int i = 0; i < c.length; i++) {
            int occ=(c[i]-'a');
            a[occ]++;
        }
        for(int i=0;i<26;i++){
            if(a[i]%2!=0){
                k++;
            }
        }
        if(k==0 || k==1) out.append("First");
        else if(k>1){
            if(k%2==0){
                out.append("Second");
            }
            else{
                out.append("First");
            }
        }
        p.print(out);
        p.close();
        p.flush();
    }
}

