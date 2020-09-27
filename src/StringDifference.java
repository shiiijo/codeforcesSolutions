import java.util.Scanner;

public class StringDifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        String c=s+t;
        int[]a=new int[27];
        for(int i=1;i<27;i++){
            a[c.charAt(i)-'a']++;
        }
        for(int i=0;i<27;i++) System.out.println(a[i]);
    }
}
