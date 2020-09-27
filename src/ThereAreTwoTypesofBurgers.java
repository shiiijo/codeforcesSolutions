import java.util.Scanner;

public class ThereAreTwoTypesofBurgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            long t=sc.nextLong();
            while(t-->0){
                long b=sc.nextLong();
                long p=sc.nextLong();
                long f=sc.nextLong();
                long h=sc.nextLong();
                long c=sc.nextLong();
                long half=b/2;
                int m1=0;int m2=0;
                if (h >= c)
                {
                    half = b/2;
                    m1 = (int) Math.min(half,p);

                    if (b > p*2)
                    {
                        b -= p*2;
                        half = b/2;
                        m2 = (int) Math.min(half,f);
                    }
                }
                else
                {
                    half = b/2;
                    m2 =(int)Math. min(half,f);

                    if (b > f*2)
                    {
                        b -= f*2;
                        half = b/2;
                        m1 = (int)Math.min(half,p);
                    }
                }
                System.out.println(m1*h+m2*c);
                }
                }
            }




