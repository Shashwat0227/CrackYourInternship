public class maximumCardPoints {
    public int maxScore(int[] cardPoints, int k) {
        int total =0;

        int n = cardPoints.length ;
        for (int i =0; i<k ; i++){
            total+=cardPoints[i];
        }
        int sum=total;
        for(int i = k-1,j=n-1;i>=0;i--,j--){
            total+=cardPoints[j]-cardPoints[i];
            sum=Math.max(sum,total);
        }
        return sum;
    }

}
