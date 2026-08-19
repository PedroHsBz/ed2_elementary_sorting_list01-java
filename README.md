# ED2 — Sorting — Lista 01 (Java)

Exercícios de fixação de **Estrutura de Dados II** — Algoritmos de ordenação (Bubble Sort, Selection Sort, Insertion Sort) e suas variações.

> Instituto Federal do Triângulo Mineiro — Campus Patrocínio
> Curso: Tecnologia em Análise e Desenvolvimento de Sistemas — 4º Período
> Professor: Júnio Moreira
> Data: 12/08/2026 · **Entrega: 19/08/2026**

---

## 📁 Estrutura do Projeto



```
EdII/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── dev/pedro/
│   │           ├── exercises/
│   │           │   ├── Question2.java
│   │           │   ├── Question3.java
│   │           │   ├── Question4.java
│   │           │   └── Question5.java
│   │           └── sorting/
│   │               ├── BubbleSort.java
│   │               ├── InsertionSort.java
│   │               └── SelectionSort.java
│   └── test/
│       └── java/
│           └── dev/pedro/exercises/
│               └── Question1.java
└── README.md
```
## Pré-requisitos

- **JDK 8 ou superior** instalado ou equivalente.
- Verifique a instalação com:

```bash
java -version
javac -version
```

> O projeto não utiliza Maven/Gradle — a compilação é feita diretamente com `javac`, então não é necessária nenhuma dependência externa.

## Compilação

Clone o repositório e, a partir da raiz do projeto (`EdII/`), compile todo o código-fonte principal para a pasta `out`:

```bash
git clone <URL-DO-REPOSITORIO>
cd EdII

# compila as classes de dev.pedro.exercises e dev.pedro.sorting
javac -d out $(find src/main/java -name "*.java")
```

No Windows (PowerShell), use:

```powershell
Get-ChildItem -Recurse -Filter *.java src\main\java | ForEach-Object { $_.FullName } | javac -d out -encoding UTF-8 @-
```

## 📝 Exercícios

| # | Arquivo | Problema | Técnica | Complexidade |
|---|---|---|---|---|
| 1 | `Exer01_BubbleSortString.java` | Ordenar caracteres de uma string alfabeticamente | Bubble Sort | O(n²) |
| 2 | `Exer02_SelectionSortDesc.java` | Ordenar vetor em ordem decrescente | Selection Sort (variação) | O(n²) |
| 3 | `Exer03_SelectionSortKSwaps.java` | Estado do vetor após k trocas do Selection Sort | Selection Sort (simulação parcial) | O(k·n) |
| 4 | `Exer04_InsertionSortCountShifts.java` | Ordenar e contar deslocamentos no `while` | Insertion Sort (instrumentado) | O(n²) |
| 5 | `Exer05_InsertionSortDescFromEnd.java` | Ordenar decrescente construindo do fim para o início | Insertion Sort (variação) | O(n²) |

<details>
<summary><strong>Detalhes de cada exercício (entrada, saída e exemplo)</strong></summary>

### 1. Ordenação de Caracteres em String com Bubble Sort
**Entrada:** string `S` de tamanho N, composta por letras minúsculas.
**Saída:** a string com os caracteres ordenados alfabeticamente. **Deve usar estritamente Bubble Sort.**

```
Entrada          Saída
estrutura        aeerrsttu
```

### 2. Ordenação Decrescente de Vetor com Selection Sort
**Entrada:** N e o vetor `V`.
**Saída:** o vetor ordenado em ordem **decrescente**, usando a lógica do Selection Sort (selecionar o maior da sublista não ordenada a cada passo).

```
Entrada          Saída
5                5 4 3 2 1
3 1 4 5 2
```

### 3. Simulação Parcial do Selection Sort com k Trocas
**Entrada:** N, k e o vetor `A`.
**Saída:** o estado do vetor imediatamente após executar as **primeiras k trocas** do Selection Sort padrão (crescente).

