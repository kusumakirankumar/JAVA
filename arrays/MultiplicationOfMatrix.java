package arrays;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Initializing matrix 1
		int[][] mat2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } }; // Initializing matrix 2
		int[][] mat3 = new int[mat1.length][mat1.length]; // Initializing matrix 3
		for (int i = 0; i < mat3.length; i++) { // Loop for rows
			for (int j = 0; j < mat3.length; j++) { // Loop for columns
				mat3[i][j] = 0;
				for (int k = 0; k < mat1.length; k++) { // Loop for multiply for rows with columns
					mat3[i][j] = mat3[i][j] + mat1[i][k] * mat2[k][j];
				}
				System.out.print(mat3[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
