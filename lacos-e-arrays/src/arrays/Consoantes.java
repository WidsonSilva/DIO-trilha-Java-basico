package arrays;

import java.util.Scanner;

/*
    Exercicio: faça um programa que leia um vetor de 6 catacteres,
    e diga quantas consoantes foram lidas
    Imprima as consoantes
* */
public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if
                (!(letra.equalsIgnoreCase("a")
                ||letra.equalsIgnoreCase("e")
                ||letra.equalsIgnoreCase("i")
                ||letra.equalsIgnoreCase("o")
                ||letra.equalsIgnoreCase("u"))
            ){
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.print("Consoantes: ");
        for ( String consoante : consoantes ){
            if (consoante != null)
            System.out.print(consoante + " ");
        }
    }
}
