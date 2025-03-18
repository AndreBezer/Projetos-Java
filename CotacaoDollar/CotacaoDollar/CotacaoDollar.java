package CotacaoDollar;

public class CotacaoDollar {
	public double cotacao;
	public double quantidade;
	
	public String converter() {
		return String.format("%.2f", cotacao * quantidade * 1.06);
	}
}
