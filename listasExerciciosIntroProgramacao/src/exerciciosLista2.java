package classes_TestesUnitarios_Java;

class exerciciosLista2 {

/* 							EXERCÍCIO CINCO
	public static void main(String[] args) {
		int soma = 0;

		for (int numero = 0; numero <= 10; numero = numero + 2) soma = soma + numero;

		System.out.println(soma);
	}
*/

/* 							EXERCÍCIO SETE
	public static void main(String[] args) {
		int serie1, serie2, serie3;

		for (int numero = 3; numero <= 48; numero = numero + 5)
			System.out.println(numero);

		for (int numero = -2; numero <= 43; numero = numero + 5)
			System.out.println(numero);

		for (int numero = 48; numero >= 3; numero = numero - 5)
			System.out.println(numero);
	}
*/

/*							EXERCÍCIO OITO
	public static void main(String[] args) {

		for (int numero = 1; numero <= 10; numero++) {
			System.out.println();
			System.out.print(numero + "   ");
			System.out.print(numero * numero + "   ");
			System.out.print(numero * numero * numero + "   ");
		}

	}
*/

/* 							EXERCÍCIO DEZ
	public static void main(String[] args) {

		for (int linha1 = 1; linha1 <= 10; linha1++) System.out.print(".......");
		System.out.println();

		for (int linha1 = 1; linha1 <= 10; linha1++) System.out.print("...*...");
		System.out.println();

		for (int linha1 = 1; linha1 <= 10; linha1++) System.out.print("..***..");
		System.out.println();

		for (int linha1 = 1; linha1 <= 10; linha1++) System.out.print(".*****.");
		System.out.println();

		for (int linha1 = 1; linha1 <= 10; linha1++) System.out.print("*******");
		System.out.println();

		for (int linha1 = 1; linha1 <= 10; linha1++) System.out.print("...|...");
		System.out.println();

	}
*/

/* 							EXERCÍCIO QUATORZE
	public static void desenhaQuadrado(int nLinhas, int mColunas) {

		for (int linha = 1; linha <= nLinhas; linha++) {
			for(int coluna = 1; coluna <= mColunas; coluna++) 
				System.out.print("* ");
			System.out.println();
		}
	}
 
	public static void main(String[] args) {
		desenhaQuadrado(20, 20);

	}
*/

/*											EXERCÍCIO QUINZE
	public static void desenhaAsterisco(int nAsterisco) {

		for (int linha = 1; linha <= nAsterisco; linha++)
			System.out.print("*");

		System.out.println();

		int linha = 1;
		while(linha <= nAsterisco){
			System.out.print("*");
			linha++;
		}

		System.out.println();

		int linha2 = 1;
		do{
			System.out.print("*");
			linha2++;
		} while (linha2 <= nAsterisco);

	}

	public static void main(String[] args) {
		desenhaAsterisco(20);

	}
 */

 /*												EXERCÍCIO DEZESSEIS
	public static void calculaJuros(double a, int n, double r){
		double calculoDoJuros = 0;

		while (n > 0){
			calculoDoJuros = a * Math.pow((1 + r), n);
			System.out.println("No de Meses\t Investimento Acumulado");
			System.out.println(n+"\t\t"+calculoDoJuros);
			n--;
		}
		
	}

	public static void main (String args[]){
		calculaJuros(40, 3, 3);
	}
 */
/*											EXERCÍCIO DEZENOVE
 	public static void tabuada(int n, int m){
		for(int cont = 1; cont <= n; cont++){
			for(int cont2 = 1; cont2 <= m; cont2++) {
				System.out.print((cont2 * cont)+" \t");
			}
			System.out.println();
		}
	}

	public static void main (String []args){
		tabuada(100, 10);
	}
*/

/*											EXERCÍCIO VINTE
	public static void verificaQuadradoPerfeito(int n) {
		int soma = 0;
		int cont = 1;

		while (soma < n) {
			soma += cont;
			cont += 2; // Incrementa apenas contadores ímpares para encontrar quadrados perfeitos
		}

		if (soma == n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) {
		verificaQuadradoPerfeito(100);
	}
 */
}







