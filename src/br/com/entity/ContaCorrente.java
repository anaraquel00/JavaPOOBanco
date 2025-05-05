package br.com.entity;

public class ContaCorrente extends Conta{
	
private double chequeEspecial;
	
public ContaCorrente(Cliente cliente, double chequeEspecial) {
	        super(cliente);
	        this.chequeEspecial = chequeEspecial;
	    }

	    @Override
public void imprimirExtrato() {
	        System.out.println("=== Extrato Conta Corrente ===");
	        super.imprimirInfosComuns();
	        System.out.println(String.format("Cheque Especial: %.2f", this.chequeEspecial));
	    }

	    
	    public void sacar(double valor) {
	        if (valor <= (getSaldo() + chequeEspecial)) {
	            setSaldo(getSaldo() - valor);
	        } else {
	            System.out.println("Saldo insuficiente!");
	        }
	    }
	    
public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}
public void sacar() {
	
}
public void depositar() {
	
}
public void transferir() {
	
}
public double getChequeEspecial() {
	return chequeEspecial;
}
public void setChequeEspecial(double chequeEspecial) {
	this.chequeEspecial = chequeEspecial;
}

@Override
public void depositar(double valor) {
	// TODO Auto-generated method stub
	
}

@Override
public void transferir(double valor, IConta contaDestino) {
	// TODO Auto-generated method stub
	
}
}
