import java.util.*;

public class EX5_A {
	public static void main (String args[]) {
		
		int num1, num2, num3, num4;
		
		Scanner entrada;
		//Instancia o objeto da classe Scanner
		entrada = new Scanner(System.in);
		
		//Mostra mensagem solicitando tr�s n�meros em ordem crescente
		System.out.println("Digite tr�s n�meros em ordem crescente: ");
		//Recebe os tr�s n�meros
		num1 = entrada.nextInt();		
		num2 = entrada.nextInt();		
		num3 = entrada.nextInt();		
		
		//Mostra mensagem solicitando um quarto n�mero em ordem aleat�ria
		System.out.println("Digite um n�mero (fora de ordem): ");
		//Recebe valor do quarto n�mero
		num4 = entrada.nextInt();		
		
		//Determina e mostra a ordem decrescente dos quatro n�meros digitados
		if (num4 > num3)
   		System.out.println("A ordem decrescente dos n�meros �: "+num4+" - "+num3+" - "+num2+" - "+num1);
		if (num4 > num2 && num4<num3)
   		System.out.println("A ordem decrescente dos n�meros �: "+num3+" - "+num4+" - "+num2+" - "+num1);
		if (num4 > num1 && num4 < num2)
   		System.out.println("A ordem decrescente dos n�meros �: "+num3+" - "+num2+" - "+num4+" - "+num1);
		if (num4 < num1)
   		System.out.println("A ordem decrescente dos n�meros �: "+num3+" - "+num2+" - "+num1+" - "+num4);
   	}
}