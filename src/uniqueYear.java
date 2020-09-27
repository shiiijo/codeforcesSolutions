import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniqueYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str2 = "";
        Set<String> uniqueDates = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                str2 += (str.charAt(i));
            }
            if (str.charAt(i) == '-') {
                str2 = "";
            }
            if (str2.length() == 4) {
                uniqueDates.add(str2);
                str2 = "";
            }
        }
        System.out.println(uniqueDates.size());
    }
}


