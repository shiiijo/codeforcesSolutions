import java.util.Scanner;

public class FileName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String p="xxx";
        if(s.contains(p)) {
            while (s.contains(p)) {
                s = s.replaceAll(p, "xx");
                if (s.contains(p)) {
                    continue;
                } else {
                    break;
                }
            }
            System.out.println(n - s.length());
        }
        else{
            System.out.println("0");
        }


}
}
