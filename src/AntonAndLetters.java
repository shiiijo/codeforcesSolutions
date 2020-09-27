import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character> c=new HashSet<>();
        String s=sc.nextLine();
        s=s.replace("{","").replaceAll("}","").replaceAll(",","");
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            c.add(ch[i]);
        }
        if(c.size()>1)
            System.out.println(c.size()-1);
        else
        System.out.println(c.size());
    }
}
