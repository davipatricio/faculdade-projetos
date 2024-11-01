from functools import lru_cache
import matplotlib.pyplot as plt

# core

def fib_recursivo(num: int, called: int):
    called = called + 1

    if num <= 1:
        return { "called": called, "n": num }

    first = fib_recursivo(num - 1, called)
    called = first['called']

    sec = fib_recursivo(num - 2, called)
    called = sec['called']

    return { "called": called, "n": first['n'] + sec['n'] }


def fib_iteracao(num: int):
    if num <= 1:
        return { "called": 1, "n": num }
    
    i = 0
    prev = 0
    prox = 1

    for _ in range(2, num + 1):
        i += 1
        next_value = prev + prox
        prev = prox
        prox = next_value
        
    return { "called": i, "n": prox }

# graficos

def test_fib_rec():
    resultados = {}
    
    for n in range(1, 11):
        resultado = fib_recursivo(n, 0)
        resultados[n] = resultado['called']

    plt.figure(figsize=(10, 6))
    plt.plot(list(resultados.keys()), list(resultados.values()), marker='o')
    plt.title("Chamadas recursivas em relação ao valor de n")
    plt.xlabel("n")
    plt.ylabel("Chamadas")
    plt.grid(True)
    plt.savefig('fib_rec.png')

    return resultados

def test_fib_iteracao():
    resultados = {}
    
    for n in range(1, 11):
        resultado = fib_iteracao(n)
        resultados[n] = resultado['called']

    plt.figure(figsize=(10, 6))
    plt.plot(list(resultados.keys()), list(resultados.values()), marker='o')
    plt.title("Chamadas iterativas em relação ao valor de n")
    plt.xlabel("n")
    plt.ylabel("Chamadas")
    plt.grid(True)
    plt.savefig('fib_iteracao.png')
    
    return resultados

test_fib_rec()
test_fib_iteracao()

# memoização

@lru_cache(maxsize=None)
def cached_fib_recursivo(num: int, called: int):
    called = called + 1

    if num <= 1:
        r= {
            "called": called,
            "n": num
        }
        return r

    first = cached_fib_recursivo(num - 1, called)
    called = first['called']

    sec = cached_fib_recursivo(num - 2, called)
    called = sec['called']

    return { "called": called, "n": first['n'] + sec['n'] }

# A função original recalcula n-1 e n-2, sem utilizar esses resultados.
# Já a função com cache reutiliza alguns resultados, reduzindo o número de chamadas.