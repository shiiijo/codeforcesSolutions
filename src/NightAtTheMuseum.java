import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
         s='a'+s;
        int ans=0;

        for(int i=1;i<s.length();i++) {
            ans+=Math.min(Math.abs(s.charAt(i)-s.charAt(i-1)),26-Math.abs(s.charAt(i)-s.charAt(i-1)));


        }
        System.out.println(ans);

        }
    }
