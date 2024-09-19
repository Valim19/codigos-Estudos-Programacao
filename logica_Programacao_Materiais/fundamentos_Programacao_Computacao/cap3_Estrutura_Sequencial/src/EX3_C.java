import java.util.*;

public class EX3_C
{
	public static void main (String args[])
	{
		float nota1,nota2,nota3,peso1,peso2,peso3,soma1,soma2,soma3,total,media;
		Scanner entrada;
		
		// Instancia o objeto da classe Scanner para receber as entradas
	    entrada = new Scanner(System.in);
   	    
		//Mostra mensagem antes da leitura da 1� nota
		System.out.println("Digite a 1� nota");
		
		// Recebe a 1� nota
		nota1 = entrada.nextFloat();
		
		//Mostra mensagem antes da leitura do peso da 1� nota
		System.out.println("Digite o peso da 1� nota");
		
		// Recebe o 1� peso
		peso1 = entrada.nextFloat();
		
		//Mostra mensagem antes da leitura da 2� nota
		System.out.println("Digite a 2� nota");
		
		// Recebe a 2� nota
		nota2 = entrada.nextFloat();
		
		//Mostra mensagem antes da leitura do peso da 2� nota
		System.out.println("Digite o peso da 2� nota");
		
		// Recebe o 2� peso
		peso2 = entrada.nextFloat();
		
		//Mostra mensagem antes da leitura da 3� nota
		System.out.println("Digite a 3� nota");
		
		// Recebe a 3� nota
		nota3 = entrada.nextFloat();
		
		//Mostra mensagem antes da leitura do peso da 3� nota
		System.out.println("Digite o peso da 3� nota");
		
		// Recebe o 3� peso
		peso3 = entrada.nextFloat();
		
		// Calcula a m�dia
		soma1=nota1 * peso1;
		soma2=nota2 * peso2;
		soma3=nota3 * peso3;
		total=peso1 + peso2 + peso3;
		media = (soma1 + soma2 + soma3)/total;
		
		// Mostra o resultado da m�dia
		System.out.println("M�dia = "+media);
	}
}