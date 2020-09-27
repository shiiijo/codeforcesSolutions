import java.util.Scanner;

public class LoveAs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int c=0;
        int k=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                c++;
            }
            else{
                k++;
            }
        }
        if(c>k){
            System.out.println(c+k);
        }
        else if(c==k){
            System.out.println(c+k-1);
        }
        else{
            while(k>0)
            {
                k--;
                if(c>k)
                {
                    m=1;
                    break;
                }
            }
            if(m==1)
                System.out.println(c+k);

        }
    }
}
