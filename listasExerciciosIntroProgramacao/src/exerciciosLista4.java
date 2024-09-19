package classes_TestesUnitarios_Java;

class exerciciosLista4 {
	public static int maiorValor(int[][] matriz) {
		int maiorElemento = matriz[0][0];
		int posicao[] = new int[1];
		
		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				if (matriz[i][j] > maiorElemento){
					maiorElemento = matriz[i][j];
					for(int k = 0; k <= posicao.length; k++)
						if (k == 0) posicao[k] = i;
						else k = j;
				}
			}

		}
 		
		for(int k = 0; k <= posicao.length; k++) System.out.println(posicao[k]);
		return maiorElemento;


		
	}


	public static void main (String[] args){
		int matriz[][] = {
			{1, 2, 3},
			{4, 40, 6},
			{7, 8, 3},
		};

		System.out.println(maiorValor(matriz));

	}
	


}