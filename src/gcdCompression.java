import java.util.ArrayList;
import java.util.Scanner;

public class gcdCompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            ArrayList<Integer> o=new ArrayList<>();
            ArrayList<Integer> e=new ArrayList<>();
            int n=sc.nextInt();
            int[]a=new int[2*n+1];
            for(int i=1;i<=2*n;i++){
                a[i]=sc.nextInt();
                if(a[i]%2==0){
                    e.add(i);
                }
                else{
                    o.add(i);
                }
            }
            if(e.size()%2==0){
                if(o.size()>=2){
                    for(int i=0;i+1<e.size();i+=2){
                        System.out.println(e.get(i)+" "+e.get(i+1));
                    }
                  //  System.out.println();
                    for(int i=0;i+1<o.size()-2;i+=2){
                        System.out.println(o.get(i)+" "+o.get(i+1));
                    }
                }
                else{
                    for(int i=0;i+1<e.size()-2;i+=2){
                        System.out.println(e.get(i)+" "+e.get(i+1));
                    }
                    //System.out.println();
                    for(int i=0;i+1<o.size()-1;i+=2){
                        System.out.println(o.get(i)+" "+o.get(i+1));
                    }
                }
            }
            else {
                for(int i=0;i+1<e.size()-1;i+=2)
                {
                    System.out.println(e.get(i)+" "+e.get(i+1));
                }
               // System.out.println();
                for(int j=0;j+1<o.size()-1;j+=2)
                {
                   System.out.println(o.get(j)+" "+o.get(j+1));

                }

            }
        }
    }
}
