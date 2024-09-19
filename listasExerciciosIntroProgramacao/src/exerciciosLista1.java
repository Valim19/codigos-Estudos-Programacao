package classes_TestesUnitarios_Java;

class exerciciosLista1 {

	/* public static void calculaMensalidade(double numeroAulas, double valorHoraAula, boolean pagNormal){
		double mensalidadeTotal;	

		if (pagNormal){
			mensalidadeTotal = (numeroAulas * valorHoraAula) * 0.93;
			System.out.println(mensalidadeTotal = (numeroAulas * valorHoraAula) * 0.93);
		} else {
			mensalidadeTotal = numeroAulas * valorHoraAula;
			System.out.println(mensalidadeTotal);
		}
	}

	public static void main (String []args){
		calculaMensalidade(4, 50, false);
	} */ 

	/* public static void calculaFatura(double valorDebito, boolean opcaoAVista, boolean parceladoDuasVezes) {
		if (opcaoAVista && (parceladoDuasVezes == false)){
			System.out.println("O valor total é: "+valorDebito);
		} else if (parceladoDuasVezes) {
			System.out.println("O valor total é: "+(valorDebito*1.1));
		} else {
			System.out.println("O valor total é: "+(valorDebito*1.2));
		}
	}

	public static void main (String args[]){
		calculaFatura(1000, true, false);
	} */

	/* public static void retornaMaiorInt(int a, int b, int c) {
		if (a > b && c <= b) System.out.println(a+" é o maior número");
		else if (b > a && c <= a) System.out.println(b+" é o maior número");
		else if (c > a && b <= a) System.out.println(c+" é o maior número");
		else if (a == c && a == b) System.out.println("Todos os numeros são iguais");
	}

	public static void main (String args[]) {
 		retornaMaiorInt(5, 5, 5);
	} */ 

	/* public static void conversaoTemperatura(double C, double F, boolean fahrenheitToCelsius) {
		if(fahrenheitToCelsius)
			System.out.println(C = 5/9 * (F - 32));
		else 
			System.out.println(F = C * 1.8 + 32);
	}

	public static void main(String[] args){
		conversaoTemperatura(5, 104, true);
	} */ 


	/*
	 public static void checagemDeDatas(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2){
		if (ano1 < ano2) 
			System.out.println("Data + antiga é: "+dia1+"/"+mes1+"/"+ano1);
		else if (ano1 > ano2)
			System.out.println("Data + antiga é: "+dia2+"/"+mes2+"/"+ano2);
		else if (ano1 == ano2 && mes1 < mes2)
			System.out.println("Data + antiga é: "+dia1+"/"+mes1+"/"+ano1);
		else if (ano1 == ano2 && mes1 > mes2)
			System.out.println("Data + antiga é: "+dia2+"/"+mes2+"/"+ano2);
		else if (ano1 == ano2 && mes1 == mes2 && dia1 < dia2)
			System.out.println("Data + antiga é: "+dia1+"/"+mes1+"/"+ano1);
		else if (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)
			System.out.println("Data + antiga é: "+dia2+"/"+mes2+"/"+ano2);
		else if (ano1 == ano2 && mes1 == mes2 && dia1 == dia2)
			System.out.println("As duas datas são iguais");
	}

	public static void main (String args[]){
		checagemDeDatas(1, 4, 1990, 1, 4, 1990);
	} 
		*/ 

	public static void checagemLadosTriangulo(double lado1, double lado2, double lado3)	   {
		boolean trianguloCheck = false; 

		if (lado1 < (lado2 + lado3) && 
		    lado2 < (lado1 + lado3) && 
		    lado3 < (lado1 + lado2)) 
			System.out.println(trianguloCheck = true);
		else System.out.println(trianguloCheck);
	}

	public static void main (String[] args) {
		checagemLadosTriangulo(70, 30, 30);

	}
}






















