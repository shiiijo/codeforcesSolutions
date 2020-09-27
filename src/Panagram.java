import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s=sc.next().toUpperCase();
        char[] ch=s.toCharArray();
        Set<Character> m=new HashSet<>();
        for(int i=0;i<ch.length;i++){
            m.add(ch[i]);
        }
        if(m.size()==26) System.out.println("YES");
        else System.out.println("NO");
    }
}
