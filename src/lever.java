import java.util.Scanner;

public class lever {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int level=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='^'){
                level=i;
            }
        }
        int left=0,right=0;
        for(int k=0;k<level;k++){
            if(s.charAt(k)!='='){
                left+=(level-k)*(s.charAt(k)-'0');
            }
        }
        for(int k=level+1;k<s.length();k++){
            if(s.charAt(k)!='='){
                right+=(k-level)*(s.charAt(k)-'0');
            }
        }
        System.out.println(right);
        System.out.println(left);
        if(left==right) System.out.println("balance");
        else if(left>right) System.out.println("left");
        else System.out.println("right");
    }
}
