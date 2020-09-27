import java.util.Arrays;
import java.util.Scanner;

public class SuffixStructures {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int l1 = s.length();
        int l2 = t.length();

        i = 0; j=0;
        while(i<l1 && j<l2){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else i++;
        }

        if(j==l2) System.out.println("automaton");

        else{
            int a[] = new int[26];
            int b[] = new int[26];

            for(i=0;i<l1;i++){
                a[s.charAt(i) - 'a']++;
            }
            for(i=0;i<l2;i++){
                b[t.charAt(i) - 'a']++;
            }

            if(Arrays.equals(a, b)) System.out.println("array");
            else{
                j=0;
                // boolean tf = false;
                for(i=0;i<l2;i++){
                    int c = b[t.charAt(i) - 'a'];
                    if(c <= a[t.charAt(i) - 'a']) j++;
                }

                if(j==l2) System.out.println("both");
                else System.out.println("need tree");
            }
        }
    }
}
