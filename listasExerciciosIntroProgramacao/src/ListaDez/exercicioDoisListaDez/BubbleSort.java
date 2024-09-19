/* Método da bolha (BubbleSort)
*	Passa pelo array uma bolha que ordena duas
*	posições consecutivas (leva o maior elemento
*	para o final do vetor)
*	
*	Percorre o array e, em cada passo:
*		- Testa se dois vizinhos estão ordenados
*		- Troca o par que não estiver ordenado
*
*/

package exercicioDoisListaDez;

public class BubbleSort {
	public static void bubbleSort(String[] str) {
		String temp;
		boolean swap = true;
		
		
		while(swap) {
			swap = false;
			
			for (int i = 0; i < str.length - 1; i++) {
	
				if (str[i].compareTo(str[i + 1]) > 0) {
					temp = str[i];
					str[i] = str[i + 1];
					str[i + 1] = temp;
					swap = true;
				}
			}
		}

		for(int i = 0; i < str.length - 1; i++)
			System.out.println(str[i]);
	}
}
