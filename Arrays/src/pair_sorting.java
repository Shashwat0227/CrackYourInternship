import java.util.*;
public class pair_sorting {
    public int findPair(int n, int x, int[] arr) {
        for(int i =0; i< n ; i++){
            int temp = x+arr[i];
            arr[i]=0;

            // code here
            Arrays.sort(arr);
            int left =0;
            int right = arr.length -1;
            while (left<=right){
                int mid = left +(right-left)/2;
                if(arr[mid]==temp) return 1;
                else if(arr[mid]>temp) right = mid-1;
                else left=mid+1;

            }
            arr[i]=temp-x;

        }
        return -1;

    }
}
