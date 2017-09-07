package selection;

import java.util.Random;

public class DemoSorting {

	public static void main(String[] args) {
		int array[] = new int[100000];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;

		}

		arraySwaping(array);
		// arrayPrint(array);

		System.out.println("\nbubblesort: ");
		BubbleSort bs = new BubbleSort();
		bs.bubble(array);
		// arrayPrint(array);
		arraySwaping(array);
		// System.out.println();

		System.out.println("\nSelectionsort: ");
		SelectionSort ss = new SelectionSort();
		arraySwaping(array);
		ss.selection(array);
		// arrayPrint(array);

		System.out.println("\nInsertionsort: ");
		InsertionSort is = new InsertionSort();
		arraySwaping(array);
		is.insertionSort(array);
		// arrayPrint(array);

		System.out.println("\nMergesort: ");
		MergeSort ms = new MergeSort();
		arraySwaping(array);
		long startTime = System.currentTimeMillis();
		ms.mergingSort(array);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("time: " + elapsedTime);
		// arrayPrint(array);

	}

	// metoda, ktora mi zamiesa prvky
	public static void arraySwaping(int array[]) {

		int temp, randInt;

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {

			randInt = rand.nextInt(array.length);

			temp = array[i];
			array[i] = array[randInt];
			array[randInt] = temp;

		}

	}

	public static void arrayPrint(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
