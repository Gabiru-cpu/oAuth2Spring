# oAuth2Spring Base

Este projeto é uma aplicação CRUD de usuários desenvolvida com Spring Boot, Spring Security 6, JWT, OAuth2 e caching usando o banco de dados NoSql Redis. Ele inclui as entidades `User`, `Role` e `Tweet`.

## Requisitos

- Java 17+
- Maven 3.8+
- Docker (para rodar o Redis)

## Tecnologias Utilizadas

- Spring Boot
- Spring Security 6
- Spring Data Redis
- Spring Data JPA
- Spring Web
- JWT (JSON Web Tokens)
- OAuth2
- Redis
- Lombok

## Como subir uma imagem Redis no Docker

`docker run --name my-redis -p 6379:6379 -d redis`

## Segurança

Este projeto usa Spring Security 6 com OAuth2 e JWT para autenticação e autorização. As rotas são protegidas e requerem um token JWT válido para acesso. O Redis é usado para caching de dados de autenticação para melhorar a performance.

## Recursos

- [Guia Spring Security 6](https://www.youtube.com/watch?v=nDst-CRKt_k)
- [Aprenda a usar cache Spring + Redis](https://www.youtube.com/watch?v=YcI9b-lgi7w)