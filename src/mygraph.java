import java.util.ArrayList;
import java.util.Scanner;

public class mygraph {
     static ArrayList<ArrayList<Integer>> g =  new ArrayList<>();
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++)
            g.add(new ArrayList<>());

        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            addEdge(a-1, b-1);
        }
        int c=0;
        int groups = 0;
        while(true){
            c=0;
            ArrayList<Integer> addremove = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(g.get(i).size()==1){
                    addremove.add(i);
                    c++;
                }
            }
            for(int i:addremove){
                if(g.get(i).size()>0){
                    int x= g.get(i).get(0);
                    g.get(i).remove(0);
                    g.get(x).remove((Integer) i);
                }
            }
            if(c!=0) groups++;
            if(c==0) break;
        }

        System.out.print(groups);
    }
    static void addEdge( int u, int v){
        g.get(u).add(v);
        g.get(v).add(u);
    }
}
