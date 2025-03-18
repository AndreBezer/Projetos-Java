package nota;

import java.util.Scanner;
import CotacaoDollar.CotacaoDollar;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		CotacaoDollar converta = new CotacaoDollar();

		System.out.print("Digite a cotacao do dollar: ");
		converta.cotacao = sc.nextDouble();		
		
		System.out.print("Digite a quantidade do dollar: ");
		converta.quantidade = sc.nextDouble();		
		
		System.out.print(converta.converter());
	}

}
