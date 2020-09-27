import java.util.Scanner;

public class word{
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));
        String s=sc.next();
        String u=s.toUpperCase();
        String l=s.toLowerCase();

        int up=0;
        int lw=0;
        for( int i=0;i<s.length();i++){
            if(s.toCharArray()[i]==u.toCharArray()[i]){
                up++;
            }

        }

        for(int i=0;i<s.length();i++){
            if(s.toCharArray()[i]==l.toCharArray()[i]){
                lw++;
            }

            }
        if(lw>up || lw==up){
            System.out.println(s.toLowerCase());
        }
          else
        {
            System.out.println(s.toUpperCase());
        }

        }

}
