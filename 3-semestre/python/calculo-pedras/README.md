# Estratégias para projeto de algoritmos

Matéria: **Análise e Projeto de Algoritmos**

Professor: **Odair Gabriel**

Aluno: **Davi Patricio Gimenes** (2401557)

Turma: **CC 3A / manhã**

---

Os exercícios já possuem testes embutidos, que usam o `assert` do Python.

Para executar o algoritmo de corte de toras: `python3 corte_toras.py`

Para executar o algoritmo de transporte de pedras: `python3 transporte-pedras.py`

---

## Orientações:
> Apenas as funções range() e len(), e o método .append(), podem ser usadas nas implementações;

> Demais funções e bibliotecas do Python estão proibidas;

> Execute as células com os casos de teste propostos para cada uma das funções desenvolvidas.

## Implemente uma solução para os seguintes problemas:

### Transporte de pedras:

Tomando N pedras onde cada uma tem peso 1kg maior que a anterior (pedra1=1kg, pedra2=2kg, pedra3=3kg, ..., pedraN=Nkg), determine a forma de transportá-las em um veículo com capacidade máxima de C (kg) por vez com o mínimo de deslocamentos.

A solução para este problema deve ser implementada com a estratégia gulosa.

## Corte de toras:

Considere uma tora de madeira de comprimento L (m), a qual desejamos cortá-la N vezes em posições determinadas pela lista [p1,p2,p3,...,pN]. Cada corte custa R reais por metro de tora a ser cortada, por exemplo se R=5 e L=10, o valor será R$ 50,00 independente do ponto de corte.

Determine o valor total mínimo para os N cortes.

---

A solução para este problema deve ser implementada com a estratégia de programação dinâmica.