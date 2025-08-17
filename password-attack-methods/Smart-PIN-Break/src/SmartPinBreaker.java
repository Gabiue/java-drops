import java.util.Scanner;
import java.util.Random;

public class SmartPinBreaker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o PIN (0000-9999): ");
        int alvoInt = scanner.nextInt();

        if (alvoInt > 9999) {
            System.out.println("PIN inválido (deve estar entre 0000 e 9999).");
            scanner.close();
            return;
        }

        // Converter para array de caracteres
        String alvoStr = String.format("%04d", alvoInt);
        char[] alvo = alvoStr.toCharArray();

        long inicio = System.currentTimeMillis();
        int tentativas = 0;

        // Iniciar com tentativa aleatória
        char[] tentativa = gerarTentativaAleatoria();

        while (true) {
            tentativas++;
            String tentativaStr = new String(tentativa);

            // Verificar se encontrou
            if (tentativaStr.equals(alvoStr)) {
                long fim = System.currentTimeMillis();
                long duracaoMs = fim - inicio;
                double taxas = tentativas / (duracaoMs / 1000.0);

                System.out.println("PIN encontrado: " + tentativaStr);
                System.out.println("Tentativas: " + tentativas);
                System.out.println("Tempo: " + duracaoMs + " ms");
                System.out.printf("Taxa: %.2f tentativas/seg%n", taxas);
                break;
            }

            // Analisar quais posições estão corretas
            boolean[] posicoesCorretas = new boolean[4];

            for (int i = 0; i < 4; i++) {
                if (tentativa[i] == alvo[i]) {
                    posicoesCorretas[i] = true;
                }
            }

            // Gerar próxima tentativa mantendo dígitos corretos
            tentativa = gerarProximaTentativa(tentativa, posicoesCorretas);
        }

        scanner.close();
    }

    /**
     * Gera uma tentativa inicial aleatória
     */
    private static char[] gerarTentativaAleatoria() {
        Random random = new Random();
        char[] tentativa = new char[4];

        for (int i = 0; i < 4; i++) {
            tentativa[i] = (char) ('0' + random.nextInt(10));
        }

        return tentativa;
    }

    /**
     * Gera próxima tentativa mantendo dígitos corretos e alterando os errados
     */
    private static char[] gerarProximaTentativa(char[] tentativaAtual, boolean[] posicoesCorretas) {
        Random random = new Random();
        char[] novaTentativa = tentativaAtual.clone();

        // Só alterar posições que estão erradas
        for (int i = 0; i < 4; i++) {
            if (!posicoesCorretas[i]) {
                // Gerar novo dígito diferente do atual
                char novoDigito;
                do {
                    novoDigito = (char) ('0' + random.nextInt(10));
                } while (novoDigito == tentativaAtual[i]);

                novaTentativa[i] = novoDigito;
            }
        }

        return novaTentativa;
    }
}