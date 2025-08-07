

## 🧠 O que são Strings?

**`String`** é um tipo de dado em Java usado para representar **texto** (conjuntos de caracteres).

Exemplo:

```java
String nome = "Victor";
```

---

## ❗ Como comparar Strings corretamente?

Em Java, existem **duas formas de comparar Strings**:

| Comparação  | O que compara                     | Quando usar                   |
| ----------- | --------------------------------- | ----------------------------- |
| `==`        | Compara se são o **mesmo objeto** | NÃO recomendado para texto    |
| `.equals()` | Compara o **conteúdo da String**  | ✅ CORRETO para comparar texto |

---

## 🚫 Usar `==` (errado na maioria dos casos)

```java
String a = "java";
String b = "java";

System.out.println(a == b); // true (mas só porque são otimizadas na memória)
```

> Aqui funciona, mas só porque ambas apontam para o **mesmo lugar na memória** (interning).
> Isso **não é garantido** quando você cria `new String`.

```java
String a = new String("java");
String b = new String("java");

System.out.println(a == b); // false ❌ (objetos diferentes)
```

---

## ✅ Usar `.equals()` (forma correta)

```java
String a = new String("java");
String b = new String("java");

System.out.println(a.equals(b)); // true ✅
```

> Aqui ele **compara o conteúdo do texto**, não a posição na memória.

---

## 🧪 Exemplo prático

```java
public class CompararStrings {
    public static void main(String[] args) {
        String nome1 = "Victor";
        String nome2 = "Victor";
        String nome3 = new String("Victor");

        System.out.println(nome1 == nome2);        // true (mesmo local na memória)
        System.out.println(nome1 == nome3);        // false (objetos diferentes)
        System.out.println(nome1.equals(nome3));   // true ✅ (conteúdo igual)
    }
}
```

---

## 🚀 Dica extra: `.equalsIgnoreCase()`

Se você quiser comparar **sem se importar com letras maiúsculas ou minúsculas**:

```java
String nome1 = "Victor";
String nome2 = "VICTOR";

System.out.println(nome1.equalsIgnoreCase(nome2)); // true ✅
```

---

## 📌 Resumo

| Método                | Compara o quê?                                 | Usa quando?                           |
| --------------------- | ---------------------------------------------- | ------------------------------------- |
| `==`                  | Referência (posição na memória)                | Evitar ao comparar texto              |
| `.equals()`           | Conteúdo (exato)                               | ✅ Sempre que for comparar Strings     |
| `.equalsIgnoreCase()` | Conteúdo sem diferenciar maiúsculas/minúsculas | Quando for irrelevante o uso de caixa |

---

