# ⚠️ EXCEÇÕES (EXCEPTIONS) EM JAVA

## 🧠 O QUE SÃO EXCEÇÕES?

Exceções são **problemas que aparecem enquanto o programa está rodando** — erros, situações inesperadas que quebram o fluxo normal.

> Exemplo: tentar abrir um arquivo que não existe, dividir por zero, acessar um índice inválido.

---

## 🧠 ANALOGIA CHICLETE

> 🚨 "Exceção é o alarme disparando quando algo sai errado."  
> O programa pode **tentar resolver o problema** ou **parar** com mensagem de erro.

---

## 🧪 COMO FUNCIONAM?

Java usa um modelo de **try-catch-finally** para lidar com exceções:

```java
try {
    // Código que pode causar erro
} catch (ExceptionTipo e) {
    // O que fazer se der erro
} finally {
    // Código que sempre executa, erro ou não
}
