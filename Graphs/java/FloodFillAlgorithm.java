package Graphs.java;
import java.util.*;
public class FloodFillAlgorithm {
  /* Given a m *n integer grid image where image[i][j] representsthe pixel value of the image.
   * you are also given three integers sr,sc,and color. you should perform a flood fill on the image starting from the pixel image[sr][sc].
   * To perform a flood fill,consider the stating pixel,plus any pixels connected 4-directionally to those pixels(also with
   * the same color),and so on.Replace the color of all of the aforementioned pixels with color.
   * image = [       sr=1,sc=1,color=2
   * [1,1,1],
   * [1,1,0],
   * [1,0,1]
   * ans = {
   * [2,2,2],
   * [2,2,0],
   * [2,0,2]
   * }
   */
	//O(m+n)
	public void helper(int [][] image,int sr, int sc,int color,boolean vis[][],int orgCol){
		if(sr<0|| sc<0||sr>=image.length|| sc>=image[0].length|| vis[sr][sc]||image[sr][sc]!=orgCol) {
			return ;
		}
		//left
		helper(image,sr,sc-1,color,vis,orgCol);
		//right
		helper(image,sr,sc+1,color,vis,orgCol);
		//up
		helper(image,sr-1,sc,color,vis,orgCol);
		//down
		helper(image,sr+1,sc,color,vis, orgCol);
	}
	public int [][]floodfill(int[][] image,int sr,int sc,int color){
		boolean vis[][]= new boolean[image.length][image[0].length];
		helper(image,sr,sc,color,vis,image[sr][sc]);
		return image;
	}
	public static void main(String[] args) {
	    

	}

}
