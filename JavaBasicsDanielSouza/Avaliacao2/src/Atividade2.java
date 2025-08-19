import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a String a ser verificada: ");
        String palavra = sc.nextLine();
        int indice= -1;
        palavra = palavra.toLowerCase();

        for(int i = 0; i < palavra.length(); i++){

            if (palavra.charAt(i) =='a' || palavra.charAt(i) =='e' ||
                    palavra.charAt(i) =='i' ||
                    palavra.charAt(i) =='o' ||
                    palavra.charAt(i) =='u') {
                    indice = i;
            }
        }
        if (indice != -1) {
            System.out.println("A última ocorrência de vogal em \"" + palavra + "\" está no índice: " + indice);
        } else {
            System.out.println("Vogal não encontrada!");
        }

        sc.close();
    }
}
