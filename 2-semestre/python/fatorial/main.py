numero = 10

def calc_fatorial(n: int) -> int:
    if n == 1:
        return n

    return n*calc_fatorial(n-1)

print(calc_fatorial(numero))