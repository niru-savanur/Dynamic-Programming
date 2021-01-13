import java.util.Arrays;

public class CountConstructTab {

    static int countConstructTab(String target, String[] wordbank) {

        int[] arr = new int[target.length() + 1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        for (int i = 0; i <= target.length(); i++) {
            //below if doesnt make difference coz nothing changes if we add 0 to any element.
            if (arr[i] != 0) {
                for (String word : wordbank) {
                    if (i + word.length() <= target.length()) {
                        String temp = target.substring(i, i + word.length());

                        if (temp.equals(word)) {
                            
                                arr[i + word.length()] += arr[i];
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
        String[] e = { "purp", "p", "ur", "le", "purpl" };
        System.out.println(countConstructTab("abcdef", a));

        System.out.println(countConstructTab("skateboard", b));

        System.out.println(countConstructTab("enterapotentpot", c));

        System.out.println(countConstructTab("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", d));

        System.out.println(countConstructTab("purple", e));

    }
}
