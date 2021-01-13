import java.util.HashMap;

public class CanSum {

    static boolean canSum(int targetSum, int[] arr, HashMap<Integer, Boolean> memo){
        if(memo.containsKey(targetSum))
            return memo.get(targetSum);

        if(targetSum==0) return true;
        if(targetSum<0) return false;

        for(int n : arr){
            int tempSum = targetSum - n;
            
            if (canSum(tempSum, arr, memo)){
                memo.put(targetSum, true );
                return memo.get(targetSum);
            }
        }
        memo.put(targetSum, false);
        return memo.get(targetSum);
    }
    public static void main(String[] args){
        HashMap<Integer, Boolean> memo = new HashMap<>();
        
       
        
        
        
        int[] a = { 2, 3 };
        System.out.println(canSum(7, a,memo));
        memo.clear();
        int[] b = { 5, 3, 4, 7 };
        System.out.println(canSum(7, b, memo));
        memo.clear();
        int[] c = { 2, 3, 5 };
        System.out.println(canSum(8, c, memo));
        memo.clear();
        int[] d = { 7, 14 };
        System.out.println(canSum(300, d, memo));
        memo.clear();
        int[] e = { 2, 4 };
        System.out.println(canSum(7, e, memo));
        memo.clear();
        
    }
}
