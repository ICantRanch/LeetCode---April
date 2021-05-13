package LeetCode.April;

public class MaxPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		
		int[][] paths = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
		paths[obstacleGrid.length-1][obstacleGrid[0].length-1] = 1;
		for (int i = paths.length-1; i >= 0; i++) {
			for (int j = paths[0].length-2; j >= 0; j++) {
				if(obstacleGrid[i][j] == 1) {paths[i][j] = 0;}
				paths[i][j] = paths[i+1][j] + paths[i][j+1];
			}
		}
		return paths[0][0];
	}
}
