import java.util.HashMap;

public class Fibonacci {
    public long fib(long n, HashMap<Long, Long> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n <= 2) {
            return 1;
        }
        memo.put(n, fib(n-1, memo) + fib(n-2, memo));
        return memo.get(n);
    }
}
