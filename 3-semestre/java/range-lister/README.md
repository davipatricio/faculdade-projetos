# Atividade Parcial 02

Matéria: **Algoritmos e Estrutura de Dados**

Professor: **Odair Gabriel**

Aluno: **Davi Patricio Gimenes** (2401557)

Turma: **CC 3A / manhã**

Classroom: [aqui](https://classroom.google.com/c/NzQ3NTY3NjY0MTgz/a/Njk4OTg2MDk5NDk2/details)

---

## 1. Qual tipo de algoritmo?
É um algoritmo que gera um intervalo numérico. Ele cria uma lista numérica sequencial entre dois limites (lower e upper).

## 2. O que ele faz?
O algortimo gera um intervalo de números inteiros entre dois valores, `min` e `max`.
O método `makeRange` primeiro cria um array vazio com tamanho predefinido, baseado na diferença entre `max` e `min`.
Em seguida, em cada iteração do laço, o valor de min é **incrementado e adicionado ao array**, preenchendo-o com os números no intervalo.

Ao executar o código, onde min é 1 e max é 10, o array resultante é impresso no console, asaída do programa é:

```
The array: [ 1 2 3 4 5 6 7 8 9 10 ]
```

---

## 3. Estrutura algoritmo (pseudo-código)

O pesudo-código está disponível [aqui](pseudo-codigo.md).

## 4. Refatore o código

O código refatorado está disponível [aqui](src/main/java/org/example/RefactoredRangeLister.java)