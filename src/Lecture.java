import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<String,String > s=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        while (m-- > 0) {
            String a = sc.next();
            String b = sc.next();
            s.put(a,(a.length()<=b.length()?a:b));
        }
        while (n-->0){
            sb.append(s.get(sc.next()));
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
