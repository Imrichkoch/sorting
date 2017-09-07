package selection;

public class InsertionSort {

	public static void main(String[] args) {
		// 3 2 5 1 9 4 - povodny stav (zotriedena cast {3}, nezotriedena cast
		// {2, 5, 1, 9, 4})
		// 2 3 5 1 9 4 - 1. krok (zotriedena cast {2, 3}, nezotriedena cast {5,
		// 1, 9 ,4})
		// 2 3 5 1 9 4 - 2. krok (zotriedena cast {2, 3, 5}, nezotriedena cast
		// {1, 9, 4})
		// 1 2 3 5 9 4 - 3. krok (zotriedena cast {1, 2, 3, 5}, nezotriedena
		// cast {9, 4})
		// 1 2 3 5 9 4 - 4. krok (zotriedena cast {1, 2, 3, 5, 9}, nezotriedena
		// cast {4})
		// 1 2 3 4 5 9 - vysledok (zotriedena cast {1, 2, 3, 4, 5, 9},
		// nezotriedena cast {})
	}

	public static void insertionSort(int[] list) {
		long startTime = System.currentTimeMillis();
		int item, j;
		for (int i = 1; i <= (list.length - 1); i++) {

			item = list[i];
			j = i - 1;
			while ((j >= 0) && (list[j] > item)) {
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = item;
		}

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("time: " + elapsedTime);
	}
}
