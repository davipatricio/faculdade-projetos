def corte_toras(largura, vezes_cortar, cortes, real_por_corte):
    cortes = [0] + sorted(cortes) + [largura]
    dp = [[0] * (vezes_cortar + 2) for _ in range(vezes_cortar + 2)]

    for tamanho in range(2, vezes_cortar + 2):
        for i in range(vezes_cortar + 2 - tamanho):
            j = i + tamanho
            custo_min = float('inf')
            
            for k in range(i + 1, j):
                custo = (cortes[j] - cortes[i]) * real_por_corte + dp[i][k] + dp[k][j]
                if custo < custo_min:
                    custo_min = custo
            
            dp[i][j] = custo_min

    return dp[0][vezes_cortar + 1]
def test_corte_toras():
    # Teste 1: Caso básico com poucos cortes
    assert corte_toras(10, 2, [2, 4], 1) == 14
    # Explicação: Custo total = 10 (primeiro corte) + 4 (segundo corte) = 14

    # Teste 2: Tora sem cortes intermediários
    assert corte_toras(5, 0, [], 1) == 0
    # Explicação: Sem cortes, custo é 0

    # Teste 3: Um único corte
    assert corte_toras(8, 1, [3], 2) == 16
    # Explicação: Custo = 8 * 2 = 16

    # Teste 4: Múltiplos cortes com custo diferente
    assert corte_toras(20, 3, [5, 10, 15], 3) == 120
    # Explicação: Custo total = 60 (20*3) + 30 (10*3) + 30 (10*3) = 120

    # Teste 5: Caso com todos os cortes no início
    assert corte_toras(15, 3, [1, 2, 3], 1) == 20
    # Explicação: Custo total = 15 + 2 + 1 = 20

    print("Todos os testes passaram!")

# Executar os testes
test_corte_toras()