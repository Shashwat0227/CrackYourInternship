import java.util.*;

public class Result {

    private static final int MOD = 1_000_000_007;
    private int P, Q;
    private Set<Integer> specialSet;
    private Map<String, Integer> memo;

    public Result(int N, int P, int Q, List<Integer> special_integers) {
        this.P = P;
        this.Q = Q;
        this.specialSet = new HashSet<>(special_integers);
        this.memo = new HashMap<>();
    }

    private int countSpecial(int l, int r) {
        int count = 0;
        for (int i = l; i < r; i++) {
            if (specialSet.contains(i + 1)) {
                count++;
            }
        }
        return count;
    }

    private int dp(int l, int r) {
        String key = l + "," + r;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int length = r - l;
        if (length == 1) {
            int cost = specialSet.contains(l + 1) ? P : Q;
            memo.put(key, cost);
            return cost;
        }

        int x = countSpecial(l, r);
        int costDirect = x > 0 ? (int) length * x * P % MOD : Q;

        if (length % 2 == 0) {
            int mid = l + length / 2;
            int costDivide = (dp(l, mid) + dp(mid, r)) % MOD;
            costDirect = Math.min(costDirect, costDivide);
        }

        memo.put(key, costDirect);
        return costDirect;
    }

    public int minRemovalCost(int N) {
        return dp(0, 1 << N) % MOD;
    }

    public static int removeIntegers(int N, int P, int Q, List<Integer> special_integers) {
        Result removalCost = new Result(N, P, Q, special_integers);
        return removalCost.minRemovalCost(N);
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> specialIntegers = Arrays.asList(1, 3);
        int result = removeIntegers(2, 2, 1, specialIntegers);
        System.out.println(result);  // Output will be the minimum removal cost
    }
}
