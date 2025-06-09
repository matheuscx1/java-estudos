# 🎌 ENUM EM JAVA

## 🧠 O QUE É UM ENUM?

`enum` (abreviação de "enumeration") é um tipo **especial de classe** que representa **um conjunto fixo de constantes**.

> 📌 Exemplo clássico: dias da semana, estados de um pedido, níveis de acesso, etc.

---

## 🧠 ANALOGIA CHICLETE

> 🎨 "`enum` é a paleta de opções disponíveis — e **só elas** são válidas."
> - Ex: Um `enum Dia` com `SEGUNDA`, `TERÇA`, etc.
> - Você **não pode criar 'Feriado' do nada**.

---

## 🧪 EXEMPLO BÁSICO

```java
enum Dia {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA
}
