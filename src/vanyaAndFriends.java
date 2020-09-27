import java.util.Scanner;

public class vanyaAndFriends {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int[] a=new int[n];
        int c1=0;
        int c2=0;
        int ans=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if (a[i]<=h){
                c1++;
            }

          else if(a[i]>h){
              c2=c2+2;
            }
        }
        ans=c1+c2;
        System.out.println(ans);


    }
}
