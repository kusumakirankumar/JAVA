package arrays;

public class DiagonalSumOfMatrix {
	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i < mat.length; i++) { // Loop for rows
			for (int j = 0; j < mat.length; j++) { // Loop for columns
				if (i == j) { // Rows equals to Columns
					sum = sum + mat[i][j];
				}
			}
		}
		System.out.print("Diagonal sum is: " + sum);
	}
}
