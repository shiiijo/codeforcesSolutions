import java.util.Scanner;

public class QAQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toUpperCase();
        char[] ch=s.toCharArray();
        int c=0;
        int p=0;
        int y=0;
        for(int i=0;i<ch.length;i++) {
            if (ch[i] == 'Q') {
                c+=p;
                y++;


            }
            else if(ch[i]=='A'){
                p+=y;
            }
        }
        System.out.println(c);

    }
}
