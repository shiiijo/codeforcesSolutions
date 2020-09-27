import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        int c=0;
        while (n-->=1){
            l1.add(sc.nextInt());
            l2.add(sc.nextInt());
        }
        for(int i=0;i<l1.size();i++){
            for(int j=0;j<l2.size();j++){
                if(l1.get(i)==l2.get(j)){
                    c++;
                }
            }
        }
        System.out.println(c);

    }
    }

