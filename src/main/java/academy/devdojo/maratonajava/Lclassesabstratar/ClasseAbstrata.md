# 🧱 CLASSES ABSTRATAS EM JAVA

## 🧠 O QUE É UMA CLASSE ABSTRATA?

É uma **classe que serve de base**, mas **não pode ser instanciada**.  
Ela é usada como um **molde incompleto** — algo que só faz sentido com suas "subclasses".

> 📌 Pense como um **rascunho de algo mais específico.**

---

## 🧠 ANALOGIA CHICLETE

> 🎭 "Classe abstrata é um personagem com papel definido, mas sem rosto ainda."  
> Ex:
> - `Animal` é uma ideia — você **não cria um Animal** genérico.
> - Você cria um `Cachorro`, `Gato`... que **são tipos concretos de Animal**.

---

## 🚫 NÃO PODE SER INSTANCIADA

```java
abstract class Animal {
    void dormir() {
        System.out.println("Zzz...");
    }
}
Animal a = new Animal(); // ❌ ERRO! Classe abstrata não pode ser instanciada
