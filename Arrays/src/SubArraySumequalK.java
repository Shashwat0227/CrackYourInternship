import java.util.*;
public class SubArraySumequalK {
    public int subarraySum(int[] nums, int k) {
        int cnt=0,sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0; i< nums.length ; i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
