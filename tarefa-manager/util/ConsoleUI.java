package util;

public class ConsoleUI{
    
    private static final int LARGURA_TERMINAL = 80;
    
    public static void printCentralizado(String texto){
        int tamanhoTexto = texto.length();
        if(tamanhoTexto >= LARGURA_TERMINAL){
            System.out.println(texto);
            return ;
        }
        int espacos = (LARGURA_TERMINAL  - tamanhoTexto)/2;
        System.out.println(" ".repeat(espacos)+texto);
    }
    public static void printLinha(){
        System.out.println("=".repeat(LARGURA_TERMINAL));
    }
    
    public static void printTitulo(String texto){
        printLinha();
        printCentralizado(texto);
        printLinha();
        
        
    }
    
    public static void limparTela(){
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }
    public static void pularLinha(int linhas){
        for (int i = 0; i < linhas ; i ++){
            System.out.println();
        }
    }
}