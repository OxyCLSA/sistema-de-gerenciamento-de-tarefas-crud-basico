# Sistema de Gerenciamento de Tarefas (CRUD Básico)

Este projeto é um sistema básico de gerenciamento de tarefas, desenvolvido com **Spring Boot** e **PostgreSQL**. Ele permite criar, ler, atualizar e deletar tarefas (CRUD) por meio de uma API REST.

## Visão Geral

Este sistema oferece uma solução simples e eficaz para gerenciar suas tarefas diárias. Com uma interface RESTful intuitiva, você pode facilmente adicionar novas tarefas, acompanhar seu progresso e organizar suas atividades.

## Tecnologias Utilizadas

* **Java 21:** A linguagem de programação principal utilizada no desenvolvimento do projeto.
* **Spring Boot:** Um framework poderoso que simplifica a criação de aplicações Java, incluindo APIs RESTful.
* **Spring Data JPA:** Uma ferramenta que facilita a interação com o banco de dados, abstraindo as operações CRUD.
* **PostgreSQL:** Um sistema de gerenciamento de banco de dados relacional robusto e confiável.
* **Postman:** Uma ferramenta essencial para testar e interagir com a API REST.

## Funcionalidades

### Cadastro de Tarefas

* **Título (obrigatório):** O título da tarefa, que deve ser preenchido obrigatoriamente.
* **Descrição (opcional):** Uma descrição detalhada da tarefa, que pode ser adicionada opcionalmente.
* **Data de criação (automática):** A data em que a tarefa foi criada, que é definida automaticamente pelo sistema.
* **Status (pendente/concluída):** O status atual da tarefa, que pode ser "pendente" ou "concluída".

### Endpoints RESTful

* **`GET /tarefas`:** Lista todas as tarefas cadastradas no sistema.
* **`POST /tarefas`:** Cria uma nova tarefa com base nos dados fornecidos.
* **`PUT /tarefas/{id}`:** Atualiza uma tarefa existente, identificada pelo seu ID.
* **`DELETE /tarefas/{id}`:** Remove uma tarefa existente, identificada pelo seu ID.

### Validações

* **Título não pode ser vazio:** O sistema garante que o título da tarefa seja preenchido antes da criação.
* **Data de criação é definida automaticamente:** O usuário não precisa se preocupar em definir a data de criação, pois ela é gerenciada pelo sistema.

## Como Executar o Projeto

### Pré-requisitos

1. **Java 21:** Certifique-se de ter o Java 21 instalado em sua máquina.
2. **PostgreSQL:** Instale e configure o PostgreSQL, criando um banco de dados chamado `tarefas_db`.
3. **IDE:** Utilize uma IDE de sua preferência, como IntelliJ IDEA ou Eclipse.
4. **Postman:** Instale o Postman para testar a API REST.

### Passos para Configuração

1. **Clone o repositório:** Clone o repositório do projeto para sua máquina local.
2. **Configure o banco de dados:**
    * Abra o arquivo `application.properties` e ajuste as configurações de conexão com o banco de dados, incluindo URL, nome de usuário e senha.
3. **Execute o projeto:**
    * Abra o projeto em sua IDE e execute a classe `GestaoDeTarefasApplication.java`.
4. **Teste a API:**
    * Utilize o Postman para enviar requisições aos endpoints da API e testar as funcionalidades do sistema.

## Endpoints da API

### Listar Todas as Tarefas

* **Método:** `GET`
* **URL:** `http://localhost:8080/tarefas`
* **Exemplo de Resposta:**

```json
[
  {
    "id": 1,
    "titulo": "Estudar Spring Boot",
    "descricao": "Aprender a criar APIs REST com Spring Boot.",
    "dataCriacao": "2024-01-15",
    "concluida": false
  }
]
```

### Criar uma Tarefa

* **Método:** `POST`
* **URL:** `http://localhost:8080/tarefas`
* **Corpo da Requisição:**

```json
{
  "titulo": "Fazer compras",
  "descricao": "Comprar itens essenciais no supermercado.",
  "concluida": false
}
```

### Atualizar uma Tarefa

* **Método:** `PUT`
* **URL:** `http://localhost:8080/tarefas/{id}`
* **Corpo da Requisição:**

```json
{
  "titulo": "Fazer compras",
  "descricao": "Comprar itens essenciais no supermercado.",
  "concluida": true
}
```

### Deletar uma Tarefa

* **Método:** `DELETE`
* **URL:** `http://localhost:8080/tarefas/{id}`

## Exemplos de Tarefas

O sistema pode ser utilizado para gerenciar diversas tarefas, como:

1. Estudar Spring Boot
2. Fazer compras
3. Reunião com a equipe
4. Praticar exercícios físicos
5. Ler um livro
6. Preparar apresentação
7. Organizar o escritório
8. Estudar inglês
9. Planejar férias
10. Revisar código

## Consultando o Banco de Dados

Para verificar as tarefas diretamente no PostgreSQL, você pode executar a seguinte consulta SQL:

```sql
SELECT * FROM tarefa;
```

## Estrutura do Projeto

```
gestao-tarefas/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/gestao/gestaotarefas/
│   │   │       ├── controller/
│   │   │       │   └── TarefaController.java
│   │   │       ├── model/
│   │   │       │   └── Tarefa.java
│   │   │       ├── repository/
│   │   │       │   └── TarefaRepository.java
│   │   │       └── GestaoDeTarefasApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── README.md
```

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](https://www.notion.so/LICENSE) para mais detalhes.
