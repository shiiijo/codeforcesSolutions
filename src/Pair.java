import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

    public  class Pair {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int a[][] = new int[n][2];
            int[]x=new int[n/2];
            int[]y=new int[n/2];

            for(int i=0;i<n;i++){
                a[i][0] = i+1;
                a[i][1] = sc.nextInt();
            }
            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[1] == o2[1]){
                        return o1[1] - o2[1];
                    }
                    return o1[1] - o2[1];
                }
            });

           for(int i=0;i<n;i++){
               System.out.print(a[i][0]+" ");
            }
        }
    }


