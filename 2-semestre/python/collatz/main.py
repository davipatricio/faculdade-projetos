# Considere a função f:N→N tal que:
# Defina a função num_it que recebe como
# parâmetro um número natural n e retorna o
# número de vezes que a função f tem que ser
# aplicada recursivamente a n até se atingir o
# número 1, isto é, devolve o número k tal que:
# Obs: a polêmica conjectura de Collatz afirma que
# tal programa sempre termina.
def num_it(nat: int) -> int:
    r = 0

    # verificar se é par
    if (nat % 2) == 0:
        r = nat / 2
    else:
        r = 3 * nat + 1

    if r == 1:
        return 1
    else:
        return num_it(r)

print(num_it(10099999999999990))
