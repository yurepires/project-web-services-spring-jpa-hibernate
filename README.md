# Projeto Web Services com Spring Boot e JPA / Hibernate

## Descrição

Este é um projeto back-end para um serviço de pedidos, utilizando as camadas **resources**, **services** e **repositories**. O projeto foi desenvolvido com **Spring Boot** e integra-se com um banco de dados para persistência das informações.

### Modelo de Domínio

O sistema gerencia as seguintes entidades:

- **User**: Representa um cliente, contendo nome, e-mail, telefone e senha.
- **Order**: Pedido feito por um cliente, contendo data e status do pedido.
- **OrderItem**: Item de um pedido, contendo quantidade, preço e subtotal calculado.
- **Payment**: Representa o pagamento de um pedido, contendo data do pagamento.
- **Product**: Produto disponível no sistema, com nome, descrição, preço e imagem.
- **Category**: Categoria de produtos.
- **OrderStatus** (enum): Define o status do pedido (WAITING\_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).

## Tecnologias Utilizadas

- **Spring Boot**
- **Tomcat**
- **Maven**
- **Banco de Dados H2** (para testes)
- **Postman** (para testes de API)
- **PostgreSQL**

## Funcionalidades Principais

- **Operações CRUD** para manipulação dos dados das entidades.
- Endpoints REST para gestão de pedidos, usuários, produtos e categorias.

## Endpoints da API

### UserResource

- `GET /users` - Lista todos os usuários
- `GET /users/{id}` - Busca um usuário por ID
- `POST /users` - Adiciona um novo usuário
- `PUT /users/{id}` - Atualiza um usuário
- `DELETE /users/{id}` - Deleta um usuário

### ProductResource

- `GET /products` - Lista todos os produtos
- `GET /products/{id}` - Busca um produto por ID

### OrderResource

- `GET /orders` - Lista todos os pedidos
- `GET /orders/{id}` - Busca um pedido por ID

### CategoryResource

- `GET /categories` - Lista todas as categorias
- `GET /categories/{id}` - Busca uma categoria por ID

## Tratamento de Exceções

O projeto conta com um tratamento de erros personalizado:

- **ResourceNotFoundException**: Lançada quando um recurso não é encontrado.
- **DatabaseException**: Lançada em caso de violação de integridade (exemplo: exclusão de um usuário que possui pedidos associados).
- **StandardError**: Estrutura padrão para respostas de erro.
- **ResourceExceptionHandler**: Classe que intercepta exceções e retorna mensagens de erro padronizadas.
