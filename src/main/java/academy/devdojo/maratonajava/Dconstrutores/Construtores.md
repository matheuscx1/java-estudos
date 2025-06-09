# 🚧 CONSTRUTORES EM JAVA

---

## 🧱 O que é um construtor?

Um **construtor** é um método especial que **cria objetos** a partir de uma classe.

> Ele é chamado **automaticamente** quando você usa `new`.

---

## 🔨 O que ele faz?

- **Inicializa** os atributos do objeto.
- Prepara o objeto pra ser usado.
- Pode receber **parâmetros** para personalizar a criação do objeto.

---

## 🧠 Por que ele existe?

Sem construtor, o objeto **nasce vazio** ou com valores padrão.

Com construtor, você **controla como o objeto começa a vida**.

---

## 🐶 Exemplo mental (sem código)

**Classe:** `Cachorro`  
**Atributos:** `nome`, `raça`

Você quer que todo cachorro **já nasça com um nome e uma raça**.

> O construtor faz isso: recebe `nome` e `raça` como parâmetros e já preenche os dados assim que o objeto é criado.

---

## ⚠️ Regras importantes

- O construtor **tem o mesmo nome da classe**.
- Não tem **tipo de retorno** (nem mesmo `void`).
- Se você **não criar um**, o Java cria um **construtor padrão** (sem parâmetros).
- Você **pode criar vários** (isso é sobrecarga de construtores!).

---

## 🧠 Frase mágica pra memorizar

> **"Construtor constrói.  
> Dá vida ao objeto e o põe pra rodar depois."**

---

## 🧪 Analogia rápida

> Construtor é como a **sala de parto** de um objeto.  
> É lá que ele **nasce já configurado** pra começar a funcionar.

---

## 🧩 Dica bônus

Se quiser que um objeto **sempre tenha valores obrigatórios**, use um construtor com parâmetros.

Assim você **força** o desenvolvedor a fornecer as informações ao criar o objeto.



