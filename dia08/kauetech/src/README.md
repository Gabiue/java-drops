# 🛒 KaueTech - Sistema de Gerenciamento de Estoque

Sistema simples de terminal para gerenciar o estoque de uma loja fictícia chamada **KaueTech**, especializada em eletrônicos.

---

## ✨ Funcionalidades

- 📦 Cadastrar produtos
- 📃 Listar produtos
- 🔍 Buscar por nome
- 🔄 Atualizar quantidade em estoque
- ❌ Remover produto
- 🚪 Sair do sistema

---

## 🧱 Estrutura do Projeto 
src/
├── model/          # Classe Product (entidade)
├── service/        # Lógica de negócio (ProductService)
└── view/           # Menu interativo (Main)

---

## 💡 Tecnologias utilizadas

- Java 17+ (ou superior)

- Terminal/CLI

- Organização modular por pacotes (model, service, view)

---

## 📌 Observações

- IDs dos produtos são gerados automaticamente

- O sistema não usa banco de dados nem arquivos — os dados existem apenas em memória

- Ideal para fins educativos e prática com POO + Listas em Java

## ⚙️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/kaue-tech.git
cd kaue-tech
```

2. Compile o projeto 

```bash
javac src/model/*.java src/service/*.java src/view/*.java -d bin
```

3. Execute 

```bash
java -cp bin view.Main
```


