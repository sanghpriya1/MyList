
public class Toeplitz {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 }, {6, 9, 5, 1} };
		int rows = matrix.length;
		int cols = matrix[0].length;
		boolean ans  = true;
		for(int i = 0; i < rows -1; i++) {
			for(int j = 0; j < cols-1; ++j) {
				int x = i; 
				int y = j;
				int item = matrix[x][y];
				while(++x < rows && ++y < cols) {
					if(matrix[x][y] != item) {
						ans = false;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
