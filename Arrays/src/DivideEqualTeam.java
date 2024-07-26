import java.util.*;
public class DivideEqualTeam {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int target = skill[0]+skill[skill.length-1];
        var ans =0;
        int left =0;
        int right = skill.length -1;
        while(left<right){
            if(skill[left]+skill[right]!=target){
                return -1;
            }
            ans+=(skill[left]*skill[right]);
            left++;
            right--;
        }

        return ans;
    }
}
