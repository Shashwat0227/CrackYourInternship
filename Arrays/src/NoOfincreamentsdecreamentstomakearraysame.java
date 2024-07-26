import java.util.*;
public class NoOfincreamentsdecreamentstomakearraysame {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int cnt =0;
        for(int i =0; i< nums.length ; i++){
            cnt+=Math.abs(nums[i]-nums[nums.length/2]);
        }
        return cnt;
    }
}
