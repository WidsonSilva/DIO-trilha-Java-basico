import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>(); //Generics (JDK 5) - Diamond Operator
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(3d);
        notas.add(0d);
        notas.add(9d);

        System.out.println(notas.toString());
        //System.out.println(notas);

        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d) + " Posição");

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0");
        notas.set(3,6d);
        System.out.println(notas);

        System.out.print("\nConfira se a nota 5.0 está na lista: ");
        //notas.contains(5.0);
        if (notas.contains(5d)){
            System.out.print("Está na lista");
        } else System.out.print("Não está na lista");

        System.out.println("\n\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) {System.out.print(nota + " ");}

        System.out.println("\n\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas + "\n");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("\nExiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("\nExiba a média dos valores:\n" + "Média: " + (soma/notas.size()));

        System.out.println("\nRemova a nota 0: ");
        System.out.println("Antes: " + notas);
        notas.remove(0d);
        System.out.println("Depois: " + notas);

        System.out.println("\nRemova a nota da posição 0: ");
        System.out.println("Antes: " + notas);
        notas.remove(0);
        System.out.println("Depois: " + notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        System.out.println("Antes: " + notas);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){iterator1.remove();}
        }

        System.out.println("Depois: " + notas);

        System.out.println("\nApague toda a lista");
        notas.clear();
        System.out.println(notas);
        System.out.print("Confira se a lista está vazia: ");
        if(notas.isEmpty()){
            System.out.print("Está vazia");
        } else System.out.print("Não está vazia");

    }
}