import java.util.HashMap;

public class GridTraveller {

    static long calculateGrid(int a, int b, HashMap<String,Long> memo){
        String k = a + "," + b;
        if(memo.containsKey(k))
            return memo.get(k);
        if(a==0||b==0)
            return 0;
        if(a==1&&b==1)
            return 1;
        memo.put(k,(calculateGrid(a-1, b, memo) + calculateGrid(a, b-1, memo)));
        return memo.get(k);
    }
    public static void main(String[] args){
        HashMap<String, Long> memo = new HashMap<>();
        System.out.println(calculateGrid(18,18, memo));
    }
}
