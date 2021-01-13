import java.util.Arrays;

public class CanConstructTab {

    static boolean canConstructTab(String target, String[] wordbank){

        boolean[] arr = new boolean[target.length() + 1];
        Arrays.fill(arr, false);
        arr[0] = true;
        for(int i = 0; i <= target.length(); i++){
            if(arr[i]){
                for(String word : wordbank){
                    if(i+word.length() <= target.length()){
                        String temp = target.substring(i, i+ word.length());
                    
                    if(temp.equals(word)){
                         arr[i+word.length()] = true;
                    }
                }
                }
            }
        }
        return arr[target.length()];
    }
    public static void main(String[] args) {
        String[] a = { "ab", "abc", "cd", "def", "abcd" };
        String[] b = { "bo", "rd", "ate", "t", "ska", "sk", "boar" };
        String[] c = { "a", "p", "ent", "enter", "ot", "o", "t" };
        String[] d = { "e", "ee", "eee", "eeee", "eeeee", "eeeeee" };
        System.out.println(canConstructTab("abcdef", a));
        
        System.out.println(canConstructTab("skateboard", b));
        
        System.out.println(canConstructTab("enterapotentpot", c));
        
        System.out.println(canConstructTab("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", d));
        
    }
}
