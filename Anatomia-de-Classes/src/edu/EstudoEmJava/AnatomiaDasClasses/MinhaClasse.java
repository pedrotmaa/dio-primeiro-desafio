package edu.EstudoEmJava.AnatomiaDasClasses;
public class MinhaClasse {

    public static void main (String [] args){
    
        String primeiroNome = "Pedro Guilherme";
        String segundoNome = "Benedet de Moraes Rodrigues.";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print ("Olá Professor, muito obrigado!\nMeu Nome é: " + nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
