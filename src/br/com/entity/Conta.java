package br.com.entity;

public abstract class Conta implements IConta{
	
	protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
	
	private int NumAgencia;
	private int NumConta;
	private double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.NumAgencia = AGENCIA_PADRAO;
        this.NumConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

	public int getNumAgencia() {
		return NumAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		NumAgencia = numAgencia;
	}
	public int getNumConta() {
		return NumConta;
	}
	public void setNumConta(int numConta) {
		NumConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void sacar() {
		
	}
	public void depositar() {
		
	}
	public void transferir() {
		
	}
	  protected void imprimirInfosComuns() {
	        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
	        System.out.println(String.format("Agência: %d", this.NumAgencia));
	        System.out.println(String.format("Número: %d", this.NumConta));
	        System.out.println(String.format("Saldo: %.2f", this.saldo));
	    }

	
	public void sacar(Double valor) {
		// TODO Auto-generated method stub
		
	}
	public void depositar(Double valor) {
		// TODO Auto-generated method stub
		
	}
	public void transferir(Double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return cliente;
	}
}
