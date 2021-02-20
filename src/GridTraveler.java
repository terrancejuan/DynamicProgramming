import java.util.HashMap;

public class GridTraveler {
    public long gridTraveler(long m, long n, HashMap<String, Long> memo) {
        String key = m + "," + n;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 && n == 1) {
            return 1;
        }
        memo.put(key, gridTraveler(m-1, n, memo) + gridTraveler(m, n-1, memo));
        return memo.get(key);
    }
}
