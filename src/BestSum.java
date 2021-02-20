import java.util.ArrayList;
import java.util.HashMap;

public class BestSum {
    public ArrayList<Integer> bestSum(int targetSum, int[] numbers, HashMap<Integer, ArrayList<Integer>> memo) {
        if (memo.containsKey(targetSum)) {
            return memo.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }

        ArrayList<Integer> shortest = null;

        for (int number : numbers) {
            int remainder = targetSum - number;
            ArrayList<Integer> result = bestSum(remainder, numbers, memo);
            if (result != null) {
                ArrayList<Integer> list = new ArrayList<>(result);
                list.add(number);
                if (shortest == null || list.size() < shortest.size()) {
                    shortest = list;
                }
            }
        }
        memo.put(targetSum, shortest);
        return shortest;
    }
}
