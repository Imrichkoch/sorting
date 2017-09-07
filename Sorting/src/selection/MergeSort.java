package selection;

public class MergeSort {

	// 2 3 5 1 4 7 8 ( (7 / 2) == 3; (7 - 3) == 4)
	// 2 3 5 + 1 4 7 8
	// _ _ _ _ _ _ _ (pomocna pamat - 7 prvkov)

	// 1 _ _ _ _ _ _ - 1. krok
	// 1 2 _ _ _ _ _ - 2. krok
	// 1 2 3 _ _ _ _ - 3. krok
	// 1 2 3 4 _ _ _ - 4. krok
	// 1 2 3 4 5 _ _ - 5. krok
	// 1 2 3 4 5 7 8 - 6. krok

	// n * log2(n)
	// n * n
	// n
	// int[] 2 3 5 1 4 7 8

	//

	public static void mergingSort(int[] array) {
		if (array.length <= 1)
			return;

		int center = array.length / 2;
		int i;
		int[] leftArray = new int[center];
		int[] rightArray = new int[array.length - center];

		for (i = 0; i < leftArray.length; i++) {

			leftArray[i] = array[i];
		}

		for (i = center; i < array.length; i++) {

			rightArray[i - center] = array[i];
		}
		mergingSort(leftArray);
		mergingSort(rightArray);
		merge(array, leftArray, rightArray);

	}

	public static void merge(int[] list, int[] left, int[] right) {
		int i = 0;
		int j = 0;

		while ((i < left.length) && (j < right.length)) {

			if (left[i] < right[j]) {
				list[i + j] = left[i];
				i++;
			} else {
				list[i + j] = right[j];
				j++;
			}
		}
		// zbytok nevyprezdneho pola
		if (i < left.length) {
			while (i < left.length) {
				list[i + j] = left[i];
				i++;
			}
		} else {
			while (j < right.length) {
				list[i + j] = right[j];
				j++;
			}
		}

	}
}
