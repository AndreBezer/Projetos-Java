package Projetos.jogoAdivinhacao;

// Import
import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        
        // Criação do Scanner e do Gerador
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        // Sorteio do numero entre 0 e 3
        int numeroSorteado = gerador.nextInt(3); // Numero limite

        // Input do usuario
        System.out.println("Digite um numero: ");
        int escolha = sc.nextInt();

        // Tomada de decisão se o player acertou ou errou
        if(escolha == numeroSorteado){
            System.out.println("Voce acertou!!");
        } else{
            System.out.println("Errou");
        }
    }
}
