def transportar_pedras(num_pedras, capacidade_caminhao):
    # Cria lista de pedras com pesos de 1 até num_pedras (1kg maior que a anterior)
    pedras = list(range(num_pedras, 0, -1))  # já vem invertida (mais pesadas primeiro) (10,9,8,7,...n)
    nova_pedras = []
    num_deslocamentos = 0

    while pedras:
        num_deslocamentos += 1
        capacidade_atual = 0

        for peso in pedras:
            if capacidade_atual + peso <= capacidade_caminhao:
                capacidade_atual += peso
            else:
                nova_pedras.append(peso)

        pedras, nova_pedras = nova_pedras, []
    
    return num_deslocamentos



def testar_transporte_pedras():
    # Teste 1: N=3, C=4 -> Deslocamentos: 2
    resultado = transportar_pedras(3, 4)
    print(f"Teste 1: N=3, C=4 -> Deslocamentos: {resultado} (Esperado: 2)")
    assert resultado == 2, "Teste 1 falhou"

    # Teste 2: N=4, C=5 -> Deslocamentos: 2
    resultado = transportar_pedras(4, 5)
    print(f"Teste 2: N=4, C=5 -> Deslocamentos: {resultado} (Esperado: 2)")
    assert resultado == 2, "Teste 2 falhou"

    # Teste 3: N=5, C=5 -> Deslocamentos: 3 (corrigido de 4 para 3)
    resultado = transportar_pedras(5, 5)
    print(f"Teste 3: N=5, C=5 -> Deslocamentos: {resultado} (Esperado: 3)")
    assert resultado == 3, "Teste 3 falhou"

    # Teste 4: N=2, C=10 -> Deslocamentos: 1
    resultado = transportar_pedras(2, 10)
    print(f"Teste 4: N=2, C=10 -> Deslocamentos: {resultado} (Esperado: 1)")
    assert resultado == 1, "Teste 4 falhou"

    # Teste 5: N=6, C=10 -> Deslocamentos: 3
    resultado = transportar_pedras(6, 10)
    print(f"Teste 5: N=6, C=10 -> Deslocamentos: {resultado} (Esperado: 3)")
    assert resultado == 3, "Teste 5 falhou"

    print("Todos os testes passaram com sucesso!")

testar_transporte_pedras()
