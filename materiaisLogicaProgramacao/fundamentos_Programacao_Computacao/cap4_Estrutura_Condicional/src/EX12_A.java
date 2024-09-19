import java.util.*;

public class EX12_A {
	public static void main (String args[]) {
		float salario, aumento, novo_sal;
 		int cargo;
		
		Scanner entrada;
		//Instancia o objeto da classe Scanner
		entrada = new Scanner(System.in);  
		
		//Mostra mensagem solicitando o cargo (os valores podem ser 1,2,3,4 ou 5)
 		System.out.println("Digite o cargo do funcion�rio (1,2,3,4 ou 5)");
 		//Recebe o valor do cargo
		cargo = entrada.nextInt();		
 		//Mostra mensagem solicitando o valor do sal�rio
 		System.out.println("Digite o valor do sal�rio");
 		//Recebe valor do sal�rio
		salario = entrada.nextFloat();		
  		
		/* 	Dependendo do cargo informado, apresenta o nome do cargo, valor do aumento e novo sal�rio
 			Caso seja digitado um cargo inexistente, mostra-se a mensagem - Cargo Inexistente 
		*/
 		
		if (cargo == 1) { 
    		System.out.println("O cargo � Escritur�rio");
      		aumento = salario * 50 / 100;
      		System.out.println("O valor do aumento �: " + aumento);
      		novo_sal = salario + aumento;
      		System.out.println("O novo sal�rio �: " + novo_sal);
      	}
 		else if (cargo == 2) { 
      		 	System.out.println("O cargo � Secret�rio");
				aumento = salario * 35 / 100;
				System.out.println("O valor do aumento �: " + aumento);
				novo_sal = salario + aumento;
				System.out.println("O novo sal�rio �: " + novo_sal);
			 }
   			else if (cargo == 3) { 
				 	System.out.println("O cargo � Caixa");
	  				aumento = salario * 20 / 100;
	  				System.out.println("O valor do aumento �: " + aumento);
	  				novo_sal = salario + aumento;
	  				System.out.println("O novo sal�rio �: " + novo_sal);
	  			}
     			else if (cargo == 4) { 
	  				 	System.out.println("O cargo � Gerente");
	    				aumento = salario * 10 / 100;
	    				System.out.println("O valor do aumento �: " + aumento);
	    				novo_sal = salario + aumento;
	    				System.out.println("O novo sal�rio �: " + novo_sal);
	    			}
       				else if (cargo == 5) {	
	    				 	System.out.println("O cargo � Diretor");
	      					aumento = salario * 0 / 100;
	      					System.out.println("O valor do aumento �: " + aumento);
	      					novo_sal = salario + aumento;
	      					System.out.println("O novo sal�rio �: " + novo_sal);
	      			    }
	 					
						else System.out.println("Cargo Inexistente !");
   	}
}