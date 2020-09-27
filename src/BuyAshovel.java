

import java.util.Scanner;

public class BuyAshovel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        int i=1;
        while(i<=10){
            if(((k*i)%10)==r || ((k*i)%10)==0){
                break;
            }


                i++;
            }

        System.out.println(i);



    }}

