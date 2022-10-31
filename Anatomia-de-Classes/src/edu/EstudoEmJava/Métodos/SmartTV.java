package edu.EstudoEmJava.Métodos;

public class SmartTV {
    /*
    Criando um exemplo de uma classe para representar uma SmartTV onde:
    1. Ela tenha as características: ligada(boolean), canal(int) e volume(int);
    2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
    4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo um número correspondente;
    */

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void aumentar(){
        System.out.println("Diminuindo o Volume para: " + ++volume);
    }
    public void diminuir(){
        System.out.println("Aumentando o Volume para: " + --volume);
    }

    public void ligar(){
        ligada = true;
        System.out.println("Novo Status - TV Ligada ? " + ligada);
    }
    public void desligar(){
        ligada = false;
        System.out.println("Novo Status - TV Ligada ? " + ligada);
    }

    public void mudarCanal(int novoCanal){
        System.out.println("O canala desejado é: " + (canal = novoCanal));
    }
    public void aumentarCanal(){
        System.out.println("Aumentando Canal para: " + ++canal);
    }
    public void diminuirCanal(){
        System.out.println("Diminuindo Canal para: " + --canal);
    }
    
}
