import java.util.*;

public class EX3_A {
	public static void main (String args[]) {
		float num1, num2;
		
		Scanner entrada;
		//Instancia o objeto da classe Scanner
		entrada = new Scanner(System.in);
		
		//Mostra mensagem solicitando o primeiro n�mero
		System.out.print("Digite o primeiro n�mero: ");
		
		//Recebe o valor do primeiro n�mero
		num1 = entrada.nextFloat();		
		
		//Mostra mensagem solicitando o segundo n�mero
		System.out.print("Digite o segundo n�mero: ");
		
		//Recebe o valor do segundo n�mero
		num2 = entrada.nextFloat();		
		
		//Determina e mostra o maior n�mero
		if (num1 > num2)
   		System.out.println("O maior n�mero �: " + num1);
		if (num2 > num1)
   		System.out.println("O maior n�mero �: " + num2);
   		if (num1 == num2)
   		System.out.println("Os n�meros s�o iguais");
   	}
}