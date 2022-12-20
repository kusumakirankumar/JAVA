package arrays;

public class AdditionOfMatrix {
	public static void main(String[] args) {
		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] mat2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		for (int i = 0; i < mat1.length; i++) { // Loop for number of rows
			for (int j = 0; j < mat1.length; j++) { // Loop for number of columns
				mat1[i][j] = mat1[i][j] + mat2[i][j]; // Addition of matrix
				System.out.print(mat1[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
