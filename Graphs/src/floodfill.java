public class floodfill {
    public void fillrec(int [][] img , int sr , int sc ,int color , int org){
        if(sr<0 || sr>=img.length) return ;
        if(sc<0 || sc>=img[0].length) return ;
        if(img[sr][sc]==org && img[sr][sc]!=color){
            img[sr][sc]= color;
            fillrec(img,sr+1,sc,color,org);
            fillrec(img,sr,sc+1,color,org);
            fillrec(img,sr-1,sc,color,org);
            fillrec(img,sr,sc-1,color,org);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fillrec(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}
