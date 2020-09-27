public class maxsubarray {
    public static void main(String[] args){
        int[] a={-2, -5, 6, -2, -3, 1, 5, -6};
        int best=0;
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum=Math.max(a[i],sum+a[i]);
            best=Math.max(sum,best);
            

        }
        System.out.println(best);
    }
}
