import java.util.*;
public class horseshoe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Integer> s=new HashSet<>();
        for(int i=1;i<=4;i++){
            s.add(sc.nextInt());
        }
        System.out.println(4-s.size());

    }
}
