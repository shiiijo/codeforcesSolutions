

import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] a={5,4,3,2,1};
        int ans=0;
        for(int i=0;i<a.length;i++){
            if(x>=a[i]) {
                ans =ans+(x/a[i]);
                x = x % a[i];
            }
        }
        System.out.println(ans);


    }

}
