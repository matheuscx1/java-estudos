### *Olá, Mundo*

![img.png](img.png)

## Objetos: são como "coisas" no seu programa. Um "Estudante" é um objeto, e esse objeto pode ter "atributos" como nome, idade e sexo.

## Métodos: são como "ações" que essas coisas (objetos) podem fazer. O método imprime() é uma ação que pega os dados de um objeto (como o nome, idade, etc.) e os exibe.

## Parâmetros: são como "informações" que você manda para um método. No caso do imprime(), o parâmetro é um objeto Estudante que você passa para o método fazer algo com ele.

Passagem por referência: quando você "passa um objeto para um método", o método não cria uma cópia desse objeto. Ele usa
a "localização" dele na memória para acessar e modificar os dados do objeto. Isso é chamado de passagem por referência.

O método toString() em Java é uma função presente na classe Object, que é a superclasse de todas as classes em Java. Sua
função principal é retornar uma representação em formato de texto do objeto.

Qual o processo de compilação de um código Java?

O desenvolvedor escreve o código em um arquivo .java, usando a linguagem java
HelloWorld.java

Compilação
O compilador Java (javac) é usado pra transformar o código fonte em bytecode
O bytecode é armazenado em um arquivo .class
javac HelloWorld.java
Resultado: Um arquivo HelloWorld.class é gerado

Verificação de bytecode
A jvm verifica o bytecode
Essa verificação é para impedir código malicioso que possui problemas

Execução pela JVM
O interpretador Java Virtual Machine JVM executa o bytecode
java HelloWorld

A JVM interpreta ou compila dinamicamente via JIT Just In Time Compiler o bytecode para instruções nativas da maquina
O processo de compilação em Java começa com a escrita do código em arquivos .java. Esse código é compilado pelo javac,
que o transforma em bytecode — um formato intermediário armazenado em arquivos .class. Esse bytecode é então executado
pela JVM, que interpreta ou compila esse código para a linguagem de máquina da plataforma, garantindo portabilidade e
segurança.

