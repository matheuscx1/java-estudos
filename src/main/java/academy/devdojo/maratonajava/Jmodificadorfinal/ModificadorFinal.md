# 🔒 MODIFICADOR `final` EM JAVA

## 🧠 O QUE É `final`?

`final` em Java significa:
> **"Isso NÃO PODE SER MODIFICADO depois de definido."**

Serve pra **proteger** valores, métodos ou classes contra mudanças indesejadas.

---

## 🔎 PRA QUE SERVE?

| Onde aplica   | O que faz                                      |
|---------------|------------------------------------------------|
| Variável      | Impede que o valor mude (vira uma **constante**)  |
| Método        | Impede que o método seja **sobrescrito**        |
| Classe        | Impede que a classe seja **herdada**            |

---

## 🧠 ANALOGIA CHICLETE

> 📌 "`final` é o cadeado do Java."
> - Travou? Ninguém muda mais.
> - É como **colocar lacre de segurança** no código.

---

## 🧪 EXEMPLOS PRÁTICOS

### 1. 🔐 FINAL COM VARIÁVEIS (CONSTANTE)

```java
final int ANO = 2024;
ANO = 2025; // ❌ ERRO! Valor final não pode ser alterado
