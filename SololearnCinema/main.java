import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[][] seats = {
            {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
            {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
            };
            Scanner sc = new Scanner(System.in);
            
            System.out.print("linha: ");
            int linha = sc.nextInt();
            System.out.print("coluna: ");
            int coluna = sc.nextInt();

            if (seats[linha][coluna] == 0) {
                System.out.println("Free");
            } else {
                System.out.println("Sold");
            }

    }
    
}