# Defina a função soma_nat que recebe como
# parâmetro um número natural n e retorna a soma
# de todos os números naturais até n.
def soma_nat(num: int) -> int:
    i = 0
    r = 0
    while i != num:
        i = i+1
        r = r + i
    return r

print("Soma naturais:", soma_nat(2)) 