import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import static java.lang.Integer.parseInt;

public class FootballKit {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk=new StringTokenizer(in.readLine());
        PrintWriter p = new PrintWriter(System.out);
        StringBuilder out=new StringBuilder();
        int n=parseInt(tk.nextToken());
        int[]home=new int[n];
        int[]away=new int[n];
        int[]count=new int[1000001];
        for(int i=0;i<n;i++){
            tk=new StringTokenizer(in.readLine());
            home[i]=parseInt(tk.nextToken());
            away[i]=parseInt(tk.nextToken());
            count[home[i]]++;
        }
        for(int i=0;i<n;i++){
           out.append((n-1)+count[away[i]]).append(" ").append((n-1)-count[away[i]]).append("\n");
        }
        p.print(out);
        p.close();
        p.flush();

    }
}
