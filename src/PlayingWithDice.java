import java.util.Scanner;

public class PlayingWithDice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        int p=0; int q=0;
        int x=0; int y=0; int z=0;
        for(int i=1;i<=6;i++){
            p=(int)Math.abs(a-i);
            q=(int)Math.abs(b-i);
            if(p>q){
                x++;
            }
            else if(q>p){
                z++;
            }
            else{
                y++;
            }
        }
        System.out.println(z+" "+y+" "+x);
    }
}
