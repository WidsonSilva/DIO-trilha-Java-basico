package arrays;

/*
    Exercicio: crie um vetor de 6 números inteiros
    e mostre-os na ordem inversa.
* */

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-6, -5, 15, 50, 8, 4};
        int count = 0;

        System.out.print("Vetor: ");
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\n\nVetor inverso: ");
        for (int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }

    }
}
