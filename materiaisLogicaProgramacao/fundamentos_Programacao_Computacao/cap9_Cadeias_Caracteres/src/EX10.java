import java.util.*;
public class EX10
{
	public static void main(String args[])
		{ 
			Scanner dado = new Scanner(System.in);
			String frase, novafrase;
			System.out.println("Digite uma frase");
  			frase=dado.nextLine();
  			novafrase=frase.toUpperCase();
  			novafrase = novafrase.replaceAll("ALUNO","ESTUDANTE");
  			novafrase = novafrase.replaceAll("ESCOLA","UNIVERSIDADE");
			System.out.println("Nova frase = "+novafrase);		
		}
}
