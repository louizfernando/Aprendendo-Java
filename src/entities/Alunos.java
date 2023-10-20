package entities;

public class Alunos {
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	public String nome;
	
	public double notaFinal() {
		return trimestre1 + trimestre2 + trimestre3;
	}
	
	public String toString() {
		return "NOTA FINAL: "
			+ notaFinal();
	}
	
	public double falta() {
		if (notaFinal() < 60) {
			return 60 - notaFinal();
		} else {
			return 0;
		}
	}
	
	
}
