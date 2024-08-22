import random

def gerar_cpf():
	return "".join([str(random.randint(0, 9)) for _ in range(9)])

def gerar_subconjunto(conjunto):
	return set(random.sample(list(conjunto), int(random.random() * 100)))


cpfs_gerados = set()

while len(cpfs_gerados) < 100:
	cpfs_gerados.add(gerar_cpf())

assistiu = {   
  "judo": gerar_subconjunto(cpfs_gerados),
  "volei_de_praia": gerar_subconjunto(cpfs_gerados),
  "ginastica": gerar_subconjunto(cpfs_gerados),
  "surf": gerar_subconjunto(cpfs_gerados)
}

probabilidades = {
	"judo_ou_surfe": 0,
	"ao_menos_dois_esportes": 0,
	"todos_esportes": 0,
	"nenhum_esporte": 0
}

def ao_menos_dois_esportes():
  pessoas_ao_menos_dois = set()

  for cpf in cpfs_gerados:
    esportes_assistidos = {
      cpf in assistiu["judo"],
      cpf in assistiu["volei_de_praia"],
      cpf in assistiu["ginastica"],
      cpf in assistiu["surf"]
    }

    if sum(esportes_assistidos) >= 2:
      pessoas_ao_menos_dois.add(cpf)
  
  return pessoas_ao_menos_dois

def calc_probabilidades() -> dict[str, float]:
  probabilidades["judo_ou_surfe"] = len(assistiu["judo"] | assistiu["surf"]) / len(cpfs_gerados)
  probabilidades["ao_menos_dois_esportes"] = len(ao_menos_dois_esportes()) / len(cpfs_gerados)
  probabilidades["todos_esportes"] = len(assistiu["judo"] & assistiu["volei_de_praia"] & assistiu["ginastica"] & assistiu["urf"]) / len(cpfs_gerados)
  probabilidades["nenhum_esporte"] = len(cpfs_gerados - assistiu["judo"] - assistiu["volei_de_praia"] - assistiu["ginastica"] - assistiu["surf"])
	
  return probabilidades

probabilidades = calc_probabilidades()

print(f"Total de pessoas pesquisadas: {len(cpfs_gerados)}")
print(f"Probabilidade de que uma pessoa sorteada aleatoriamente tenha assistido Judô ou Surfe: {probabilidades['judo_ou_surfe']}")
print(f"Probabilidade de que uma pessoa sorteada aleatoriamente tenha assistido pelo menos dois esportes: {probabilidades['ao_menos_dois_esportes']}")
print(f"Probabilidade de que uma pessoa sorteada aleatoriamente tenha assistido todos os esportes: {probabilidades['todos_esportes']}")
print(f"Probabilidade de que uma pessoa sorteada aleatoriamente não tenha assistido nenhum esporte: {probabilidades['nenhum_esporte']}")

