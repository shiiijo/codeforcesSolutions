import java.util.Scanner;

public class BearAndRasberry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int cal;
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        cal=a[0]-a[1];
        for(int i=1;i<n-1;i++){
            if(a[i]-a[i+1]>cal){
                cal=a[i]-a[i+1];
            }
        }
        if(cal>=c){
            System.out.println(cal-c);
        }
        else{
            System.out.println(0);
        }
    }
}
