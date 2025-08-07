def is_bissexto(ano: int) -> bool:
  return (ano%4==0) or (ano%100==0 and ano%400==0)

# True
print("Testes de anos bissextos: ")
print(is_bissexto(1912))
print(is_bissexto(1992))
print(is_bissexto(1996))
print(is_bissexto(2000))
print(is_bissexto(2004))
print(is_bissexto(2008))
print(is_bissexto(2012))
print(is_bissexto(2016))
print(is_bissexto(2020))
print(is_bissexto(2024))
print()

# False
print("Teste de anos não-bissextos: ")
print(is_bissexto(1))
print(is_bissexto(2))
print(is_bissexto(3))
print(is_bissexto(2023))
print(is_bissexto(2025))
print(is_bissexto(2026))
print(is_bissexto(2027))
print(is_bissexto(2029))