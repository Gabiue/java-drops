package dia07;

 /*Crie um programa que calcule o fatorial de um número inteiro não negativo fornecido pelo usuário.

O fatorial de n (n!) é o produto de todos os inteiros de 1 até n.

Exemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120

Regra especial: 0! = 1 */

import java.util.Scanner;

public class EstruturaRepeticao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputN;
        int fatorial = 1;
        int i;

        System.out.println("----------CALCURADORA DE FATORIAL------------");

        System.out.print("Digite o numero fatorial: ");
        inputN = scanner.nextInt();

        if(inputN==0){
            System.out.printf("O fatorial %d! tem valor de 1 \n", inputN); 
        }
        else

        for(i=inputN; i>0 ;i--){

            fatorial *= i;
        }

        System.out.printf("O fatorial %d! tem valor de %d \n", inputN, fatorial);

        scanner.close();
    }
}


