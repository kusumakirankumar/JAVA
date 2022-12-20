package arrays;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // Initializing matrix
		int[][] mat2 = new int[mat1.length][mat1.length]; // New matrix
		for (int i = 0; i < mat1.length; i++) { // Loop for rows
			for (int j = 0; j < mat1.length; j++) { // Loop for columns
				mat2[i][j] = mat1[j][i]; // Changing columns to rows
				System.out.print(mat2[i][j] + " "); // Printing matrix
			}
			System.out.println();
		}
	}
}