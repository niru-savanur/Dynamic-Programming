import java.util.Arrays;

import java.util.*;
public class FibTabulation{
    static long fibTab(int n){
        long[] arr = new long[n+1];
        Arrays.fill(arr, 0);
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 0; i<n; i++){
            
                arr[i + 1] += arr[i];
            if ((i + 2) <= n)
                arr[i + 2] += arr[i];
        } 
        return arr[n];
    }
    public static void main(String[] args) {
        System.out.println(fibTab(7));
        System.out.println(fibTab(5));
        System.out.println(fibTab(21));
        System.out.println(fibTab(50));
    }
}