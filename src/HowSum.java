import java.util.ArrayList;
import java.util.HashMap;

public class HowSum {
    public ArrayList<Integer> howSum(int targetSum, int[] numbers, HashMap<Integer, ArrayList<Integer>> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }
        for (int number : numbers) {
            int remainder = targetSum - number;
            ArrayList<Integer> result = howSum(remainder, numbers, memo);
            if (result != null) {
                result.add(number);
                memo.put(targetSum, result);
                return result;
            }
        }
        memo.put(targetSum, null);
        return null;
    }
}
