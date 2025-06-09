# ⚡ MODIFICADOR `static` EM JAVA

## 🧠 O QUE É `static`?

`static` significa: **isso pertence à classe, e não ao objeto.**

Quando algo é `static`, ele é **compartilhado por todos os objetos** daquela classe.

---

## 🧬 COMO FUNCIONA?

- Sem `static` → cada objeto tem sua **própria cópia**
- Com `static` → todos os objetos usam a **mesma cópia**

---

## 🏗️ ONDE USAMOS `static`?

| Tipo      | Exemplo                    | Significado                                     |
|-----------|----------------------------|-------------------------------------------------|
| Atributo  | `static int contador;`     | Compartilhado entre todos os objetos            |
| Método    | `static void somar()`      | Pode ser chamado sem criar objeto               |
| Bloco     | `static { ... }`           | Executa **uma vez só** quando a classe carrega  |
| Classe    | `static class Interna {}`  | Classe aninhada que não depende da instância    |

---

## 📦 EXEMPLO CHICLETE

```java
class Usuario {
    static int totalUsuarios = 0; // todos compartilham

    Usuario() {
        totalUsuarios++; // aumenta só UMA variável pra todos
    }
}
