import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class majorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        {
            List<Integer> ans = new ArrayList<>();
            int num1 = 0, num2= 0, c1 = 0, c2 = 0, ocreq = (nums.length/3) , l=nums.length;
            for(int i=0;i<l;i++){
                if(nums[i]==num1)c1++;
                else if(nums[i]==num2)c2++;
                else if(c1==0) {
                    num1 = nums[i];
                    c1 = 1;
                }
                else if (c2 == 0){
                    num2 = nums[i];
                    c2=1;
                }
                else{
                    c1--;
                    c2--;
                }
            }
            c1=0;
            c2=0;
            for(int i=0;i<l;i++){
                if(nums[i]==num1)c1++;
                else if(nums[i]==num2)c2++;
            }
            if(c1>ocreq)ans.add(num1);
            if(c2>ocreq)ans.add(num2);

            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
        }
    }
}
