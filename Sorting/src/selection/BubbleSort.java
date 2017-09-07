package selection;

public class BubbleSort {
	public static void main(String[] args) {
		// 3 5 2 8 9 1 - povodny stav
		// 3 2 5 8 1 9 - prvy krok
		// 2 3 5 1 8 9 - druhy krok
		// 2 3 1 5 8 9 - treti krok
		// 2 1 3 5 8 9 - stvrty krok
		// 1 2 3 5 8 9 - piaty krok

		// 9 1 5 2 3
		// 1 5 2 3 9 - cislo 9 "prebublalo" az na koniec v jednom kroku
		int[] myArray = new int[] { 3, 5, 2, 8, 9, 1 };
		bubble(myArray);
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(" " + myArray[i]);
		}

	}

	public static void bubble(int[] array) {
		long startTime = System.currentTimeMillis();
		int j = array.length - 1;
		int help;
		boolean cont = true;
		while (cont) {
			cont = false;
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i + 1]) {
					help = array[i];
					array[i] = array[i + 1];
					array[i + 1] = help;
					cont = true;
				}
			}
			// for (int i = 0; i < array.length; i++) {
			// System.out.print(" " + array[i]);
			// }
			// System.out.println();
			j--;
		}

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("time: " + elapsedTime);
	}
}
