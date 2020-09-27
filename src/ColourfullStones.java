import java.util.Scanner;

public class ColourfullStones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int c=0;
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)==s.charAt(c))
                c++;
            }
        System.out.println(c+1);
    }

}
