package entidades;

public class Conta {
	private String numero;
	private double saldo;

	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo = valor;
	}
	
	public double sacar(double valor) {
		if(saldo >= valor){
			saldo -= valor;
			return valor;
		}
		return 0;
	}
	
	public void atualizar(double percentual) {
		saldo += (saldo / 100) * percentual;
	}


}
