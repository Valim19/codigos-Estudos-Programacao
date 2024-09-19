package exercicioUm;

public class Produto {
	private int codigoDoProduto;
	private int codigoDoFabricante;
	
	public Produto(int codigoDoFabricante, int codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
		this.codigoDoFabricante = codigoDoFabricante;
	}
	
	public int getCodigoDoFabricante() {
		return codigoDoFabricante;
	}
	
	public int getCodigoDoProduto() {
		return codigoDoProduto;
	}
	
	public static void ordenarArrayBubble(Produto[] arrObj) {
        int n = arrObj.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
            	if (arrObj[j].getCodigoDoFabricante() > arrObj[j + 1].getCodigoDoFabricante()) {
            		
                    Produto auxiliar = arrObj[j];
                    arrObj[j] = arrObj[j + 1];
                    arrObj[j + 1] = auxiliar;
                    
                } else if (arrObj[j].getCodigoDoFabricante() == arrObj[j + 1].getCodigoDoFabricante()) {
                	
                    if (arrObj[j].getCodigoDoProduto() > arrObj[j + 1].getCodigoDoProduto()) {

                        Produto auxiliar = arrObj[j];
                        arrObj[j] = arrObj[j + 1];
                        arrObj[j + 1] = auxiliar;
                        
                    }
                }
            }
        }
	}
	
	public static void main(String args[]) {
		Produto obj1 = new Produto(1000, 1500);
		Produto obj2 = new Produto(1000, 2000);
		Produto obj3 = new Produto(1500, 2500);
		
		Produto.ordenarArrayBubble(new Produto[] {obj1, obj2, obj3});

		for(Produto produto : new Produto[] { obj1, obj2, obj3 }) {
			System.out.println(produto.getCodigoDoFabricante() + " " + produto.getCodigoDoProduto());
		}

	}
	
}
