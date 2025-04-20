 /*Crie um programa que:

Peça ao usuário para digitar números inteiros repetidamente.

Some todos os números digitados.

Pare de solicitar números quando o usuário digitar 0.

Ao final, exiba a soma total. */

import java.util.Scanner;

public class EstruturaRepeticao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber;
        int totalSum = 0;

        System.out.println("---------------SOMADOR--------------");
        System.out.println("Digite os numeros que quiser somar(digite 0 para parar)");

        while(true){
            System.out.print("Digite um numero: ");
            inputNumber = scanner.nextInt();
            
            if(inputNumber==0)
            {
                break;
            }
            totalSum += inputNumber;
        }

        System.out.printf("A soma é: %d \n", totalSum);

        scanner.close();
    }
}
