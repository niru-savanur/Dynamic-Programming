import java.util.HashMap;

public class Fibonacci{

    static long fib(int n, HashMap<Integer, Long> fibs){
        if(fibs.containsKey(n))
            return (fibs.get(n)) ;
        
        if(n==0)
            return 0;
        if(n<=2)
            return 1;
        
         fibs.put(n,(fib(n-1, fibs) + fib(n-2,fibs)));
         return (fibs.get(n));
    }
    public static void main(String[] args){
        HashMap<Integer,Long> fibs = new HashMap<>();
        System.out.println(fib(7, fibs));
        fibs.clear();
        System.out.println(fib(6, fibs));
        fibs.clear();
        System.out.println(fib(50, fibs));
        fibs.clear();
    }
}