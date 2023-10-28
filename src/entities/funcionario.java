package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.Nivel;

public class funcionario {
	
	private String nome;
	private Nivel nivel;
	private double salario_base;
	
	private Departamento departamento;
	private List<HoraPorContrato> contratos = new ArrayList<>();
	
	public funcionario() {
	}
	
	public funcionario(String nome, Nivel nivel, double salario_base, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salario_base = salario_base;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraPorContrato> getContratos() {
		return contratos;
	}
	
	public void addContrato(HoraPorContrato contrato) {
		contratos.add(contrato);
	}
	public void removeContrato(HoraPorContrato contrato) {
		contratos.remove(contrato);
	}
	
	public double renda(int ano, int mes) {
		double soma = salario_base;
		Calendar cal = Calendar.getInstance();
		for (HoraPorContrato c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if (ano == c_ano && mes == c_mes) {
				soma += c.valor_total();
			}
		}
		return soma;
	}
}
