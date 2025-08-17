import java.util.Scanner;

public class PinBreaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu pin (somente 4 números): ");
        int alvoInt = sc.nextInt();

        if(alvoInt > 9999){
            System.out.println("PIN INVALIDO!!");
            sc.close();
            return;
        }
        long inicio = System.currentTimeMillis();
        int tentativas = 0;
        boolean encontrado = false;
        int pinEncontrado = 0;

        //FORÇA BRUTA

        for(int i = 0; i<=9999; i++){
            tentativas++;

            if(i == alvoInt){
                encontrado = true;
                pinEncontrado = i;
                break;

            }
        }
        long fim = System.currentTimeMillis();
        long duracao = fim - inicio;

        if (encontrado) {
            double taxas = tentativas / (duracao / 1000.0);
            System.out.println("PIN encontrado: " + formatarComZerosAEsquerda(pinEncontrado, 4));
            System.out.println("Tentativas: " + tentativas);
            System.out.println("Tempo: " + duracao + " ms");
            System.out.printf("Taxa: %.2f tentativas/seg%n", taxas);
        }
        else {
            System.out.println("PIN não encontrado dentro do espaço de busca.");
        }

        sc.close();
    }

    private static String formatarComZerosAEsquerda(int numero, int tamanho) {
        return String.format("%0" + tamanho + "d", numero);
    }
}
