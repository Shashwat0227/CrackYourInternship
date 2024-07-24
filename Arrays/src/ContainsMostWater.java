public class ContainsMostWater {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length -1;
        int ans =0;
        while ( left<right){
            int width = right - left; //8  //7  //6  //5
            int length = Math.min(height[left],height[right]);
            int  area = length*width;  //8   //7*7= 49   //6*3=18  //8*5=40
            ans = Math.max(ans,area);  //8   //49   //49
            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}
