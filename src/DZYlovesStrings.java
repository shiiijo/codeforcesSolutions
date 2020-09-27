import java.util.Scanner;

public class DZYlovesStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int[]a=new int[26];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<26;i++){
            a[i]=sc.nextInt();
            if(a[i]>max){
                max=a[i];
            }
        }
        int l = s.length();

        int m = 0;

        for(int i=0;i<l;i++){
            m += a[s.charAt(i)-'a']*(i+1);
        }
        int j = l+1;
        for(int i=1;i<=k;i++){
            m += j * max;
            j++;
        }
        System.out.println(m);
        return;
    }
}
