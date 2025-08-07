## 🧠 O que são `java` e `javac`?

Eles são **comandos usados no terminal** (ou prompt de comando) e fazem **funções diferentes**:

| Comando | O que faz                    | Quando usar                                      |
| ------- | ---------------------------- | ------------------------------------------------ |
| `javac` | **Compila** código Java      | Quando você quer transformar `.java` em `.class` |
| `java`  | **Executa** código compilado | Quando você quer rodar o `.class`                |

---

## ⚙️ Explicando passo a passo:

### 📌 1. O comando `javac` (Java Compiler)

* É o **compilador** do Java.
* Transforma seu código `.java` (legível para humanos) em `.class` (bytecode).
* Esse bytecode pode ser entendido pela JVM (Java Virtual Machine).

🧪 Exemplo:

Arquivo: `OlaVictor.java`

```java
public class OlaVictor {
    public static void main(String[] args) {
        System.out.println("Olá, Victor!");
    }
}
```

No terminal:

```bash
javac OlaVictor.java
```

Isso cria um novo arquivo chamado:

```
OlaVictor.class
```

---

### 📌 2. O comando `java` (Java Runtime)

* **Executa** o programa que já foi compilado.
* Roda o arquivo `.class` usando a JVM.

No terminal:

```bash
java OlaVictor
```

Saída:

```
Olá, Victor!
```

🔎 Note que **não usamos `.class` no comando**, apenas o **nome da classe**.

---

## 🔄 Resumo da ordem de uso

1. Escreve o código em `.java`
2. Compila com `javac`
3. Executa com `java`

```bash
javac Programa.java   // Compila
java Programa         // Executa
```

---

## 📌 Resumo das diferenças entre `javac` e `java`

| Comparação   | `javac`                  | `java`                        |
| ------------ | ------------------------ | ----------------------------- |
| Significa    | Java Compiler            | Java Virtual Machine launcher |
| Função       | Compilar                 | Executar                      |
| Entrada      | Arquivo `.java`          | Arquivo `.class`              |
| Saída        | Gera `.class` (bytecode) | Roda o programa               |
| Erros comuns | Sintaxe, compilação      | Erros de execução             |
| Quando usar  | Antes de executar        | Depois de compilar            |

---

## 🎯 Desafios para praticar

### 🔹 Desafio 1: Escreva, compile e execute um programa simples

1. Crie o arquivo `Mensagem.java` com este conteúdo:

```java
public class Mensagem {
    public static void main(String[] args) {
        System.out.println("Você está aprendendo Java com sucesso!");
    }
}
```

2. Compile com:

```bash
javac Mensagem.java
```

3. Execute com:

```bash
java Mensagem
```

✅ O terminal deve mostrar a frase corretamente.

---

### 🔹 Desafio 2: Teste erro de compilação e execução

1. Crie o arquivo `ErroTeste.java` com erro proposital:

```java
public class ErroTeste {
    public static void main(String[] args) {
        System.out.println("Faltou fechar aspas);
    }
}
```

2. Tente compilar com:

```bash
javac ErroTeste.java
```

3. O terminal mostrará um **erro de compilação**.

Agora corrija o erro e repita:

```java
System.out.println("Faltou fechar aspas");
```

✅ Depois, compile e execute novamente com `java ErroTeste`.

