# GTA VI

## Sobre o Projeto

O **GTA VI** é um projeto de desenvolvimento de software construído utilizando Java e o framework Spring Boot. Sua estrutura utiliza tecnologias voltadas para o desenvolvimento de aplicações web, integração com bancos de dados relacionais e organização da camada de persistência.

O projeto utiliza ferramentas e tecnologias do ecossistema Java, explorando conceitos de desenvolvimento back-end, persistência de dados e gerenciamento de dependências.

## Tecnologias Utilizadas

| Tecnologia | Descrição |
|---|---|
| Java 25 | Linguagem de programação utilizada no desenvolvimento. |
| Spring Boot 4.1.2 | Framework utilizado para estruturar e configurar a aplicação. |
| Spring Data JPA | Facilita a comunicação entre a aplicação Java e o banco de dados. |
| Spring Web MVC | Permite o desenvolvimento de aplicações e serviços web. |
| MySQL | Sistema gerenciador de banco de dados relacional. |
| Maven | Ferramenta responsável pelo gerenciamento de dependências e construção do projeto. |
| MySQL Connector/J | Driver responsável pela comunicação entre Java e MySQL. |

## Dependências

O projeto utiliza as seguintes dependências principais:

### Spring Boot Data JPA

Responsável por facilitar o gerenciamento da persistência de dados, permitindo trabalhar com entidades Java e operações no banco de dados por meio do JPA.

### Spring Boot Web MVC

Disponibiliza recursos para desenvolver aplicações web, incluindo a criação de controladores e o tratamento de requisições HTTP.

### MySQL Connector/J

Driver JDBC utilizado para estabelecer a comunicação entre a aplicação Java e o banco de dados MySQL.

### Dependências de Testes

O projeto também possui dependências específicas para testes relacionados às funcionalidades de persistência e aplicações web.

## Pré-requisitos

Para executar o projeto, é necessário possuir:

- Java Development Kit (JDK) 25 ou compatível com a configuração do projeto.
- Banco de dados MySQL.
- Git instalado.
- IDE de desenvolvimento Java, como IntelliJ IDEA, Eclipse ou Visual Studio Code.

O Maven Wrapper já está incluído no repositório.

## Como Executar o Projeto

### 1. Clonar o Repositório

Abra o terminal e execute:

```bash
git clone https://github.com/Mirella-Bertoloti/gtaVI.git
```

### 2. Acessar a Pasta

```bash
cd gtaVI
```

### 3. Configurar o Banco de Dados

Crie um banco de dados MySQL e configure as informações de conexão no arquivo `application.properties`.

Exemplo de configuração:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gtaVI
spring.datasource.username=root
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

Ajuste as informações de conexão conforme a configuração do seu ambiente.

### 4. Executar a Aplicação

No Windows:

```bash
mvnw.cmd spring-boot:run
```

No Linux ou macOS:

```bash
./mvnw spring-boot:run
```

### 5. Acessar a Aplicação

Após iniciar o servidor, a aplicação estará disponível localmente na porta padrão do Spring Boot, caso não exista outra configuração:

```text
http://localhost:8080
```

## Gerenciamento de Dependências

Como o projeto utiliza Maven, as dependências são declaradas no arquivo `pom.xml`.

Para baixar as dependências:

```bash
mvnw.cmd dependency:resolve
```

Para compilar o projeto:

```bash
mvnw.cmd clean compile
```

Para executar os testes:

```bash
mvnw.cmd test
```

Para gerar o pacote da aplicação:

```bash
mvnw.cmd clean package
```

## Banco de Dados

A aplicação utiliza o MySQL como sistema gerenciador de banco de dados relacional.

A integração é realizada por meio do Spring Data JPA e do MySQL Connector/J, permitindo que a aplicação trabalhe com dados persistidos no banco.

As configurações de conexão devem ser definidas no arquivo `application.properties`.

## Testes

O projeto possui dependências voltadas à realização de testes automatizados.

Os testes podem ser executados utilizando o Maven:

```bash
mvnw.cmd test
```

Essa etapa permite verificar o comportamento dos componentes implementados e identificar possíveis problemas durante o desenvolvimento.

## Autora

**Mirella Bertoloti**

GitHub: [@Mirella-Bertoloti](https://github.com/Mirella-Bertoloti)

## Repositório

[github.com/Mirella-Bertoloti/gtaVI](https://github.com/Mirella-Bertoloti/gtaVI)
