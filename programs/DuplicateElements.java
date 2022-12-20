package programs;

public class DuplicateElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 4, 7, 8, 9, 4 }; // Initializing array with duplicate elements
		System.out.print("Repeated element is: ");
		for (int i = 0; i < arr.length; i++) { // Loop over array
			for (int j = i + 1; j < arr.length; j++) { // Loop over array with next to the loop 1
				if (arr[i] == arr[j]) { // Checking for the repeated element
					System.out.print(arr[j]); // Printing the element
					return;
				}
			}
		}
	}
}
