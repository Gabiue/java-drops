public class TiposPrimitivos{
    public static void main (String[] args){
        
        //Tipos inteiros
        byte idadeByte = 25;
        short populacaoCidade = 32000;
        int populacaoPais = 210000000;
        long populacaoMundial = 7900000000L;
        
        //Tipos decimais
        float precoProduto = 19.99f;
        double pi = 3.141592653589793;
        
        //Tipo caractere
        char inicial = 'G';
        
        //Tipo lógico
        boolean estaAtivo = true;
        
        System.out.println("byte: " + idadeByte);
        System.out.println("short: " + populacaoCidade);
        System.out.println("int: " + populacaoPais);
        System.out.println("long: " + populacaoMundial);
        System.out.println("float: " + precoProduto);
        System.out.println("double: " + pi);
        System.out.println("char: " + inicial);
        System.out.println("boolean: " + estaAtivo);
    }
}