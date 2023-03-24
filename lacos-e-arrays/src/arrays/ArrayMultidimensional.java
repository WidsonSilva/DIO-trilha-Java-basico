package arrays;

import java.util.Arrays;
import java.util.Random;
/**
    Exercicio: Gere e imprima uma matriz M 4x4 com valores  aleatórios  entra 0-9.
 */

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for(int l = 0; l < matriz.length; l++){
            for(int c = 0; c <matriz.length; c++){
                matriz[l][c] = random.nextInt(9);
            }
        }

        for ( int[] linha : matriz ) { //foreach
            for ( int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int l = 0; l < matriz.length; l++){ //for
            for (int c = 0; c < matriz.length; c++){
                System.out.printf(String.valueOf(matriz[l][c]) + " ");
            }
            System.out.println();
        }
    }
}
