package arrays;

public class Matrix {
	public static void main(String[] args) {
		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1.length; j++) {
				System.out.print(mat1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
