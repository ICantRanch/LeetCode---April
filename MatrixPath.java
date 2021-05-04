package LeetCode.April;

public class MatrixPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int max;

	public int longestIncreasingPath(int[][] matrix) {

		int[][] maxPath = new int[matrix.length][matrix[0].length];
		
		max = 1;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				update(i,j, maxPath[i][j],matrix,maxPath);
			}
		}
		
		return max;
	}
	
	public void update(int y, int x, int longest, int[][] mat, int[][] maxPath) {
		
		if(longest <= maxPath[y][x]) {return;}
		maxPath[y][x] = longest;
		
		if(longest > max) {max = longest;}
		
		if(y-1 > 0 && mat[y-1][x] > mat[y][x]) {
			update(y-1,x,longest+1,mat,maxPath);
		}
		if(y+1 < mat.length && mat[y+1][x] > mat[y][x]) {
			update(y+1,x,longest+1,mat,maxPath);
		}
		if(x-1 > 0 && mat[y][x-1] > mat[y][x]) {
			update(y,x-1,longest+1,mat,maxPath);
		}
		if(x+1 < mat[0].length && mat[y][x+1] > mat[y][x]) {
			update(y,x+1,longest+1,mat,maxPath);
		}
		
		
	}
}
