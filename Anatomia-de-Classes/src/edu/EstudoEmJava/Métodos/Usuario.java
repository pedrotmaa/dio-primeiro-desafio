package edu.EstudoEmJava.Métodos;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        smartTv.mudarCanal(13);
        
        smartTv.aumentar();

        smartTv.diminuir();

        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

        smartTv.desligar();
    }
    
}
