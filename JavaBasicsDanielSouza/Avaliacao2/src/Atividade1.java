import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro, um decimal e um nome separado por (tab): ");
        String linha = sc.nextLine();

        //METODO SLIPT

        String[] partes =linha.split("\t");

        int inteiro = Integer.parseInt(partes[0]);
        double decimal = Double.parseDouble(partes[1]);
        String nome = partes[2];

        System.out.println("Você digitou o inteiro: " + inteiro);
        System.out.println("Você digitou o ponto flutuante: " + decimal);
        System.out.println("Você digitou o nome composto: " + nome);

        sc.close();
    }
}
