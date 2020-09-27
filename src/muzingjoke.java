import java.util.Arrays;
import java.util.Scanner;

public class muzingjoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next().toUpperCase();
        String s2=sc.next().toUpperCase();
        String s3=sc.next().toUpperCase();
        String s4=s1+s2;
        char[] c=s4.toCharArray();
        Arrays.sort(c);
        String sorted1=new String(c);
        char[] c1=s3.toCharArray();
        Arrays.sort(c1);
        String sorted2=new String(c1);
        if(sorted1.contentEquals(sorted2))
            System.out.println("YES");
        else{
            System.out.println("NO");
        }
        }

        }
