package loops;

import java.util.Scanner;
/*
    Exercicio: faça um programa que peça N números inteiros,
    calcule e mostre a quantidade de números pares
    e a quantidade de números impares.
*/
public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdNumeros ,qtdPares = 0, qtdImpares = 0;
        int numero;
        int count = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) qtdPares++;else qtdImpares++;
            count++;
        } while (count < qtdNumeros);

        System.out.println("Quantidade pares: " + qtdPares + "\nQuantidade impares: " + qtdImpares);
    }
}
