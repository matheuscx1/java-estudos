# 📘 SOBRECARGA DE MÉTODOS EM JAVA

---

## 🎭 O que é?

**Sobrecarga de método** é quando você cria **vários métodos com o mesmo nome**, mas com **parâmetros diferentes** na **mesma classe**.

> É como um **camaleão**:  
> O mesmo nome de método, mas ele muda o comportamento dependendo dos **argumentos** que recebe.

---

## ⚙️ Como funciona?

Java escolhe **qual versão do método chamar** com base na **quantidade e tipo dos parâmetros**.

> Isso acontece em **tempo de compilação**, ou seja, o Java já sabe qual método vai rodar **antes do programa começar a rodar**.

---

## 🧠 Pra que serve?

- Deixa o código **mais limpo** e **intuitivo**.
- Você pode **reutilizar o mesmo nome**, sem precisar inventar nomes diferentes pra cada variação.
- É muito útil pra criar **várias versões do mesmo comportamento** com entradas diferentes.

---

## 🧪 EXEMPLO CHICLETE (SEM CÓDIGO)

Imagine um método chamado `somar`:

- `somar(int a, int b)` → soma dois inteiros
- `somar(double a, double b)` → soma dois decimais
- `somar(String a, String b)` → junta dois textos

Mesmo nome, comportamentos ajustados ao tipo de dado.

---

## 🧠 FORMULA MENTAL

> **Sobrecarga = mesmo nome, parâmetros diferentes**

---

## 🧩 Regras importantes

- Pode mudar:
    - **Número** de parâmetros
    - **Tipo** dos parâmetros
    - **Ordem** dos parâmetros
- Mas **NÃO pode mudar só o tipo de retorno**. Isso dá erro.

---

## 🧠 Frase mágica pra memorizar

> **"Sobrecarga é o mesmo nome com jeitos diferentes de usar.  
> Quem escolhe a versão certa é o Java no compilar."**

---

## 🧪 Analogia visual

> **Método é como um botão.**  
> Com a **mesma etiqueta (nome)**, mas o que ele faz depende do **que você entrega pra ele (parâmetros)**.

---

## 🧪 Situação de entrevista

Se te perguntarem:

> "O que é sobrecarga de método e por que ela existe?"

Você pode responder:

> "Sobrecarga é quando usamos o mesmo nome de método com diferentes parâmetros, pra que ele se adapte a tipos ou quantidades diferentes de entrada. Isso ajuda na legibilidade e reaproveitamento de nomes. É resolvido em tempo de compilação."

---

## ✅ Pronto pro IntelliJ?

Salva esse conteúdo como:

