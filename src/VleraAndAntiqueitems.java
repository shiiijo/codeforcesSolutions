import java.util.ArrayList;
import java.util.Scanner;

public class VleraAndAntiqueitems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int v = sc.nextInt();

        boolean u = false;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i <=n; i++ ) {
            int s = sc.nextInt();

            if (!u && v > s) {
                u = true;
                ans.add(i);
            }
        }

        System.out.println(ans.size());

        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}  

