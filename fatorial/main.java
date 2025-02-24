// Para obter o resultado esperado acima do 
// numero 10 substitua "int resultdo" por "long resultado"
package ProjetosJava.fatorial;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int resultado = 1;

        System.out.print("Digite um numero: ");
        int num_user = sc.nextInt();

        for (int i = num_user; i > 0; i--){
            // enquanto i for menor ou igual o valor do usuario
            //aumente o valor de i por 1

            resultado *= i;

        }
        System.out.println(resultado);
    }
}
