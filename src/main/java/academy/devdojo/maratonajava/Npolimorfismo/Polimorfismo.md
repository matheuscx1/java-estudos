POLIMORFISMO

Polimorfismo é quando vc tem um método que definido em uma superclasse ou interface
e varias subclasses implementam esse método do seu proprio jeito. É como ter um botão de play, mas depende de qual aparelho vc quer, faz um comportamento diferente mesmo usando o mesmo botão

Exemplo:
Produto tem um método calcularImposto()
Computador, Carro e livro sobrescrevem esse método com sua propria implementacao
Vc chama produto.calcularimposto() e executa a versão certa baseada no objeto atual, ou seja, vc escolhe o comportamento e qual ação tomar

O que é Narrowing?
É onde vc pega um tipo maior ou mais geral e força ele a um tipo maior ou mais especifico


Widening cast(mais seguro, automatico)
Quando vc converte um tipo geral ou especifico pequeno em um tipo maior e mais geral

# 🔄 POLIMORFISMO EM JAVA

## 🧠 O QUE É POLIMORFISMO?

Polimorfismo significa:
> **“Muitas formas”**

É a capacidade de um objeto **se comportar de maneiras diferentes** dependendo do contexto, mesmo sendo do mesmo tipo.

---

## 🧠 ANALOGIA CHICLETE

> 🦸‍♂️ "O super-herói muda de roupa e poder, mas continua ele mesmo."  
> Exemplo:
> - Um `Animal` pode ser um `Cachorro` que late ou um `Gato` que mia.
> - Você chama `fazerSom()` no `Animal`, e cada um responde diferente.

---

## 🔍 TIPOS DE POLIMORFISMO EM JAVA

1. **Polimorfismo de Sobrescrita (Overriding)**
    - Subclasses mudam o comportamento dos métodos herdados.

2. **Polimorfismo de Sobrecarga (Overloading)**
    - Mesma função, diferentes assinaturas (parâmetros).

---

## 🧪 EXEMPLO PRÁTICO (SOBRESCRITA)

```java
class Animal {
    void fazerSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Au au");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau");
    }
}

void emitirSom(Animal animal) {
    animal.fazerSom(); // Polimorfismo em ação!
}
