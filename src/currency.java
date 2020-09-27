import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[]a=s.toCharArray();
        int n=a.length;
        int c=-1;
        char last=a[n-1];
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                c=i;
                if(a[i]<last)break;
            }
        }
        if(c==-1) System.out.println(-1);
        else {
            char temp=a[c];
            a[c]=a[n-1];
            a[n-1]=temp;
            for(int i=0;i<a.length;i++) System.out.print(a[i]);
        }
    }
}
