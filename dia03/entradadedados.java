 
 
 /*Peça ao usuário a base e a altura de um retângulo (valores inteiros).
Calcule:
Área: base * altura
Perímetro: 2 * (base + altura)
Exiba os resultados no formato:
*/

import java.util.Scanner;

public class entradadedados{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int area; 
        int altura;
        int largura;
        int perimetro;

        System.out.println("-----------CALCULADORA DE RETÂNGULO-----------");

        System.out.print("Digite a altura: ");
        altura = scanner.nextInt();

        System.out.print("Digite a largura: ");
        largura = scanner.nextInt();

        area = altura * largura; 
        perimetro = 2* (altura + largura);

        System.out.printf("A aréa do retângulo é: "+area);

        System.out.printf("O Perímetro é: "+perimetro);

        scanner.close();


    }
}