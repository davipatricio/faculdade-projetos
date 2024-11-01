import random
import time
import matplotlib.pyplot as plt

def gerar_lista(min: int, max: int) -> list[int]:
  return [random.randint(min, max) for _ in range(2000)]

## Algoritmos

# Quicksort
def quicksort(lista: list[int]):
    if len(lista) <= 1:
        return lista
    else:
        pivo = lista[0]
        esquerda = [x for x in lista[1:] if x < pivo]
        direita = [x for x in lista[1:] if x >= pivo]
        return quicksort(esquerda) + [pivo] + quicksort(direita)

# Bubblesort
def bubblesort(lista: list[int]):
    n = len(lista)
    for i in range(n):
        for j in range(0, n-i-1):
            if lista[j] > lista[j+1]:
                lista[j], lista[j+1] = lista[j+1], lista[j]
    return lista

# Mergesort
def mergesort(lista: list[int]):
    if len(lista) <= 1:
        return lista

    meio = len(lista) // 2
    esquerda = lista[:meio]
    direita = lista[meio:]

    esquerda = mergesort(esquerda)
    direita = mergesort(direita)

    return merge(esquerda, direita)

def merge(esquerda: list[int], direita: list[int]):
    resultado = []
    i = 0
    j = 0

    while i < len(esquerda) and j < len(direita):
        if esquerda[i] < direita[j]:
            resultado.append(esquerda[i])
            i += 1
        else:
            resultado.append(direita[j])
            j += 1

    while i < len(esquerda):
        resultado.append(esquerda[i])
        i += 1

    while j < len(direita):
        resultado.append(direita[j])
        j += 1

    return resultado

# Heap sort
def heapsort(lista: list[int]):
    n = len(lista)

    # Constrói a heap máxima
    for i in range(n // 2 - 1, -1, -1):
        _heapify(lista, n, i)

    # Extrai elementos da heap um por um
    for i in range(n - 1, 0, -1):
        lista[i], lista[0] = lista[0], lista[i]  # Troca
        _heapify(lista, i, 0)

    return lista

def _heapify(lista: list[int], n: int, i: int):
    maior = i  # Inicializa o maior como raiz
    esquerda = 2 * i + 1  # Filho esquerdo
    direita = 2 * i + 2  # Filho direito

    # Verifica se o filho esquerdo é maior que a raiz
    if esquerda < n and lista[maior] < lista[esquerda]:
        maior = esquerda

    # Verifica se o filho direito é maior que o maior até agora
    if direita < n and lista[maior] < lista[direita]:
        maior = direita

    # Modifica a raiz se necessário
    if maior != i:
        lista[i], lista[maior] = lista[maior], lista[i]
        _heapify(lista, n, maior)

def selection_sort(lista):
    n = len(lista)

    for i in range(n):
        # Encontra o menor elemento da lista não ordenada
        indice_menor = i
        for j in range(i + 1, n):
            if lista[j] < lista[indice_menor]:
                indice_menor = j

        # Troca o menor elemento com o primeiro elemento da lista não ordenada
        lista[i], lista[indice_menor] = lista[indice_menor], lista[i]

    return lista

def insertion_sort(lista):
    n = len(lista)

    for i in range(1, n):
        elemento_chave = lista[i]
        j = i - 1

        # Desloca os elementos maiores que o elemento-chave para a direita
        while j >= 0 and elemento_chave < lista[j]:
            lista[j + 1] = lista[j]
            j -= 1

        lista[j + 1] = elemento_chave

    return lista

list = gerar_lista(0, 200)

# mapeados por <nome algoritmo, tempo em ms>
resultados: dict[str,int] = {}

## Resultados

# Quicksort
_start = time.time()
quicksort(list.copy())
_end = time.time()
resultados["quicksort"] = (_end - _start) * 1000

# Mergesort
_start = time.time()
mergesort(list.copy())
_end = time.time()
resultados["mergesort"] = (_end - _start) * 1000

# Heapsort
_start = time.time()
heapsort(list.copy())
_end = time.time()
resultados["heapsort"] = (_end - _start) * 1000

# Bubblesort
_start = time.time()
bubblesort(list.copy())
_end = time.time()
resultados["bubblesort"] = (_end - _start) * 1000

# Selection sort
_start = time.time()
selection_sort(list.copy())
_end = time.time()
resultados["selection_sort"] = (_end - _start) * 1000

# Insertion sort
_start = time.time()
insertion_sort(list.copy())
_end = time.time()
resultados["insertion_sort"] = (_end - _start) * 1000

# Sort padrão
_start = time.time()
list.sort()
_end = time.time()
resultados["sort"] = (_end - _start) * 1000

print(resultados)


# Gera os gráficos
plt.figure(figsize=(12, 6))

# Cria um gráfico de barras para os tempos de execução
keys = resultados.keys()
values = resultados.values()
plt.bar(keys, values)
plt.title("Tempos de Execução dos Algoritmos de Ordenação")
plt.xlabel("Algoritmo")
plt.ylabel("Tempo (ms)")
plt.xticks(rotation=90)
plt.tight_layout()
plt.show()