package entities;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
	
	public String toString() {
		return "Area: "
			+ String.format("%.2f", area())
			+ " / Perimetro: "
			+ String.format("%.2f", perimetro())
			+ " / Diagonal: "
			+ String.format("%.2f", diagonal());
	}
}
