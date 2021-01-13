import java.util.HashMap;

public class CanConstruct {
    static boolean canConstruct(String target, String[] arr, HashMap<String, Boolean> memo){
        if(memo.containsKey(target))
            return memo.get(target);
        if(target.isEmpty()) return true;
        
        for(String prefix : arr){
            if(target.indexOf(prefix) == 0){
                String suffix = target.substring(prefix.length());
                if(canConstruct(suffix, arr, memo)){
                    memo.put(target, true);
                    return true;

            }
        }
        }
        memo.put(target, false);
        return false;
    }
    public static void main(String[] args) {
        HashMap<String, Boolean> memo = new HashMap<>();

        String[] a = {"ab", "abc", "cd", "def", "abcd"};
        String[] b = {"bo", "rd", "ate", "t", "ska", "sk", "boar"};
        String[] c = {"a", "p", "ent", "enter", "ot", "o", "t"};
        String[] d = {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"};
        System.out.println(canConstruct("abcdef", a, memo));
        memo.clear();
        System.out.println(canConstruct("skateboard", b, memo));
        memo.clear();
        System.out.println(canConstruct("enterapotentpot", c, memo));
        memo.clear();
        System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", d, memo));
        memo.clear();
    }
}