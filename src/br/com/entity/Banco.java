package br.com.entity;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarClientes() {
        System.out.println("=== Clientes do Banco " + nome + " ===");
        for (Conta conta : contas) {
            System.out.println(conta.getCliente().getNome());
        }
    }

    public String getNome() {
        return nome;
    }
}