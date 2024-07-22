import java.util.*;
public class findAllDuplicates {
        public List<Integer> findDuplicates(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            List<Integer> res = new ArrayList<>();
            for (int i : nums) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
            for (int key : map.keySet()) {
                if (map.get(key) > 1) {
                    res.add(key);
                }
            }
            return res;
        }

        public static void main(String[] args) {

        }
    }

