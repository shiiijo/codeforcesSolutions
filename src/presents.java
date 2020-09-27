import java.util.Scanner;

class presents{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s=sc.next();
        long x=0;

        for (int i = 0; i < s.length(); i++) {
           x= s.indexOf(i);
        }
        for(int i=0;i<s.length();i++){
            System.out.println(x);

        }

    }
}






