package entities;

public class Conta {
	
	private int numero_conta;
	private String titular;
	private double saldo;
	
	public Conta(int numero_conta, String titular, double deposito_inicial) {
		this.numero_conta = numero_conta;
		this.titular = titular;
		this.saldo = deposito_inicial;
	}
	
	public Conta(int numero_conta, String titular) {
		this.numero_conta = numero_conta;
		this.titular = titular;
	}
	
	public int getNumero_conta() {
		return numero_conta;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public String getTitulat() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
	}
	
	public void saque(double saque) {
		this.saldo -= saque;
	}
}
