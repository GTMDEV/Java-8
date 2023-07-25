package string;

public class ZeroMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
		System.out.println("Original Matrix:");
		printMatrix(matrix);
		setZeros(matrix);
		System.out.println("Matrix after setting zeros:");
		printMatrix(matrix);

	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void setZeros(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for (int i = 0; i < row.length; i++) {
			if (row[i])
				nullifyRow(matrix, i);
		}

		for (int j = 0; j < column.length; j++) {
			if (column[j])
				nullifyColumn(matrix, j);
		}
	}

	public static void nullifyColumn(int[][] matrix, int col) {

		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}

	public static void nullifyRow(int[][] matrix, int row) {

		for (int j = 0; j < matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
}
