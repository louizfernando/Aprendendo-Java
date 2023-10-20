package entities;

public class Funcionarios {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salario() {
		return salarioBruto - imposto;
	}

	public String toString() {
		return "Funcionario(a): "
			+ nome
			+ ", $ "
			+ String.format("%.2f", salario());
	}

	public void aumento(double porcentagem) {
		this.salarioBruto = salarioBruto * (porcentagem + 100) / 100;
	}

}
