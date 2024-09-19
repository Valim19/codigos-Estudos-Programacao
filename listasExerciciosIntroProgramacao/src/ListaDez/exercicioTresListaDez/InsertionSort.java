package exercicioTres;

public class InsertionSort {
	public static void insertionSortingIntegers(int[] toInsert) {
		int n = toInsert.length;
		
		for(int i = 0; i < n; i++) {
			int key = toInsert[i];
			int j = i - 1;
			
			
			while(j >= 0 && toInsert[j] > key) {
				toInsert[j + 1] = toInsert[j];
				j -= 1;
			}
			
			toInsert[j + 1] = key;
		}
		
		for(int i = 0; i < n; i++)
			System.out.print(toInsert[i] + "\t");
	}
	

}
