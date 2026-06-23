# AmareloBank

O **AmareloBank** é um projeto desenvolvido em **Java** para simular um sistema simples de gerenciamento de clientes bancários pelo terminal.

A aplicação permite cadastrar, consultar, atualizar, remover e listar informações de clientes, utilizando conceitos de **estrutura de dados** para organizar os registros de forma eficiente.

## Objetivo do projeto

O objetivo principal do projeto é aplicar, na prática, o uso de uma **Árvore Binária de Pesquisa** como algoritmo de estrutura de dados para armazenar e manipular clientes.

Cada cliente possui informações como:

- Nome
- CPF
- Idade
- Sexo
- Saldo inicial

## Estrutura de dados utilizada

Este projeto utiliza uma **Árvore Binária de Pesquisa**, também conhecida como **Binary Search Tree (BST)**.

Na árvore binária de pesquisa, cada nó armazena um cliente e possui até dois filhos:

- O filho da esquerda guarda clientes com nome menor em ordem alfabética.
- O filho da direita guarda clientes com nome maior em ordem alfabética.

No AmareloBank, a árvore é organizada pelo **nome do cliente**, permitindo realizar operações como inserção, busca, consulta e remoção seguindo a lógica da árvore binária.

## Funcionalidades

O sistema possui as seguintes funcionalidades:

- Cadastro de novos clientes
- Consulta de dados pessoais de um cliente
- Contagem de clientes por sexo
- Listagem de clientes por faixa etária
- Exibição do cliente mais jovem e do cliente mais velho
- Exclusão de cliente
- Atualização de dados do cliente
- Controle simples de acesso por número e senha

## Classes principais

- `Cliente.java`: representa os dados de um cliente.
- `No.java`: representa um nó da árvore binária.
- `ArvoreBinariaPesquisa.java`: implementa a árvore binária de pesquisa e suas operações.
- `Menu.java`: contém o menu principal e a interação com o usuário.

## Como executar

Compile os arquivos Java dentro da pasta `src` e execute a classe `Menu`.

```bash
javac src/*.java
java -cp src Menu
```

## Integrantes

- Nichole Nicolini
- Dyone Andrade
- Nicolas Lima
