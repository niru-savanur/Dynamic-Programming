import java.util.Arrays;

public class CanSumTab {
    static boolean canSumTab(int targetSum, int[] iarr){
        boolean[] arr = new boolean[targetSum+1];
        Arrays.fill(arr, false);
        arr[0] = true;
        for(int i = 0; i<= targetSum; i++) {
            if(arr[i]){
                for(int n : iarr){
                    if((i+n) <= targetSum) arr[i+n] = true;
                }
            }
        }
        return arr[targetSum];
    }
    public static void main(String[] args) {
        int[] a = { 2, 3 };
        System.out.println(canSumTab(7, a));
        
        int[] b = { 5, 3, 4, 7 };
        System.out.println(canSumTab(7, b));
        
        int[] c = { 2, 3, 5 };
        System.out.println(canSumTab(8, c));
        
        int[] d = { 7, 14 };
        System.out.println(canSumTab(300, d));
        
        int[] e = { 2, 4 };
        System.out.println(canSumTab(7, e));
        
    }
}
