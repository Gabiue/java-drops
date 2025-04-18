package dia05;
/*Crie um programa que determine se um ano é bissexto. As regras são:

O ano deve ser divisível por 4.

Se for divisível por 100, deve ser divisível por 400 para ser bissexto.

Requisitos:

Peça ao usuário para digitar um ano (inteiro).

Use operadores lógicos para verificar as condições acima.

Exiba o resultado no formato: */ 

import java.util.Scanner;

public class OperadoresLogicos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------DETERMINADOR DE ANO BISSEXTO------");

        System.out.print("Digite um ano para ser verificado: ");
        int ano =scanner.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.printf("O ano %d é bissexto!!!\n", ano);

        }
        else 
            System.err.printf("O Ano %d não é bissexto", ano);

            scanner.close();

    }
    
}

