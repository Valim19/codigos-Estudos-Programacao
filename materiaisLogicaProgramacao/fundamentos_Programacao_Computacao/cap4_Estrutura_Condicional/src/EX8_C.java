import java.util.*;

public class EX8_C {
	public static void main (String args[]) {
		double num1, num2, soma, raiz;
 		int op;
		
		Scanner entrada;
		//Instancia o objeto da classe Scanner
		entrada = new Scanner(System.in);  
		
		//Mostra mensagem solicitando a op��o do usu�rio
		System.out.print("Digite sua op��o: ");
		
		//Mostra um menu de op��es
 		System.out.println("1- Somar dois n�meros");
 		System.out.println("2- Raiz quadrada de um n�mero");
 		
 		//Recebe a op��o do usu�rio
 		op = entrada.nextInt();		
 		switch (op) {
 		
			case 1: //Se a op��o igual a 1, soma dois n�meros
    	{
    		System.out.print("Digite um valor para o primeiro n�mero: ");
    		num1 = entrada.nextDouble();		
		    System.out.print("Digite um valor para o segundo n�mero: ");
		    num2 = entrada.nextDouble();		
		    soma = num1 + num2;
		    System.out.println("A soma de " + num1 + " e " + num2 + " � " + soma);
		    break;
    	}
    	case 2: //Se a op��o igual a 2, extrai a raiz quadrada
 		{
		    System.out.print("Digite um n�mero: ");
		    num1 = entrada.nextDouble();		
		    raiz = Math.sqrt(num1);
		    System.out.println("A raiz quadrada de " + num1 + " � " + raiz);
		    break;
		}
		default:System.out.println("Op��o inv�lida !");
		}	
   	}
}