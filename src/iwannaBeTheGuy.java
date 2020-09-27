import java.util.*;

public class iwannaBeTheGuy {
    public static void main(String[] args) {
        Set<Integer> l = new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        while(p>=1){
            l.add(sc.nextInt());
            p--;
        }
        int q=sc.nextInt();
        while(q>=1){
            l.add(sc.nextInt());
            q--;
        }
        if(l.size()==n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }}