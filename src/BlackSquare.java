import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        String s=sc.next();
        int sum1=0; int sum2=0; int sum3=0; int sum4=0;
        int c1=0; int c2=0; int c3=0; int c4=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c1++;
                sum1=a*c1;
            }
            else if(s.charAt(i)=='2'){
                c2++;
                sum2=b*c2;
            }
            else if(s.charAt(i)=='3'){
                c3++;
                sum3=c*c3;

            }
            else if(s.charAt(i)=='4'){
                c4++;
                sum4=d*c4;
            }

        }
        System.out.println(sum1+sum2+sum3+sum4);

    }
}
