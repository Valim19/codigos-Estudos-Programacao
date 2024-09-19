package exercicioTres;

public class SelectionSort {
	public static void sortingIntegers(int[] toSort) {
		int n = toSort.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(toSort[i] > toSort[j]) {
					int aux = toSort[i];
					toSort[i] = toSort[j];
					toSort[j] = aux;
				}
			}
		}
		
		for(int i = 0; i < n; i++)
			System.out.print(toSort[i] + "\t");
	}
}

