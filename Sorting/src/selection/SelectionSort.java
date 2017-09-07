package selection;

public class SelectionSort {

	public static void main(String[] args) {
		// 3 5 2 8 9 1 - povodny stav
		// 1 5 2 8 9 3 - 1. krok
		// 1 2 5 8 9 3 - 2. krok
		// 1 2 3 8 9 5 - 3. krok
		// 1 2 3 5 9 8 - 4. krok
		// 1 2 3 5 8 9 - 5. krok
		// n + (n -1) + (n - 2) + ... + (n - (n-1))

		int[] myArray = new int[] { 3, 5, 2, 8, 9, 1 };
		selection(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}
	}

	public static void selection(int[] array) {
		long startTime = System.currentTimeMillis();
		int indexMin, help;
		for (int i = 0; i < (array.length - 1); i++) {
			indexMin = array.length - 1;

			for (int j = i; j < (array.length - 1); j++) {
				if (array[indexMin] > array[j]) {
					indexMin = j;
				}
			}

			help = array[indexMin];
			array[indexMin] = array[i];
			array[i] = help;
		}

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("time: " + elapsedTime);
	}

	private static void exchange(int[] pole) {
		if (pole == null || pole.length != 2 || (pole[0] + pole[1] > 2_147_000_000)) {
			return;
		}

		int a;
		int b;

		a = pole[0];
		b = pole[1];

		a = a + b;
		b = a - b; // a + b - b = a
		a = a - b; // a - (a - b) = b

		pole[0] = a;
		pole[1] = b;
	}
}
