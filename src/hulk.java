import java.util.Scanner;

public class hulk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s1=" I hate";
        String s2=" I love";
        String s3=" that";
        String s4=" it";
        String result="";
        for(int i=1;i<=n;i++){
            if(i%2==0){
                result=result+s2;
            }
            else{
                result=result+s1;
            }
             if(i==n){
                result=result+s4;
            }else{
                result=result+s3;
            }
        }
        result=result.trim();
        System.out.println(result);

    }
}
