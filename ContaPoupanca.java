package entidades;

public class ContaPoupanca extends Conta{
	public void atualizar(double percentual) {
		super.atualizar(percentual * 3);
	}
}
