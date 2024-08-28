#!/usr/bin/env python3

import random

def gerar_cpf():
  return "".join([str(random.randint(0, 9)) for _ in range(9)])

def gerar_subconjunto(conjunto: set[str]) -> set[str]:
  return set(random.sample(list(conjunto), int(random.random() * 100)))

cpfs = set(gerar_cpf() for _ in range(100))
total = len(cpfs)

publico = {
  "judo": gerar_subconjunto(cpfs),
  "volei": gerar_subconjunto(cpfs),
  "ginastica": gerar_subconjunto(cpfs),
  "surf": gerar_subconjunto(cpfs)
}

def calc_probabilidades(judo: set[str], volei: set[str], ginastica: set[str], surf: set[str]) -> dict[str, float]:
    judo_ou_surfe = judo | surf
    prob_judo_ou_surfe = len(judo_ou_surfe) / total
    
    pelo_menos_dois = (judo & volei) | (judo & ginastica) | (judo & surf) | (volei & ginastica) | (volei & surf) | (ginastica & surf)
    prob_pelo_menos_dois = len(pelo_menos_dois) / total

    todos_os_esportes = judo & volei & ginastica & surf
    prob_todos_os_esportes = len(todos_os_esportes) / total
    
    nenhum_esporte = cpfs - (judo | volei | ginastica | surf)
    prob_nenhum_esporte = len(nenhum_esporte) / total
    
    return {
        "prob_judo_ou_surfe": prob_judo_ou_surfe,
        "prob_pelo_menos_dois": prob_pelo_menos_dois,
        "prob_todos_os_esportes": prob_todos_os_esportes,
        "prob_nenhum_esporte": prob_nenhum_esporte
    }

probabilidades = calc_probabilidades(publico["judo"], publico["volei"], publico["ginastica"], publico["surf"])

print("Probabilidade de ter assistido judô ou surfe:", probabilidades["prob_judo_ou_surfe"] * 100)
print("Probabilidade de ter assistido pelo menos dois esportes:", probabilidades["prob_pelo_menos_dois"] * 100)
print("Probabilidade de ter assistido a todos os esportes:", probabilidades["prob_todos_os_esportes"] * 100)
print("Probabilidade de não ter assistido a nenhum esporte:", probabilidades["prob_nenhum_esporte"] * 100)
