# 🧬 HERANÇA EM JAVA

## 🧠 O QUE É HERANÇA?

Herança é quando **uma classe herda de outra**.  
Ela **reaproveita atributos e métodos** da classe "mãe" (superclasse).

> 📌 Classe que herda = **filho (subclasse)**  
> 📌 Classe herdada = **pai (superclasse)**

---

## 🔎 PRA QUE SERVE?

- **Evitar repetição** de código (reutilização)
- Criar **especializações** a partir de algo mais genérico
- Seguir o princípio: **"é um tipo de"** (ex: `Cachorro` é um tipo de `Animal`)

---

## 🧠 ANALOGIA CHICLETE

> 👨‍👦 **"Filho herda características e comportamentos do pai."**
> - `Animal` tem `comer()` e `dormir()`
> - `Cachorro` herda tudo isso, mas também tem `latir()`

---

## 🛠️ COMO FUNCIONA EM JAVA?

```java
class Animal {
    void comer() {
        System.out.println("Animal comendo");
    }
}

class Cachorro extends Animal {  // HERANÇA
    void latir() {
        System.out.println("Au au");
    }
}
