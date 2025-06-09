# 🔁 SOBRESCRITA DE MÉTODOS (`@Override`) EM JAVA

## 🧠 O QUE É SOBRESCRITA?

**Sobrescrita** (override) é quando **uma subclasse reescreve** um método herdado da superclasse.

Ela **mantém a assinatura**, mas muda o **comportamento**.

---

## 🧪 PRA QUE SERVE?

- Personalizar um método herdado
- Adaptar o comportamento à classe filha
- Tornar o código mais flexível (base do **polimorfismo**)

---

## 🧠 ANALOGIA CHICLETE

> 🧬 "O pai ensina, mas o filho faz do seu jeito."  
> - Pai (Animal) ensina `falar()`,  
> - Filho (Cachorro) **fala latindo**,  
> - Filho (Gato) **fala miando**.

---

## 📌 COMO FUNCIONA?

```java
class Animal {
    void falar() {
        System.out.println("Animal fazendo som");
    }
}

class Cachorro extends Animal {
    @Override
    void falar() {
        System.out.println("Au au!");
    }
}