```
Entrada          Saída
5 2              13 14 29 37 64
29 64 14 37 13
```

### 4. Contagem de Deslocamentos no Insertion Sort
**Entrada:** N (fixo em 10) e o vetor de 10 elementos.
**Saída:** primeira linha com o vetor ordenado crescente; segunda linha com o **total de cópias/deslocamentos** realizados dentro do `while` (`array[j+1] = array[j]`).

```
Entrada                              Saída
10                                    12 27 33 41 56 62 67 69 72 74
72 12 62 69 27 67 41 56 33 74         26
```

### 5. Insertion Sort com Sublista Ordenada no Final
**Entrada:** N e o vetor.
**Saída:** o vetor ordenado em ordem **decrescente**, construindo a sublista ordenada a partir do **final** do vetor em direção ao início (percorrendo da direita para a esquerda).

```
Entrada          Saída
6                12 9 7 5 3 1
12 7 9 1 5 3
```

</details>

---

## 🚀 Como Executar no IntelliJ IDEA

1. Abra a pasta do projeto (`File → Open`) — não é necessário Maven/Gradle, o IntelliJ reconhece `src/` como source root automaticamente (marque-a como *Sources Root* caso não seja detectada).
2. No seletor de configurações de execução (topo da janela), escolha a classe do exercício desejado (ex.: `Exer01_BubbleSortString`).
3. Clique em **Run** (▶) ou **Debug** (🐞).

---

## 💻 Como Executar pelo Terminal (sem IDE)

Caso prefira compilar manualmente com `javac`/`java` (é necessário **JDK 8+**):

```bash
javac -d out src/Exer01_BubbleSortString.java
java -cp out Exer01_BubbleSortString
```

Para compilar todos os exercícios de uma vez:

```bash
javac -d out src/*.java
java -cp out Exer01_BubbleSortString
java -cp out Exer02_SelectionSortDesc
java -cp out Exer03_SelectionSortKSwaps
java -cp out Exer04_InsertionSortCountShifts
java -cp out Exer05_InsertionSortDescFromEnd
```

Para testar o modo juiz online via terminal, redirecione um arquivo de entrada (com o `onlineJudge()` descomentado no `main`):

```bash
echo "estrutura" | java -cp out Exer01_BubbleSortString
```

---

## ⚠️ Atenção ao enunciado

- **Questão 1** exige explicitamente o uso do **Bubble Sort** — não use `Arrays.sort` ou outro algoritmo, mesmo que dê o resultado certo.
- **Questão 2** é uma *variação* do Selection Sort (busca o **maior**, não o menor) — implemente a lógica manualmente, não use `sort` com comparador decrescente.
- **Questão 3** pede o estado **intermediário** do vetor, não o vetor totalmente ordenado — cuidado para não rodar o algoritmo completo.
- **Questão 4** exige contar deslocamentos **apenas** dentro do `while` interno do Insertion Sort — não contar comparações nem outras atribuições.
- **Questão 5** constrói a sublista ordenada a partir do **fim** do vetor — a lógica de inserção é espelhada em relação ao Insertion Sort tradicional.

> **Nota:** ao simular manualmente os exemplos do enunciado, os gabaritos das Questões 1, 3 e 4 não batem com o resultado produzido pelo algoritmo exatamente como descrito no enunciado (a Questão 2 e a Questão 5 batem). Os `runExer...()` locais usam o texto do enunciado como gabarito e por isso acusam `[FALHOU]` nesses três casos — vale confirmar com o professor se o gabarito oficial (juiz online) é o mesmo do PDF antes da entrega.

---

## ✅ Pré-requisitos

- **JDK 8 ou superior** ou equivalente
- IntelliJ IDEA (recomendado) ou qualquer IDE/editor de sua preferência

Verifique a instalação com:

```bash
java -version
javac -version
```

---

## 📚 Referência

Lista de exercícios original: *Exercícios de Fixação — Estrutura de Dados II* (12/08/2026 · entrega 19/08/2026).
