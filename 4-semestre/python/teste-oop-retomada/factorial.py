numero = 10

def calc_fatorial(n: int) -> int:
    if n == 1:
        return n

    return n*calc_fatorial(n-1)

def calc_fatorial_while(n: int) -> int:
  num = 1

  while n>=1:
     num = num*n
     n=n-1

  return num

print(calc_fatorial(numero))
print(calc_fatorial_while(numero))