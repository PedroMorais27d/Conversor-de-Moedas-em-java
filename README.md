# Conversor de Moedas em Java

Este é um projeto em Java para conversão de moedas utilizando a API pública [ExchangeRate-API](https://www.exchangerate-api.com/). Ele permite ao usuário selecionar pares de moedas e realizar a conversão diretamente pelo terminal.

---

## Funcionalidades

- Conversão entre:
  - Dólar (USD) ↔ Real (BRL)
  - Dólar (USD) ↔ Peso Argentino (ARS)
  - Dólar (USD) ↔ Peso Colombiano (COP)
- Leitura de valores com validação.
- Menu interativo via console.
- Requisições HTTP usando a API moderna `HttpClient` (Java 11+).
- Parsing de JSON com a biblioteca **Gson**.

---

## Requisitos

- Java 11 ou superior
- Biblioteca [Gson](https://github.com/google/gson) adicionada ao classpath
