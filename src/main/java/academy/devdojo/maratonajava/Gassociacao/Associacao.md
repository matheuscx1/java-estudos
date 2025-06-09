# 🔗 ASSOCIAÇÃO EM JAVA

## 🧠 O QUE É ASSOCIAÇÃO?

**Associação** é quando **uma classe se conecta com outra**.  
Ela mostra **como os objetos se relacionam** no mundo real.

> 📌 Exemplo:  
> Um `Professor` dá aula em uma `Turma`.  
> Uma `Turma` tem vários `Alunos`.

---

## 🔎 PRA QUE SERVE?

- Criar **relações reais** entre objetos.
- Permitir que **um objeto use outro**.
- Organizar o sistema de forma lógica e **modular**.

---

## 🧠 ANALOGIA CHICLETE

> 📚 **Classe é uma entidade. Associação é o vínculo.**  
> Como:
> - Um **médico** trabalha em um **hospital**
> - Um **carro** usa um **motor**

---

## 💡 TIPOS DE ASSOCIAÇÃO

| Tipo          | Significado                                             |
|---------------|---------------------------------------------------------|
| 👉 Simples     | Um objeto usa outro                                     |
| 👥 1 para 1     | Um objeto está ligado a exatamente um outro            |
| 👨‍👩‍👧 1 para muitos | Um objeto está ligado a **vários** outros             |
| 🔁 Bidirecional | Ambos os lados conhecem a relação (opcional em Java)   |

---

## 🧪 EXEMPLO CHICLETE

```java
class Aluno {
    String nome;
}

class Turma {
    Aluno[] alunos; // Uma turma tem vários alunos
}
