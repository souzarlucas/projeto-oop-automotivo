# Sistema Automotivo – Gestão de Estoque de Veículos

Nota: Este projeto foi desenvolvido como parte integrante da disciplina de Object Oriented Programming (Programação Orientada a Objetos) do curso de Análise e Desenvolvimento de Sistemas, com o objetivo de aplicar conceitos de POO, persistência de dados e arquitetura de APIs REST.

Um sistema simples e elegante desenvolvido em **Spring Boot** para gerenciar o estoque de veículos de uma concessionária. O projeto inclui uma interface web moderna para cadastrar e visualizar os veículos disponíveis, além de uma API REST no backend.

## 🚀 Tecnologias Utilizadas

- **Java 25**
- **Spring Boot 4** (Web, Data JPA)
- **H2 Database** (Banco de dados em memória para testes)
- **Lombok** (Redução de boilerplate de código)
- **HTML, CSS e JavaScript** (Interface de usuário moderna com animações e responsividade)

## ✨ Funcionalidades

- Listagem de veículos cadastrados em tempo real.
- Cadastro de novos veículos, vinculados a um **Modelo** e uma **Marca**.
- Preenchimento inicial automático (seed) do banco de dados com marcas e modelos para facilitar os testes.
- Interface agradável e moderna (Dark Mode nativo com cores vibrantes).

## 🛠️ Como Executar o Projeto

1. Certifique-se de ter o **Java 25** e o **Maven** instalados em sua máquina.
2. Clone ou baixe este repositório.
3. No terminal, navegue até a pasta raiz do projeto:
   ```bash
   cd caminho/para/o/projeto
   ```
4. Execute a aplicação utilizando o Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
   *(Ou execute a classe `EcommerceApplication.java` diretamente pela sua IDE favorita, como IntelliJ, Eclipse ou VS Code).*

5. Após a aplicação iniciar, abra o navegador e acesse:
   **http://localhost:8080**

## 🗄️ Estrutura do Banco de Dados

Ao iniciar, a aplicação cria e popula automaticamente as tabelas `Marca` e `Modelo` com os seguintes dados (graças ao arquivo `data.sql`):

- **Marcas:** Toyota (1), Honda (2), Ford (3)
- **Modelos:** Corolla (1 - Toyota), Civic (2 - Honda), Mustang (3 - Ford)

O banco de dados H2 fica disponível no endereço `http://localhost:8080/h2-console`. 
*(JDBC URL: `jdbc:h2:mem:testdb`, User: `sa`, Senha: em branco)*

## 🔗 Endpoints da API

- `GET /veiculos` - Retorna a lista de todos os veículos cadastrados.
- `POST /veiculos` - Cadastra um novo veículo. Exemplo de payload JSON:
  ```json
  {
    "modelo": {
      "id": 1
    },
    "cor": "Preto",
    "ano": 2023,
    "preco": 120000.00,
    "quilometragem": 0,
    "status": "Disponível"
  }
  ```

## 🤝 Contribuindo

Fique à vontade para fazer um fork deste projeto, adicionar novas funcionalidades (como CRUD completo de Marcas e Modelos) e abrir um Pull Request!

## 📄 Licença

Este projeto está sob a licença [MIT](LICENSE).