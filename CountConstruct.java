import java.util.HashMap;

public class CountConstruct {
    static int countConstruct(String target, String[] arr, HashMap<String, Integer> memo ){
        if(memo.containsKey(target))
            return memo.get(target);
        if(target.isEmpty()) return 1;

        int totWays = 0;
        for(String prefix : arr){
            if(target.indexOf(prefix) == 0){
                String suffix = target.substring(prefix.length());
                int numWays = countConstruct(suffix, arr, memo);
                totWays += numWays;
            }
        }
        memo.put(target, totWays);
        return totWays;
    }
    public static void main(String[] args){
        HashMap<String, Integer> memo = new HashMap<>();
        String[] a = {"ab", "abc", "cd", "def", "abcd"};
        String[] b = {"bo", "rd", "ate", "t", "ska", "sk", "boar"};
        String[] c = {"a", "p", "ent", "enter", "ot", "o", "t"};
        String[] d = {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"};
        String[] e = {"purp", "p", "ur", "le", "purpl"};


        System.out.println(countConstruct("abcdef", a, memo));
        memo.clear();
        System.out.println(countConstruct("skateboard", b, memo));
        memo.clear();
        System.out.println(countConstruct("enterapotentpot", c, memo));
        memo.clear();
        System.out.println(countConstruct("purple", e, memo));
        memo.clear();
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", d, memo));
        memo.clear();
        System.out.println(countConstruct("purple", e, memo));
    }
}
