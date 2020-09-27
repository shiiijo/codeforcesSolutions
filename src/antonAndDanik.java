import java.util.Scanner;

public class antonAndDanik {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next().toUpperCase();
        int c1=0;
        int c2=0;
        if(n==s.length()){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                c1++;

            }if(s.charAt(i)=='D'){
                c2++;
            }

        }
        if(c1>c2) {
            System.out.println("Anton");
        }
        else if(c2>c1){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
}