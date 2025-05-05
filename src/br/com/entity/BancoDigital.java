package br.com.entity;

public class BancoDigital {
    public static void main(String[] args) {
        Banco banco = new Banco("DIO Bank");
        
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");
        
        Conta cc = new ContaCorrente(cliente1, 1000);
        Conta cp = new ContaPoupanca(cliente2, 0.005);
        
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        
        cc.depositar(1000);
        cc.transferir(500, cp);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        
        banco.listarClientes();
    }
}