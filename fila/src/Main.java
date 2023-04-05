public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);

        System.out.println("Tira o primeiro da fila: " + minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("Ultimo");

        System.out.println(minhaFila);

        System.out.println("Primeiro da fila: " + minhaFila.first());

        System.out.println(minhaFila);

    }
}