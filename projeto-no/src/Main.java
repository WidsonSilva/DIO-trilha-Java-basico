public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteúdo no1");
        No<String> no2 = new No<>("Conteúdo no2");

        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteúdo no3");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteúdo no4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null

        System.out.println("Nó1    : " + no1);
        System.out.println("Nó1 GET: " + no1.getProximoNo());

        System.out.println("--------------------------------");

        System.out.println("Nó1 GET: " + no1.getProximoNo()); //Pega o próximo nó com o no1 pegando o n02
        System.out.println("Nó1 GET: " + no1.getProximoNo().getProximoNo()); //Pega o próximo nó com o no1 pegando o n03
        System.out.println("Nó1 GET: " + no1.getProximoNo().getProximoNo().getProximoNo()); //Pega o próximo nó com o o no1 pegando o n04
        System.out.println("Nó1 GET: " + no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); //Pega o próximo nó com o no1 pegando o valor null

        //no1 aponta para o no2 que aponta para o no3 que aponta para o no4 que aponta para null


    }
}