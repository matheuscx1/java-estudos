# 🧩 Wrapper Classes em Java

## O que são?

As **Wrapper Classes** (classes empacotadoras) são classes em Java que **encapsulam (envolvem) tipos primitivos** em objetos.  
Elas permitem que os tipos primitivos sejam usados como objetos — o que é necessário em várias situações, como trabalhar com coleções (`ArrayList`, `HashMap`, etc.).

---

## 🌟 Por que usar wrappers?

- Tipos primitivos (`int`, `double`, `char`, etc.) **não são objetos**.
- Alguns recursos do Java (como **Collections**, **Generics**, **Streams**) só funcionam com objetos.
- Wrappers permitem **converter tipos primitivos para objetos** e vice-versa.

---

## ✅ Tabela: Tipos Primitivos vs Wrappers

| Tipo Primitivo | Classe Wrapper |
|----------------|----------------|
| `byte`         | `Byte`         |
| `short`        | `Short`        |
| `int`          | `Integer`      |
| `long`         | `Long`         |
| `float`        | `Float`        |
| `double`       | `Double`       |
| `char`         | `Character`    |
| `boolean`      | `Boolean`      |

---

## 🔄 Autoboxing e Unboxing

Desde o Java 5, o compilador faz a conversão **automática** entre primitivos e wrappers:

### Autoboxing
Converte um tipo primitivo → objeto wrapper:
```java
int numero = 10;
Integer obj = numero; // autoboxing