# 🧠 Strings em Java — Gruda na Mente

## 🔤 String (imutável)
- Texto fixo.
- Toda modificação cria uma nova string.

```java
String nome = "Java";
nome = nome + " é legal"; // Novo objeto criado
```

## ➕ concat()
- Junta strings.
- Igual ao `+`.

```java
String a = "Oi, ";
String b = "mundo!";
String c = a.concat(b); // Oi, mundo!
```

## ✂️ substring()
- Recorta parte da string.
- `substring(início, fim)` → vai até **fim - 1**.

```java
String s = "Programar é bom";
String parte = s.substring(0, 9); // "Programar"
```

## 🧱 StringBuilder (mutável)
- Edita string direto (sem criar nova).
- **Rápido**, mas **não thread-safe** (evite em multi-thread).

```java
StringBuilder sb = new StringBuilder("Olá");
sb.append(" mundo!");
System.out.println(sb); // Olá mundo!
```

## 🛡️ StringBuffer (mutável + thread-safe)
- Igual ao `StringBuilder`, mas seguro pra várias threads.
- **Mais lento** que `StringBuilder`.

```java
StringBuffer sbf = new StringBuffer("Total: ");
sbf.append(100);
System.out.println(sbf); // Total: 100
```

---

## ⚖️ Resumo Rápido

| Classe         | Imutável | Rápido | Thread-Safe | Uso Ideal                  |
|----------------|----------|--------|-------------|----------------------------|
| String         | ✅       | 🟡     | ✅          | Texto fixo                 |
| StringBuilder  | ❌       | 🟢     | ❌          | Editar texto, 1 thread     |
| StringBuffer   | ❌       | 🟡     | ✅          | Editar texto, várias threads |

---

## 🧪 Teste tudo junto

```java
public class Resumo {
    public static void main(String[] args) {
        // String + concat
        String a = "Java";
        System.out.println(a.concat(" é top"));

        // substring
        System.out.println(a.substring(0, 2)); // Ja

        // StringBuilder
        StringBuilder sb = new StringBuilder("Oi");
        sb.append(" dev");
        System.out.println(sb); // Oi dev

        // StringBuffer
        StringBuffer sbf = new StringBuffer("Soma: ");
        sbf.append(50 + 50);
        System.out.println(sbf); // Soma: 100
    }
}
```

---

## 🎯 Dica de ouro

> **Use `String`** para texto fixo.  
> **Use `StringBuilder`** para performance.  
> **Use `StringBuffer`** só se tiver threads concorrendo.

