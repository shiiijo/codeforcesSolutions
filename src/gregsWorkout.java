
import  java.util.*;
 public class gregsWorkout {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

         int sum1=0;
         int sum2=0;
         int sum3=0;
         for(int i=1;i<=n;i++){
             int t=sc.nextInt();
             if(i%3==1){
                 sum3+=t;
             }
             else if(i%3==2){
                 sum2+=t;
             }
             else{
                 sum1+=t;
             }

         }
         if(sum1>sum2 && sum1>sum3){
             System.out.println("back");
         }if(sum2>sum1 && sum2>sum3){
             System.out.println("biceps");
         }
         if(sum3>sum2 && sum3>sum1){
             System.out.println("chest");
         }



     }
     }



