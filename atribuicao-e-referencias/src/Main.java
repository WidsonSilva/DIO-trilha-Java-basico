public class Main {
    public static void main(String[] args) {
        int intA = 1;       //tipo primitivo
        int intB = intA;

        System.out.println("Int A = " + intA + " Int B = " + intB);
        intA = 2;
        System.out.println("Int A = " + intA + " Int B = " + intB); //não pega o valor de A quando muda

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;     //atribuição de objetos
        System.out.println("Obj A = " + objA + " Obj B = " + objB);
        objA.setNum(2);
        System.out.println("Obj A = " + objA + " Obj B = " + objB); //pega o mesmo valor, pois vai na referencia de memoria
    }
}