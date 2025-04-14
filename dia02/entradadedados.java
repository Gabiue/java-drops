package dia02;
/*Entrada e saída de dados + operações matemáticas

Crie um programa que calcule a soma de dois números inseridos pelo usuário.
*/
    

import java.util.Scanner;

public class entradadedados{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int numero1; 
        int numero2;
        int soma;

        System.out.print("Informe o primeiro numero: ");
        numero1 = ler.nextInt();

        System.out.print("Informe o segundo numero: ");
        numero2 = ler.nextInt();

        soma = numero1 + numero2; 

        System.out.println("A soma do " +numero1+ " + " +numero2+ " é igual a " +soma);

        ler.close(); 




    }
}