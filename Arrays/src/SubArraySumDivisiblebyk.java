import java.util.*;
public class SubArraySumDivisiblebyk {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt =0;
        int pre =0 ,sum =0 ;
        map.put(0,1);
        for(int i =0; i< nums.length ; i++){
            sum+=nums[i];
            int remainder = sum%k;
            if(remainder<0){
                remainder+=k;
            }if(map.containsKey(remainder))
                cnt+=map.get(remainder);

            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return cnt;
    }
}
