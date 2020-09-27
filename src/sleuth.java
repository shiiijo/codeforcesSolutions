import java.util.Scanner;

public class sleuth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toUpperCase();
        boolean x=false;
        s=s.replaceAll(" ","");
        if(s.charAt(s.length()-2)=='A') x=true;
       else if(s.charAt(s.length()-2)=='E') x=true;
       else if(s.charAt(s.length()-2)=='I') x=true;
       else if(s.charAt(s.length()-2)=='O') x=true;
       else if(s.charAt(s.length()-2)=='U') x=true;
       else if(s.charAt(s.length()-2)=='Y') x=true;
       if(x) System.out.println("YES");
       else System.out.println("NO");
    }
}
