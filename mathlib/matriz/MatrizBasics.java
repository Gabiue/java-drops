package mathlib.matriz;

import java.util.Random;

public class MatrizBasics {
    public static void main(String[] args) {
        Random gerador  = new Random();
        int linha = 4;
        int coluna = 4;
        int matriz1[][] = new int[linha][coluna];
        int matriz2[][] = new int[linha][coluna];
        int matrizSum[][] = new int[linha][coluna];
        int matrizMult[][] = new int[linha][coluna];


        for(int i = 0; i<linha ; i++){
            for(int j = 0; j<coluna; j++){

                matriz1[i][j] = gerador.nextInt(10);
            }
        }
        imprimirMatriz(matriz1, "MATRIZ 1");

        for(int i = 0; i<linha; i++){
            for(int j = 0; j<coluna; j++){

                matriz2[i][j] = gerador.nextInt(10);
            }
        }
            imprimirMatriz(matriz2, "MATRIZ 2");

        for(int i = 0; i<linha ; i++){
            for(int j = 0; j<coluna; j++){
                matrizSum[i][j] = matriz1[i][j]+ matriz2[i][j];
            }
        }
        imprimirMatriz(matrizSum, "MATRIZ SOMA");

        for(int i = 0; i<linha ; i++){
            for(int j = 0; j<coluna; j++){
                for(int k = 0; k<coluna; k++){
                    matrizMult[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        imprimirMatriz(matrizMult, "MATRIZ MULT");


    }

    public static void imprimirMatriz(int matriz[][], String nome){
        System.out.println(" \n----" + nome + "----");
        for(int[] linha : matriz){
            for(int valor : linha){
                System.out.printf("%4d ", valor);
            }
            System.out.println();
        }
    }
}
