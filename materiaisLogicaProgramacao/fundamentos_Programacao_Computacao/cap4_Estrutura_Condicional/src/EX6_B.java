import java.util.*;

public class EX6_B
{
	public static void main (String args[])
	{
		int num, resto;
		Scanner entrada;
		//Instancia o objeto da classe Scanner
		entrada = new Scanner(System.in);
		
		//Mostra mensagem solicitando um n�mero
		System.out.print("Digite um n�mero: ");
		num = entrada.nextInt();		
		//Determina o resto da divis�o do n�mero por 2
		resto = num % 2;
		
		//Se resto igual a zero ent�o o n�mero � par, caso contr�rio, � �mpar
		if (resto == 0)
   		 System.out.println("O n�mero � par");
		else 
   		 System.out.println("O n�mero � �mpar");
   	}
}