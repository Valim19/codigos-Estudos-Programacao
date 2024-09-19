import java.util.*;

public class EX4_B
{
	public static void main (String args[])
	{
		float sal, aumento, novosal;	
		Scanner entrada;
		
		// Instancia o objeto da classe Scanner para receber as entradas
	    entrada = new Scanner(System.in);

  		System.out.println("Digite o sal�rio do funcion�rio: ");
  		
		// Recebe o sal�rio
  		sal = entrada.nextFloat();

   		aumento = sal * 25/100;

   		novosal = sal + aumento;

  		System.out.println("Novo sal�rio = " + novosal);
	}
}