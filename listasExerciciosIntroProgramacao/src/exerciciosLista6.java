package classes_TestesUnitarios_Java;

/*
class Olah { 
    public void escrevaOlaNaTela(int tipoOla){
        if(tipoOla == 0)
            System.out.println("Olaaaaaa");
        else if (tipoOla == 1)
            System.out.println("alo");
        else if (tipoOla == 2)
            System.out.println("Hello");
        else 
            System.out.println("Escolha um número entre 0 e 2");
    }

    public static void main (String[] args){
        Olah olah = new Olah();

        olah.escrevaOlaNaTela(7);
    }
}
*/

/*
class Simples {
    public int inicializaArranjo(int[] a, int v){
        int a2[] = new int[a.length];
        
        for(int i = 0; i < a.length; i++)
            a2[i] = v;

        System.out.print("O Tamanho do Array é: ");

        return a.length;
    }

    public void imprimeArranjo(int a[]){
        System.out.println("Os elementos do arranjo original são: ");
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + "\t");
    }

    boolean estaNoArranjo(int []a, int v){
       System.out.println();
       
        for(int i = 0; i < a.length; i++){
            if(v == a[i]){
                return true;
            }
        }

        return false;
    }

    public static void main (String[] args){
        Simples obj = new Simples();
        
        int a[] = {1, 2, 3, 4, 5};

        System.out.println(obj.inicializaArranjo(a, 8));
        obj.imprimeArranjo(a);
        System.out.println(obj.estaNoArranjo(a, 10));
    }

}
*/

/*
class Inteiro {
    int valor;

    void carregaValor(int v){
        valor = v;
        System.err.println(valor);
    }

    int devolveValor(){
        return valor;
    }

    int devolveValorAbsoluto(){
        if(valor >= 0){
            return valor;
        } else {
            return valor * (-1);
        }

    }

    void imprime(){
        System.out.println(valor);
    }

    int soma(int v){
        return valor += v;
    }

    int subtrai(int v){
        return valor -= v;
    }

    int multiplicaPor(int v){
        return valor *= v;
    }

    int dividePor(int divisor){
        if(divisor != 0){
            return valor /= divisor;
        } else {
            System.out.println("Erro! O seu divisor é igual a 0");
            return valor;
        }
    }

    public static void main(String args[]){
        Inteiro valor = new Inteiro();

        valor.carregaValor(-20);

        System.out.println(valor.devolveValor());

        System.out.println(valor.devolveValorAbsoluto() );

        valor.imprime();

        System.out.println(valor.soma(5));

        System.out.println(valor.subtrai(10));

        System.out.println(valor.multiplicaPor(100));

        System.out.println(valor.dividePor(6));

    }

}
*/


class Esferas {
    double raio;

    double retornaAreaSuperficie(double r){
        double area;
        
        raio = r;

        area = 4 * Math.PI * Math.pow(raio, 2);

        return area;

    }


    // V = 4/3 * Math.PI * Math.pow(raio, 3)
    double retornaVolume(double r){
        double volume;
        raio = r;

        volume = (4/3) * Math.PI * Math.pow(raio, 3);

        return volume;

    }

}

class exerciciosLista6 {

    public static void main(String args[]){
        Esferas esfera1 = new Esferas();

        System.out.println(esfera1.retornaAreaSuperficie(10));

        System.out.println(esfera1.retornaVolume(10));
    }

}