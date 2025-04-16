package dia04;

/*Crie um programa que:

Peça ao usuário para digitar um número inteiro.

Verifique e exiba se o número é par ou ímpar.

Verifique e exiba se o número é positivo, negativo ou zero.*/

import java.util.Scanner;

public class VerificaNumero{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---VERIFICADOR DE NUMERO---");

        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.printf("O Numero %d é par\n", numero);
        }else{
            System.out.printf("O Numero %d é impar\n", numero);
        }
        if(numero > 0){
            System.out.printf("O Numero %d é positivo\n", numero);
        }
        else if(numero < 0){
            System.out.printf("O Numero %d é negativo\n", numero);
        }
        else{
            System.out.printf("O Numero %d é 0 \n", numero);
        }

        scanner.close();




    }

}
