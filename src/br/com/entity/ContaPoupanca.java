package br.com.entity;

public class ContaPoupanca extends Conta{

private double rendimento;	

public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

public ContaPoupanca(Cliente cliente, double rendimento) {
    super(cliente);
    this.rendimento = rendimento;
}

public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupança ===");
    super.imprimirInfosComuns();
    System.out.println(String.format("Taxa Rendimento: %.2f%%", this.rendimento * 100));
}

public double getRendimento() {
	return rendimento;
}

public void setRendimento(double rendimento) {
	this.rendimento = rendimento;
}

public void sacar() {
	
}
public void depositar() {
	
}
public void transferir() {
	
}

@Override
public void sacar(double valor) {
	// TODO Auto-generated method stub
	
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
