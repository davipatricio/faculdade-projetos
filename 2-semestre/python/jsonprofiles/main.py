import json

profiles = {}
storage = open('./storage.json', 'r+')

try:
    profiles = json.loads(storage.read())
    storage.seek(0)
    storage.truncate()
except:
    None

def create_profile():
    name = input('Insira o nome do perfil: ')
    passwd = input('Insira a senha do perfil: ')
    passwd_confirm = input('Digite a senha novamente: ')

    if profiles.get(name) != None:
        print('Já existe um perfil com este nome. Por favor, escolha outro: ')
        create_profile()
        return

    if passwd != passwd_confirm:
        print('As senhas não são iguais. Por favor, tente novamente.')
        create_profile()
        return

    profiles[name] = {
        "password": passwd
    }

    print(f'Perfil {name} criado com sucesso!')

for _ in range(0, 2):
    create_profile()

storage.write(json.dumps(profiles))
storage.seek(0)
storage.truncate()

def change_pass():
    name = input('Insira o nome do perfil que você deseja alterar a senha: ')
    profile = profiles.get(name)
    
    if profile == None:
        print('Este perfil não existe. Tente novamente. ')
        change_pass()
        return

    passwd = input('Insira a senha do perfil: ')
    
    if profile.password != passwd:
        print('Senha incorreta. Tente novamente. ')
        change_pass()
        return
    
    
    new_pwd = input('Insira a nova senha do perfil: ')
    profiles[name]["password"] = new_pwd

storage.write(json.dumps(profiles))
storage.seek(0)
storage.truncate()
