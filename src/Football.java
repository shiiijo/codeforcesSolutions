import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,Integer>m= new HashMap<String,Integer>();
        while(n-->0){
            String x =sc.next();
            if(!m.containsKey(x))
                m.put(x, 1);
            else
                m.put(x, m.get(x)+1);

        }
        int upper=0;
        String c = "";
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            String key = entry.getKey();


            Integer value = entry.getValue();
            if(value>upper){

                upper=value;
                c=key;}
        }
        System.out.println(c);
    }
    }


