**Enunciado**

O objetivo deste exercício é implementar duas abordagens para calcular a sequência de Fibonacci: uma abordagem recursiva e outra iterativa. Em seguida, você irá avaliar empiricamente a complexidade de cada algoritmo, contando o número de iterações ou chamadas realizadas durante a execução.

1. Implemente a função fibonacci\_recursivo(n), que retorna o n-ésimo número de Fibonacci usando a abordagem recursiva. A função deve também contar e retornar o número de chamadas feitas durante o cálculo.  
2. Implemente a função fibonacci\_iterativo(n), que retorna o n-ésimo número de Fibonacci usando a abordagem iterativa. A função deve também contar e retornar o número de iterações realizadas durante o cálculo.  
3. No programa principal, teste ambas as funções para valores de  n variando de 1 a 10 (ou um intervalo maior se preferir) e armazene o número de iterações/chamadas realizadas para cada valor de n em um dicionário com o seguinte formato:  
   {n: qtde de iterações/chamadas}  
4. Use a biblioteca matplotlib para plotar gráficos que representem a relação entre n e o número de iterações/chamadas para ambas as abordagens. No gráfico, o eixo x deve representar o valor de n e o eixo y deve representar o número de iterações/chamadas. Veja o exemplo de código anexado na aula 15 se necessário.  
5. Pesquise pela complexidade teórica das funções e compare os resultados obtidos. Discuta como o número de iterações ou chamadas muda à medida que n aumenta e como isso reflete na complexidade dos algoritmos.  
6. Aplique a técnica de memoização à função recursiva e analise novamente a complexidade. Discuta a respeito do resultado obtido.