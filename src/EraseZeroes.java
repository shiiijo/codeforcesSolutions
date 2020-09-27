import java.util.Scanner;

public class EraseZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();
            int x=0;
            int y=0;
            int sum = 0;
            for(int i=0;i!='\0';i++) {
                if (s.charAt(i) == '1') {
                    x=s.indexOf('1');
                    break;
                }
            }
                for(int i=s.length();i!='\0';i--){
                    if(s.charAt(i)=='1'){
                        y=s.indexOf('1');
                        break;
                    }
                }

            System.out.println(x+""+y);
        }
    }
}
