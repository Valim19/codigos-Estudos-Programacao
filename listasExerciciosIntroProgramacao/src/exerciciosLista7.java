package classes_TestesUnitarios_Java;

class exerciciosLista7 {

    public static boolean equals(String frase1, String frase2){
        if(frase1.equals(frase2)){
            return true;
        }
        return false;
    }

    public static int indexOfFirstOccurence(String fraseDeBusca, char caracterBuscado){
        for(int i = 0; i < fraseDeBusca.length(); i++){
            if(fraseDeBusca.charAt(i) == caracterBuscado){
                System.out.print("A posição do caracter buscado é: ");
                return i;
            }
        }
        return -1;
    }

    public static void imprimindoLetrasDepoisDoEspaço(String fraseOriginal){
        char[] fraseModificada = new char[fraseOriginal.length() - 1];
        int index = 0;

        for(int i = 0; i < fraseOriginal.length(); i++){
            if(fraseOriginal.charAt(i) == ' '){
                
                for(int j = i + 1; j < fraseOriginal.length();){
                    fraseModificada[index++] = fraseOriginal.charAt(j);
                    break;
                }
            }
        }

        String str = new String(fraseModificada);
        System.out.print(str);
    }

    public static void invertendoStrings(String fraseOriginal){
        char[] fraseInvertida = new char[fraseOriginal.length()];
        int index = 0;

        for(int i = fraseOriginal.length() - 1; i >= 0; i--){
            if(index < fraseOriginal.length()){
                fraseInvertida[index++] = fraseOriginal.charAt(i);
            } else {
                fraseInvertida[index] = fraseOriginal.charAt(i);
            }
        }

        String str = new String(fraseInvertida);
        System.out.println(str);
    }

    public static String devolveCopia(String fraseOriginal){
        String fraseCopiada = new String(fraseOriginal);
        
        System.out.println(fraseOriginal == fraseCopiada);

        return fraseCopiada;
    }

    public static void main(String[] args){
       // System.out.println(equals(new String("Olá"), new String("Ola")));
        
       // System.out.println(indexOfFirstOccurence(new String("Anna"), 'a'));
    
       // imprimindoLetrasDepoisDoEspaço("Eu quero muito nadar hoje");
    
       // invertendoStrings("Carolina");

       // System.out.println(devolveCopia("Devolvendo Copia"));
    }

}