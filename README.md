# 🏦 Projeto Banco Digital - Java POO

![Java](https://img.shields.io/badge/Java-17%2B-007396?logo=java)
![POO](https://img.shields.io/badge/Orientação%20a%20Objetos-4EA94B)
![License](https://img.shields.io/badge/License-MIT-green)

## 📝 Descrição

Implementação de um sistema bancário digital em Java seguindo os princípios de Programação Orientada a Objetos (POO), demonstrando:

- Herança e polimorfismo
- Encapsulamento
- Abstração
- Boas práticas de design

## 🏗️ Estrutura do Projeto
```bash
src/
└── br/
    └── com/
        └── entity/
            ├── Banco.java         # Gerenciamento do banco
            ├── Conta.java        # Classe abstrata
            ├── ContaCorrente.java # Conta com cheque especial
            ├── ContaPoupanca.java # Conta com rendimento
            ├── IConta.java       # Interface das operações
            ├── Cliente.java      # Entidade cliente
            └── BancoDigital.java # Classe principal
```

## ✨ Funcionalidades
Tipos de Conta
Tipo	Características
Conta Corrente	Cheque especial, saques ilimitados
Conta Poupança	Rendimento mensal, operações básicas
Operações

💰 Depósitos

💸 Saques

🔄 Transferências

📊 Extratos                      

## 🚀 Como Executar
Clone o repositório:
git clone https://github.com/seu-usuario/projeto-banco.git

Compile e execute:
```bash
cd projeto-banco/src
javac br/com/entity/*.java
java br.com.entity.BancoDigital
```
## 📊 Exemplo de Saída
```plaintext
=== Extrato Conta Corrente ===
Titular: João Silva
Agência: 1
Número: 1
Saldo: R$ 500,00
Cheque Especial: R$ 1000,00
```
## 🛠️ Tecnologias
Java 17+

Paradigma OO

Princípios SOLID

Padrões de projeto

## 🔮 Roadmap
Persistência em banco de dados

Interface gráfica

Autenticação de usuários

API REST

## 🤝 Contribuição
Contribuições são bem-vindas! Siga o processo:

Fork o projeto

Crie sua branch (git checkout -b feature/nova-funcionalidade)

Commit suas mudanças (git commit -m 'Add new feature')

Push para a branch (git push origin feature/nova-funcionalidade)

Abra um Pull Request

## 📄 Licença
Distribuído sob licença MIT. Veja LICENSE para mais informações.

Desenvolvido por Ana Raquel 👨‍💻
📧 Contato: anaraquel00@gmail.com
🔗 LinkedIn: https://www.linkedin.com/in/ana-raquel-de-holanda/?locale=pt_BR

