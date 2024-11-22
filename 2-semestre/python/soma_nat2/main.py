class InvalidInput(Exception):
    pass

def soma_naturais(n: float | int):
    if n == 0: return 0
    return n + soma_naturais(n-1)

def soma_naturais_clean(n: int):
    return (n*(n+1))//2

if (soma_naturais_clean(10) != soma_naturais(10)):
    raise 'Soma dos números naturais não correspondem'

if (soma_naturais_clean(500) != soma_naturais(500)):
    raise 'Soma dos números naturais não correspondem'

if (soma_naturais_clean(700) != soma_naturais(700)):
    raise 'Soma dos números naturais não correspondem'

def ask_for_number():
    try:
        number = float(input('Insira um número inteiro: '))

        r = 0
        if (int(number) == number):
            r = soma_naturais(int(number))
        else:
            raise InvalidInput

        print(f'Soma dos números naturais {number}: {r}.')
    except ValueError:
        print('Por favor, insira um número inteiro valido.')
        ask_for_number()
    except InvalidInput:
        print('Por favor, não insira números decimais.')
        ask_for_number()

ask_for_number()

# quick select
# merge sort