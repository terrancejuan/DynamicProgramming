import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Fibonacci
        System.out.println("Fibonacci:");
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(25, new HashMap<>()));
        System.out.println();

        // Grid Traveler
        System.out.println("Grid Traveler:");
        GridTraveler gt = new GridTraveler();
        System.out.println(gt.gridTraveler(10, 10, new HashMap<>()));
        System.out.println();

        // Can Sum
        System.out.println("Can Sum:");
        CanSum canSum = new CanSum();
        System.out.println(canSum.canSum(7, new int[]{5, 3, 4, 7}, new HashMap<>())); // true
        System.out.println(canSum.canSum(300, new int[]{7, 14}, new HashMap<>())); // false
        System.out.println();

        // How Sum
        System.out.println("How Sum:");
        HowSum howSum = new HowSum();
        System.out.println(howSum.howSum(7, new int[]{2, 3}, new HashMap<>()));
        System.out.println(howSum.howSum(7, new int[]{5, 3, 4, 7}, new HashMap<>()));
        System.out.println(howSum.howSum(7, new int[]{2, 4}, new HashMap<>()));
        System.out.println(howSum.howSum(8, new int[]{2, 3, 5}, new HashMap<>()));
        System.out.println(howSum.howSum(300, new int[]{7, 14}, new HashMap<>()));
        System.out.println();

        // Best Sum
        System.out.println("Best Sum:");
        BestSum bestSum = new BestSum();
        System.out.println(bestSum.bestSum(7, new int[]{5, 3, 4, 7}, new HashMap<>()));
        System.out.println(bestSum.bestSum(8, new int[]{2, 3, 5}, new HashMap<>()));
        System.out.println(bestSum.bestSum(8, new int[]{1, 4, 5}, new HashMap<>()));
        System.out.println(bestSum.bestSum(100, new int[]{1, 2, 5, 25}, new HashMap<>()));
        System.out.println();
    }
}
