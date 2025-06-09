# 🚀 Conceitos Básicos de Java — Guia para Entrevistas

---

## 🧠 O que é Java?

Java é uma linguagem de programação orientada a objetos, **portátil**, **segura** e **robusta**, usada para criar programas que rodam em vários tipos de máquinas, graças à JVM (Java Virtual Machine).

---

## 🔑 Conceitos fundamentais

### Objetos
São "coisas" no seu programa. Exemplo: um `Estudante` é um objeto que tem **atributos** (nome, idade, sexo).

### Métodos
São as "ações" que os objetos podem fazer. Exemplo: o método `imprime()` pode exibir os dados de um Estudante.

### Parâmetros
São informações que você passa para um método, para ele saber como agir. Exemplo: o método `imprime(Estudante e)` recebe um objeto Estudante para imprimir.

### Passagem por referência
Quando um objeto é passado para um método, ele não é copiado. O método usa o endereço dele na memória, podendo modificar o objeto original.

### Método `toString()`
Todo objeto em Java herda da classe `Object` o método `toString()`, que retorna uma representação em texto do objeto (útil para exibir informações).

---

## ⚙️ Como funciona o processo de compilação em Java?

1. **Escreve-se o código** em um arquivo `.java` (ex: `HelloWorld.java`).

2. **Compilação:**  
   O compilador `javac` transforma o código fonte em **bytecode**, um código intermediário, que fica salvo em um arquivo `.class` (ex: `HelloWorld.class`).

3. **Verificação do bytecode:**  
   A JVM verifica o bytecode para impedir execução de código malicioso ou incorreto.

4. **Execução pela JVM:**  
   A JVM interpreta ou compila "just-in-time" (JIT) o bytecode para o código da máquina onde o programa está rodando, garantindo portabilidade.

---

## ❓ Perguntas comuns em entrevistas

### O que é JVM?
Java Virtual Machine — ambiente que executa o bytecode Java, traduzindo-o para o código nativo da máquina.

### O que é bytecode?
Código intermediário gerado pelo compilador Java que pode ser executado em qualquer máquina com JVM.

### Qual a diferença entre JDK, JRE e JVM?
- **JDK:** Kit de desenvolvimento Java, inclui compilador e ferramentas.
- **JRE:** Ambiente de execução Java, inclui JVM para rodar programas.
- **JVM:** Máquina virtual que interpreta e executa bytecode.

### O que é passagem por valor e por referência em Java?
- **Primitivos:** passagem por valor (copia dos dados).
- **Objetos:** passagem por referência (copia do endereço, o método acessa o objeto original).

---

## 🧠 Frases para memorizar

- **"Java escreve uma vez, roda em qualquer lugar."**
- **"Objeto é coisa, método é ação."**
- **"Bytecode é o código universal que a JVM entende."**

---

## 📁 Nome sugerido para o arquivo

