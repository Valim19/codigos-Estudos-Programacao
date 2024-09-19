import java.util.*;

public class EX1_B
{
	public static void main (String args[])
	{
		int n1, n2, n3, n4, soma;
		Scanner entrada;
		
		// Instancia o objeto da classe Scanner para receber as entradas
	    entrada = new Scanner(System.in);
   	   
		// Mostra mensagem antes da leitura dos quatro n�meros
		System.out.println("Digite quatro n�meros");
		
		// Recebe os quatro n�meros
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();
		n4 = entrada.nextInt();
		
		// Soma os n�meros digitados
		soma = n1 + n2 + n3 + n4;
		
		// Mostra mensagem e o resultado da soma
		System.out.println("Soma = "+soma);
	}
}