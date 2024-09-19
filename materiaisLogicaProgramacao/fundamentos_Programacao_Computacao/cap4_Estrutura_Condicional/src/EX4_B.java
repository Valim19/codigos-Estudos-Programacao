import java.util.*;

public class EX4_B {
	public static void main (String args[]) {
		int num1, num2, num3;
		Scanner entrada;
		
		//Instancia o objeto da classe Scanner
		entrada = new Scanner(System.in);
		
		//Mostra mensagem solicitando o primeiro n�mero
		System.out.print("Digite o primeiro n�mero: ");
		//Recebe o valor do primeiro n�mero
		num1 = entrada.nextInt();		
		//Mostra mensagem solicitando o segundo n�mero
		System.out.print("Digite o segundo n�mero: ");
		//Recebe o valor do segundo n�mero
		num2 = entrada.nextInt();		
		//Mostra mensagem solicitando o terceiro n�mero
		System.out.print("Digite o terceiro n�mero: ");
		//Recebe o valor do terceiro n�mero
		num3 = entrada.nextInt();		
		
		//Determina e mostra a ordem crescente dos n�meros digitados
		if (num1 < num2 && num1 < num3)
		 {
		   if (num2 < num3)
      		System.out.println("A ordem crescente dos n�meros �: " + num1 + " - " + num2 + " - " + num3);
   		   else 
   			System.out.println("A ordem crescente dos n�meros �: " + num1 + " - " + num3 + " - " + num2);
		 }   
		
		 else if (num2 < num1 && num2 < num3)
		 	  {
		   		if (num1 < num3)
      			 System.out.println("A ordem crescente dos n�meros �: " + num2 + " - " + num1 + " - " + num3);
   		   		else
   				 System.out.println("A ordem crescente dos n�meros �: " + num2 + " - " + num3 + " - " + num1);
		 	  }   
		 	  else 
		 	  	{
		 	  		if (num1 < num2)
      				 System.out.println("A ordem crescente dos n�meros �: " + num3 + " - " + num1 + " - " + num2);
   		   			else 
   		   			 System.out.println("A ordem crescente dos n�meros �: " + num3 + " - " + num2 + " - " + num1);
		 		}   
   	}
}