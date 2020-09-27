import java.util.Scanner;

public class RomaAndluckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int K = sc.nextInt();
                int A[] = new int[n];

                for(int i=0; i<n; i++)
                {
                    A[i] = sc.nextInt();
                }

                int count = 0;
                for(int i=0; i<n; i++)
                {
                    int num = A[i];
                    int k = 0;
                    for(int j=num; j>0; j=j/10)
                    {
                        int d = j%10;
                        if(d==4 || d==7)
                            k++;
                        if(k > K)
                            break;
                    }

                    if(k <= K)
                        count++;
                }

                System.out.println(count);
            }
        }
