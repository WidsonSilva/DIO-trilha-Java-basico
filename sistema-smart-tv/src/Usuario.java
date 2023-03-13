public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.ligar();
        System.out.println("\nTV Ligada ? " + smartTV.ligada);

        System.out.println("\nCanal atual :" + smartTV.canal);

        smartTV.diminuirVolume();
        System.out.println("\nVolume Atual :" + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Volume Atual :" + smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("\nCanal Atual :" + smartTV.canal);
        smartTV.subirCanal();
        System.out.println("Canal Atual :" + smartTV.canal);

        smartTV.diminuirCanal();
        System.out.println("\nCanal atual :" + smartTV.canal);

        smartTV.desligar();
        System.out.println("\nNovo status -> TV ligada ? " + smartTV.ligada);
    }
}