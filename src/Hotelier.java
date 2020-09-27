import java.util.Scanner;

public class Hotelier {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
            n = input.nextInt();
        } while (n > Math.pow(10, 5) || n < 1);
        String s = input.next();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }
        char[] c = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (c[i] == 'L') {
                int j = 0;
                while (arr[j] != 0) {
                    j++;
                }
                arr[j] = 1;
            } else {
                if (c[i] == 'R') {
                    int j = 9;
                    while (arr[j] != 0) {
                        j--;
                    }
                    arr[j] = 1;
                } else {
                    int x = c[i];
                    arr[x - 48] = 0;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
        }
    }
}



