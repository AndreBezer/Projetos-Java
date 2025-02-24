package ProjetosJava.Calculadora_simples;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1, n2, n3;
        String sinal;

        System.out.print("Digite um numero: ");
        n1 = sc.nextFloat();
        System.out.print("Digite um numero: ");
        n2 = sc.nextFloat();
        System.out.print("Digite a operação: ");
        sinal = sc.next();

        switch (sinal) {
            case "+":
                n3 = n1 + n2;
                System.out.println("O resultado da soma entre os numeros digitados é: " + n3);
                break;

            case "-":
                n3 = n1 - n2;
                System.out.println("O resultado da subtração entre os numeros digitados é: " + n3);
                break;

            case "*":
                n3 = n1 * n2;
                System.out.println("O resultado da multiplicação entre os numeros digitados é: " + n3);
                break;

            case "/":
                n3 = n1 / n2;
                System.out.println("O resultado da divisão entre os numeros digitados é: " + n3);
                break;
            
            default:
                break;
        }
    }
}
