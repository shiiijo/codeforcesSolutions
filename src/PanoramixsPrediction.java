import java.util.Scanner;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean x=false;
        int [] a={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53 };
        int b=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==b && a[i+1]==c)
                x=true;
            else
                continue;
            }
        if(x){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
    }

