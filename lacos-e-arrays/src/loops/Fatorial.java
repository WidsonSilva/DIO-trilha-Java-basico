package loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor para ver seu Fatorial: ");
        int fatorial = scan.nextInt();
        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i= i-1){
            multiplicacao = multiplicacao * i;
            }
        System.out.println(multiplicacao);
        }
}
