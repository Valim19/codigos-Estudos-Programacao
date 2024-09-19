package classes_TestesUnitarios_Java;

class exerciciosLista3 {
/*						EXERCÍCIO 1
	public static float maiorElementoArr(float []numero){
		float aux = 0;
		float maiorElemento = 0;

		for(int i = 0; i <= (numero.length - 1);  i++){
			for(int j = i + 1; j < numero.length; j++){
				if(numero[i] > numero[j]){
					aux = numero[i];
					numero[i] = numero[j];
					numero[j] = aux;
				}
			}
		}
		
		System.out.println(maiorElemento = (numero[numero.length - 1]));
		return maiorElemento;
	}	


	public static void main (String args[]){
		maiorElementoArr(new float[] {1, 8, 3, 4, 5, 40, -20, 100});
	}
*/

/*							EXERCÍCIO 2
	public static void multiplosDeSete(int[] n){
		int multiploDeSete = 0;

		for(int i = 0; i <= (n.length - 1); i++){
			if(n[i] % 7 == 0){
				multiploDeSete = n[i];
				System.out.println(multiploDeSete);	
			}
		}
	}

	public static void main (String[] args){
		multiplosDeSete(new int[] {1, 3, 7, 49, 14, 5, 100});
	}
*/

/*
	public static void encontreUltimoMaior(int[] arr) {
		int maiorValor = arr[0];
		int posicaoUltimaAparicao = 0;

		for (int i = 1; i < arr.length; i++) { 
			if (arr[i] >= maiorValor) {
				maiorValor = arr[i];
			}
		}

		System.out.println("O maior valor é: "+ maiorValor);

		for(int i = arr.length - 1; i >= 0; i--){
			if (arr[i] == maiorValor) {
				posicaoUltimaAparicao = i;
				break; 
			}
		}
		
		System.out.println("A última aparição do maior valor é: arr["+ posicaoUltimaAparicao +"]");
	}

	public static void encontreUltimoMenor(int[] arr){
		int menorValor = arr[0];
		int posicaoPrimeiraAparicao = 0;

		for (int i = 1; i < arr.length; i++) { 
			if (arr[i] <= menorValor) {
				menorValor = arr[i];
			}
		}
		System.out.println("O menor valor é: "+ menorValor);

		for(int i = 1; i <arr.length; i++){
			if (arr[i] == menorValor) {
				posicaoPrimeiraAparicao = i;
				break; 
			}
		}

		System.out.println("A primeira aparição do menor valor é: arr["+ posicaoPrimeiraAparicao +"]");

	}

	public static void main(String[] args) {
		encontreUltimoMaior(new int[] {44, 55, 1, 7, 55, 10, 55});
		encontreUltimoMenor(new int[] {44, 55, 1, 7, 9, 10, 55, 0});
	}
*/
/*
	public static void calculaMediaGinastica(double[] notas){
		double auxiliar = 0;
		double soma = 0;

		for(int i = 0; i < notas.length; i++){
			for(int j = i + 1; j < notas.length; j++){
				if(notas[i] >= notas[j]){
					auxiliar = notas[i];
					notas[i] = notas[j];
					notas[j] = auxiliar;
				}
			}

			System.out.print(notas[i] + "\t");
		}


		for(int i = 0; i < notas.length; i++){
			if((i != 0) || (i != 5)){
				soma = notas[i] + soma;
			}
		}

		double media = soma / 4;

		if(media > 10.0){
			media = 10.0;
		}

		System.out.println();
		System.out.println("A media total das notas, descartando a primeira e a última, é: "+ media);

	}

	public static void main(String[] args) {
		calculaMediaGinastica(new double[]{4.0, 1.0, 9.0, 8.0, 8.0, 9.0});
	}       */

/*
	public static void calculaMediaPonderada(double[] arrNotas, double[] arrPesos){
		double auxSomaNota = 0;
		double auxSomaPeso = 0;

		if(arrNotas.length == arrPesos.length){
			for(int i = 0; i < arrNotas.length; i++){
				auxSomaNota = auxSomaNota + (arrNotas[i] * arrPesos[i]);
				auxSomaPeso = auxSomaPeso + arrPesos[i];
			}

			double mediaPonderada = auxSomaNota / auxSomaPeso;

			System.out.println(auxSomaNota +" \t"+ auxSomaPeso);
			System.out.println("A média ponderada é: "+ mediaPonderada);

		} else System.out.println("Número incorreto de notas passados nos arrays");

	}

	public static void main(String[] args) {
		calculaMediaPonderada(new double[]{10, 10, 3}, new double[]{1, 2});
	}      */


/* 
	public static boolean verificaNumeroPalindromo(char[] testePalind){
		char[] stringInvertida = new char[testePalind.length];
		int j = 0;

		for(int i = testePalind.length - 1; i >= 0; i--){
			stringInvertida[j] = testePalind[i];
			j++;
		}
		
		if(Arrays.equals(stringInvertida, testePalind))
			return true;
		else 
			return false; 
	}

	public static void main(String[] args) {
		System.out.print(verificaNumeroPalindromo(new char[]{'1', '2', '3', '2', '4'}));
	} */

/*
	public static void uniaoDeArranjos(int[] arr1, int []arr2){
		int arr3[] = new int[arr1.length + arr2.length];

		for(int i = 0; i < (arr1.length + arr2.length); i++){
			if(i < arr1.length){
				arr3[i] = arr1[i];
			} else {
				arr3[i] = arr2[i - arr1.length];
			}
		}

		for (int i = 0; i < arr3.length; i++)
			System.out.print(arr3[i] + "\t");
	}


	public static void main(String[] args) {
		uniaoDeArranjos(new int[]{1, 2, 3}, new int[]{4, 5, 6});
	}
*/

/*
	public static void retorneIndicesElementosPares(int[] arrInicial){
		int[] arrIndicesPares = new int[arrInicial.length];
		int aux = 0;

		for(int i = 0; i < arrInicial.length; i++){
			if(arrInicial[i] % 2 == 0){
				arrIndicesPares[aux] = i;
				aux++;
			}
		}

		for(int i = 0; i < arrIndicesPares.length; i++)
			System.out.print(arrIndicesPares[i] + "\t");
	}

	public static void main(String args[]){
		retorneIndicesElementosPares(new int[]{2, 2, 2, 4, 2, 6});
	}
		*/

	
	
	public static void main(String[] args){

	}

}








