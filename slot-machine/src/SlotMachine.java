import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    private static final String[] SYMBOLS = {"🍇","🍉","🍋","🍊","🍌","🍒"};

    private static final int[] WEIGHTS = {2,3,6,6,4,5};
    private static final Map<String, Integer>PAYTABLE = Map.of(
            "🍇", 25,
            "🍉", 15,
            "🍒", 12,
            "🍌", 8,
            "🍊", 6,
            "🍋", 5
    );

    private static final int REELS =3;
    private static final int FRAMES = 15;
    private static final long FRAME_MS = 120L;
    private static final Random RNG = new Random();

    public static void main(String[] args) throws InterruptedException {
        try (Scanner sc = new Scanner(System.in)){
            clearScreen();
            System.out.println("\uD83C\uDFB0 Lets go a gambling!!");
            int saldo = 100;

            while (true){
                System.out.printf("%nSeu saldo: R$ %d%n", saldo);
                int aposta = readInt(sc,"Aposte (0 para sair): ", 0, saldo);
                if (aposta == 0){
                    System.out.println("Até mais! 👋");
                    break;
                }
                for(int f = 0; f < FRAMES; f++){
                    String[] frame = spinOnce();
                    System.out.print("\r🎰 " + String.join(" ", frame));
                    Thread.sleep(FRAME_MS);
                }
                // RESULTADO
                String[] resultado = spinOnce();
                System.out.print("\r🎰 " + String.join(" ", resultado) + "   \n");

                int premio = evaluete(resultado, aposta);
                if(premio > 0){
                    saldo +=(premio - aposta);
                    System.out.printf("✨ LINHA! %s %s %s  | Pagou: R$ %d (x%d)%n",
                            resultado[0], resultado[1], resultado[2],
                            premio, premio / aposta);
                }
                else {
                    saldo -= aposta;
                    System.out.println("Nada feito... tente novamente! 🍀");
                }

                if (saldo <= 0) {
                    System.out.println("Saldo zerado. Fim de jogo! 😵");
                    break;
                }
            }
        }
    }
    private static String[]spinOnce(){
        String [] r = new String[REELS];
        for(int i = 0; i< REELS; i++) r[i] = pickWeighted();
        return r;
    }
    private static int evaluete(String[]res, int aposta) {
        boolean allEqual = true;
        for (int i = 0; i < res.length; i++) {
            if (!res[i].equals(res[0])) {
                allEqual = false;
                break;
            }
        }
        if(!allEqual) return 0;
        int mult = PAYTABLE.getOrDefault(res[0], 0);
        return aposta * mult;
    }
    //UTILS
    private static String pickWeighted(){
        int total = 0;
        for(int w : WEIGHTS) total  += w;
        int x = RNG.nextInt(total);
        int acc = 0;
        for (int i = 1; i <WEIGHTS.length; i++){
            acc += WEIGHTS[i];
            if(x < acc) return SYMBOLS[i];
        }
        return SYMBOLS[SYMBOLS.length -1];
    }
    private static int readInt(Scanner sc, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int v = sc.nextInt();
                if (v >= min && v <= max) return v;
                System.out.printf("Digite um número entre %d e %d.%n", min, max);
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.next(); // descarta token inválido
            }
        }
    }
    private static void clearScreen() {

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}