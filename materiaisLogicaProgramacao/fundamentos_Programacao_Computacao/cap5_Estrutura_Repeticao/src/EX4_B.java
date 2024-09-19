import java.util.*;
public class EX4_B 
{
  public static void main (String args[])
  	{
  		Scanner dado = new Scanner(System.in);
  		int cont, cod, num_vei, num_acid, soma_vei;
  		int maior, cid_maior, menor, cid_menor, cont_acid;
  		float media_vei, media_acid, soma_acid;
  		
		soma_vei = 0;
  		soma_acid = 0;
  		cont_acid = 0;
  		menor = 0;
  		maior = 0;
  		cid_maior = 0;
  		cid_menor = 0;
  		cont = 1;
		
		do
		{
			System.out.println("Digite o c�digo da "+cont+"� cidade");
			cod=dado.nextInt();
			System.out.println("Digite o n�mero de ve�culos de passeio da "+cont+"� cidade ");
			num_vei=dado.nextInt();
			System.out.println("Digite o n�mero de acidentes de tr�nsito da "+cont+" � cidade ");
			num_acid=dado.nextInt();
			if (cont == 1)
				{
					maior = num_acid;
					cid_maior = cod;
					menor = num_acid;
					cid_menor = cod;
				}
			else
			{
				if (num_acid > maior)
					{
						maior = num_acid;
						cid_maior = cod;
					}
			 if (num_acid < menor)
					{
						menor = num_acid;
						cid_menor = cod;
					}
			}
			soma_vei = soma_vei + num_vei;
			if (num_vei < 2000)
				{
					soma_acid = soma_acid + num_acid;
					cont_acid = cont_acid + 1;
				}
		cont = cont + 1;
		}
		while (cont<=5);
		System.out.println("Maior n�mero de acidentes = "+maior+" na cidade de c�digo = "+cid_maior);
		System.out.println("Menor n�mero de acidentes = "+menor+" na cidade de c�dgio = "+cid_menor);
		media_vei = soma_vei/5;
		System.out.println("M�dia de ve�culos nas 5 cidades = "+media_vei);
		if (cont_acid == 0)
			 System.out.println("N�o foi digitada nenhuma cidade com menos de 2000 ve�culos");
		else
			 {
				media_acid = soma_acid/cont_acid;
				System.out.println("M�dia de acidentes nas cidades com menos de 2000 ve�culos = "+media_acid);
			 }
  	}
}