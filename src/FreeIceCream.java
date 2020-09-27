import java.util.Scanner;

public class FreeIceCream
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long noofice=sc.nextLong();
        int c=0;
        while(n-->0)
        {
            String s = sc.next();
            long a = sc.nextLong();
            if (s.contains("+"))
            {
                noofice += a;
            } else if (s.contains("-"))
            {
                if (noofice >= a)
                {
                    noofice -= a;
                } else {
                    c++;

                 }
              }
          }
            System.out.println(noofice+" "+c);
    }
}
