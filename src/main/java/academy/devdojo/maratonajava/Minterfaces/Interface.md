# 🧩 INTERFACE EM JAVA

## 🧠 O QUE É UMA INTERFACE?

Uma **interface** é um **contrato**:
> Diz o que uma classe **deve fazer**, mas **não como**.

É um tipo especial que **só declara comportamentos** (métodos), e a classe que "assina o contrato" **é obrigada a implementar**.

---

## 🧠 ANALOGIA CHICLETE

> 📋 "Interface é a lista de tarefas.  
> A classe é quem vai arregaçar as mangas e fazer."

---

## 🔑 CARACTERÍSTICAS

- Só tem **métodos abstratos por padrão** (sem corpo)
- A partir do Java 8, pode ter `default` e `static` methods
- Pode ter **constantes públicas** (`public static final`)
- Classes implementam com `implements`

---

## 🧪 EXEMPLO CHICLETE

```java
interface Animal {
    void fazerSom();
}

class Gato implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("Miau");
    }
}
