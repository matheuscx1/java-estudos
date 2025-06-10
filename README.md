# 💡 Conceitos Básicos Java — O Que Você Precisa Grudar na Cabeça

---

## 🧱 Objetos
São as “coisas” do seu programa. Tipo: um `Estudante` é um objeto.  
Cada objeto tem suas características chamadas **atributos** — nome, idade, sexo, etc.

> **Frase mágica:**  
> “Objeto é coisa, e coisa tem jeito.”

---

## 🎬 Métodos
São as “ações” que um objeto pode fazer.  
Exemplo: o método `imprime()` pega os dados do Estudante e mostra pra gente.

> **Fica fácil assim:**  
> “Método é o que o objeto faz.”

---

## 🎯 Parâmetros
São as “informações extras” que você passa para um método funcionar direito.  
Tipo passar o próprio objeto Estudante para o método `imprime(Estudante e)`.

---

## 🔗 Passagem por referência
Quando você manda um objeto para um método, **não é cópia**, é o endereço dele na memória.  
Ou seja, o método mexe no objeto original.

> **Resumo:**  
> “Passar objeto é dar o endereço, não um clone.”

---

## ✍️ Método toString()
Tá em toda classe Java, porque vem da classe `Object` (supermãe de todas).  
Ele cria uma **descrição em texto** do objeto, útil pra imprimir ou debugar.

> **Decore assim:**  
> “toString() vira a voz do objeto.”

---

## ⚙️ Como o código Java vira programa?

1. Você escreve seu código no arquivo `.java` (ex: `HelloWorld.java`).

2. Usa o compilador `javac` pra transformar em **bytecode**, código intermediário que a máquina entende (arquivo `.class`).

3. A JVM verifica o bytecode pra evitar código malicioso ou errado.

4. A JVM **roda o programa**: ela interpreta ou transforma o bytecode em código da máquina com o tal do JIT (Just In Time Compiler).

> **Resumo da ópera:**  
> “Java escreve uma vez, roda em qualquer lugar.”

---

## ❓ Pergunta: O que é uma String em Java e por que ela é um objeto?

String é uma classe que **guarda um monte de caracteres** e tem um monte de métodos legais pra trabalhar com texto, tipo comparar, juntar ou buscar.

> **Pra grudar na mente:**  
> “String não é só texto, é um objeto esperto.”

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

## 🎯 Dicas pra entrevista

- “Objeto é coisa com atributos.”
- “Método é ação do objeto.”
- “Passar objeto é passar endereço.”
- “toString() fala o que o objeto é.”
- “Bytecode é o código universal da JVM.”
- “JIT deixa seu programa voando na máquina.”

