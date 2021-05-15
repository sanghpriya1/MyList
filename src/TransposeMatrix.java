
public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6}};
		int row = matrix.length; 
		int cols = matrix[0].length;
		int[][] rotatedMatrix = new int[cols][row];
		
		for(int i = 0; i < cols; ++i) {
			for(int j = 0; j < row; ++j) {
				if(i == j)rotatedMatrix[i][j] = matrix[i][j];
				else rotatedMatrix[i][j] = matrix[j][i];
			}
		}
		
	}
	
	
}
