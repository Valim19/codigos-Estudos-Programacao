package classes_TestesUnitarios_Java;

class exerciciosLista5 {

    /* EXERCÍCIO 1


    public static void bidimensional(int[][] arrEx1){
        int maiorElemento = arrEx1[0][0];
        int posArray[]  = new int[2];

        for(int n = 0; n < arrEx1.length; n++){
            for(int m = 0; m < arrEx1[n].length; m++){
               if(arrEx1[n][m] > maiorElemento){
                    maiorElemento = arrEx1[n][m];
                }
            }
        }

        for(int n = 0; n < arrEx1.length; n++){
            for(int m = 0; m < arrEx1[n].length; m++){
                if(arrEx1[n][m] == maiorElemento){
                    posArray[0] = n;
                    posArray[1] = m;
                    break;
                }

            }
        }

        System.out.println(maiorElemento);

        System.out.print("O elemento está posicionado em arrEx1");
        
        for(int n = 0; n < arrEx1.length; n++)
            System.out.print("[" + posArray[n] + "]");
    }

    public static void main(String[] args){
        bidimensional(new int[][] {{1, 2, 3, 4, 8}, {5, 6, 7, 8, 600}});
    }
    */

    /* EXERCÍCIO 2
    public static void diagonalSecundaria(int arrEx2[][]){
        double arrLength = arrEx2.length;
        double confereDiagonalSecundaria = arrLength - 1;
        double contadorColunas = 0;
        int somaDiagonaisSecundarias = 0;


        for(int n = 0; n < arrEx2.length; n++){
            for(int m = 0; m < arrEx2[n].length; m++){
                contadorColunas++;
            }
        }

        double confereMatrizQuadrada = contadorColunas/arrEx2.length;

        if(confereMatrizQuadrada == arrLength && arrLength > 0){
            for(int n = 0; n < arrEx2.length; n++){
                for(int m = 0; m < arrEx2.length; m++){
                    if((n + m) == confereDiagonalSecundaria){
                        somaDiagonaisSecundarias += arrEx2[n][m];
                    }
                }
            }
            System.out.println(somaDiagonaisSecundarias);

        } else {
            System.out.println("Insira uma matriz quadrada");
        }

    }

    public static void main (String args[]){
        diagonalSecundaria(new int[][] {{0, 1, 3}, {0, 1}, {1, 3, 3}});
    }
    */

    /*  EXERCÍCIO 3
    public static void testaMatrizPermutacao(int[][] arrEx3){
        double arrLength = arrEx3.length;
        double contadorDeColunas = 0;
        double somaElementosLinhas = 0;


        for(int n = 0; n < arrEx3.length; n++){
            for(int m = 0; m < arrEx3[n].length; m++){
                contadorDeColunas++;
            }
        }

        double confereMatrizQuadrada = contadorDeColunas/arrEx3.length;

        if(confereMatrizQuadrada == arrLength && arrLength > 0){
            for(int n = 0; n < arrEx3.length; n++){
                for(int m = 0; m < arrEx3.length; m++){
                    if(arrEx3[n][m] == 0 || arrEx3[n][m] == 1){
                        somaElementosLinhas += arrEx3[n][m];
                    }
                }
            }

            if(somaElementosLinhas == arrLength){
                System.out.println("Parabéns, você tem uma matriz permutação");
            } else {
                System.out.println("Que pena! Você tem uma matriz quadrada, mas ela não é uma matriz permutação");
            }
        } else {
            System.out.println("Insira uma matriz quadrada");
        }

    }

    public static void main(String args[]){
        testaMatrizPermutacao(new int[][]{{1, 0}, {0, 0, 1}, {0, 1, 0}});
    }
    */

/* 	EXERCÍCIO 5
	public static void somaMatrizes(int[] matrizA, int[] matrizB){
		int somaTotalElementos = 0;

		for(int n = 0; n < (matrizA.length + matrizB.length); n++){
			if(n < matrizA.length)			
				somaTotalElementos += matrizA[n];
			else 
				somaTotalElementos += matrizB[n - matrizA.length];
		}

		System.out.println(somaTotalElementos);
	}

	public static void main (String []args){
		somaMatrizes(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1});
	}
*/

/* EXERCÍCIO 6
	public static void multiplicaMatrizes(int[][] matrizA, int[][] matrizB){
		
        if(matrizA[0].length == matrizB.length){
            int m = matrizA.length;
            int n = matrizA[0].length;
            int p = matrizB[0].length;
            
            int[][] matrizC = new int[m][p];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < n; k++) {
                        matrizC[i][j] += (matrizA[i][k] * matrizB[k][j]);
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print(matrizC[i][j] + "\t");
                }
                System.out.println();
            }

        } else {
            System.out.println("Insira uma matrize que tenham o número de colunas de uma igual ao número de matrizes da primeira");
        }
	}

	public static void main (String[] args){
        multiplicaMatrizes(new int[][]{{1, 2, 3, 5, 6}, {4, 5, 6, 7, 8}, {4, 5, 6, 7, 8}, {4, 5, 6, 7, 8}}, new int[][]{{1, 2, 3, 4}, {3, 4, 5, 6}, {5, 6, 7, 8}, {7, 8, 9, 10}, {9, 10, 11, 12}});
	}
    */


}










