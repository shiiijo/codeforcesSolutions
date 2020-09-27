import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i=1;i<=n;i++){
            String s = sc.next();
            if(s.charAt(0) >='0' && s.charAt(0) <='9'){
                int d = Integer.parseInt(s);
                if(d<18) cnt++;
            }
            else{
                if(s.equals("ABSINTH") || s.equals("BEER") || s.equals("BRANDY") || s.equals("CHAMPAGNE") || s.equals("GIN") || s.equals("RUM") || s.equals("SAKE") || s.equals("TEQUILA")|| s.equals("VODKA")|| s.equals("WHISKEY")|| s.equals("WINE"))
                    cnt++;
            }
        }
        System.out.println(cnt);

    }
}
