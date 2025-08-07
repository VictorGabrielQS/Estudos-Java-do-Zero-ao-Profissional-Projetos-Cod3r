

## 🧠 O que são JDK e JRE?

### ☕ JDK = Java Development Kit

> **Pacote completo para programar em Java.**
> Inclui **ferramentas de desenvolvimento**, como compilador, bibliotecas, e também a JRE.

---

### ⚙️ JRE = Java Runtime Environment

> **Ambiente necessário para rodar programas em Java.**
> Inclui apenas as **ferramentas para executar** (não programar).

---

## 🧩 Analogia simples

Imagine que **Java** é como uma **cozinha**.

| Item | Comparação                | O que faz                                 |
| ---- | ------------------------- | ----------------------------------------- |
| JDK  | A cozinha completa        | Permite **preparar** e **comer** a comida |
| JRE  | Só o micro-ondas e pratos | Permite **apenas esquentar e comer**      |

---

## 🔍 Vamos entender com mais detalhes:

### ✅ JDK (Java Development Kit)

* É o **kit de desenvolvimento Java**
* Inclui:

  * **Compilador** (`javac`) → transforma código `.java` em `.class`
  * **Depurador** (debugger)
  * **JRE** embutida
* Necessário para: **criar, compilar e testar** programas Java

```bash
// Exemplo no terminal (com JDK instalado)
javac MeuPrograma.java     // Compila
java MeuPrograma           // Executa
```

---

### ✅ JRE (Java Runtime Environment)

* É o **ambiente de execução Java**
* Inclui:

  * **JVM** (Java Virtual Machine) – onde o programa roda
  * **Bibliotecas básicas**
* Necessário para: **rodar programas prontos**
* Não permite compilar código

```bash
// Com apenas a JRE
java MeuPrograma   // Funciona
javac MeuPrograma  // Erro: 'javac' não encontrado ❌
```

---

## 📌 Resumo das diferenças

| Característica        | JDK   | JRE       |
| --------------------- | ----- | --------- |
| Serve para programar? | ✅ Sim | ❌ Não     |
| Compilador (`javac`)  | ✅ Tem | ❌ Não tem |
| JVM incluída?         | ✅ Sim | ✅ Sim     |
| Rodar programas?      | ✅ Sim | ✅ Sim     |
| Criar programas?      | ✅ Sim | ❌ Não     |

---

## 💡 Exemplo prático:

Suponha que você escreveu um programa chamado `HelloWorld.java`:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, Victor!");
    }
}
```

### Se você tem o **JDK**:

* Você compila com: `javac HelloWorld.java`
* Depois executa com: `java HelloWorld`

### Se você só tem o **JRE**:

* Você só consegue **executar** arquivos `.class`, mas **não consegue compilar** `.java`.

---

## 🎯 Desafios para praticar

### 🔹 Desafio 1: Verificar se o JDK está instalado

1. Abra o terminal ou prompt de comando.
2. Digite: `javac -version`
3. Se funcionar, você tem o **JDK**.
   Se der erro, instale o JDK.

👉 **Extra**: Digite `java -version` para ver se a **JRE** está instalada.

---

### 🔹 Desafio 2: Testar compilação e execução

1. Crie um arquivo `Mensagem.java` com o seguinte conteúdo:

```java
public class Mensagem {
    public static void main(String[] args) {
        System.out.println("JDK funcionando corretamente!");
    }
}
```

2. Compile com `javac Mensagem.java`
3. Execute com `java Mensagem`

✅ Se funcionar, significa que seu JDK e JRE estão instalados corretamente!

