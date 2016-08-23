package threads;

public class Conta {
	
	private double saldo; 
	private double limite;
	private int agencia; 
	private int numero;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	} 

	/*public void deposita(double valor) {
		synchronized(this) {
			this.saldo += valor;
		}
	}  or (no caso de tudo que tem no metodo ser sincrinizado) */
	
	public synchronized void deposita(double valor) {
			this.saldo += valor;
	}
}
