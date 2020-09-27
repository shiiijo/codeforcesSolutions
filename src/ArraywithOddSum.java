import java.util.Scanner;

public class ArraywithOddSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       while ((t-->0)){
            int sum=0;
            int odd=0;
            int even=0;
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 != 0 || a[i]==1)
                    {
                      odd++;
                    }
                else{
                    even++;
                }

                sum += a[i];
            }
            if(sum%2!=0 || sum==1){
                System.out.println("YES");
            }
            else {
                if (even != 0 && odd != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            }

            }
        }



