import java.util.*;
public class Subsets {
    public void Subset(int []arr , List<Integer> ans, int start, List<List<Integer>> res ){
        if(arr.length == start){
            res.add(new ArrayList<>(ans));
            return;
        }
        Subset(arr,ans,start+1,res);
        ans.add(arr[start]);
        Subset(arr,ans,start+1,res);
        ans.remove(ans.size()-1);

    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Subset(nums,ans,0,res);
        return res;
    }
}
