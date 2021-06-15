import json
import requests

# para instalar requests -> pip install requests

# registro = {}
# registro['clientes'] = []

# registro['clientes'].append({
#   'nombre': 'edied',
#   'apellido' : 'ramos',
#   'edad' : 21
# })

# registro['clientes'].append({
#   'nombre' : 'enrique',
#   'apellido' : 'pastor',
#   'edad' : 60
# })

# registro['clientes'].append({
#   'nombre' : 'antonio',
#   'apellido' : 'recio',
#   'edad' : 62
# })

# -----------------------------------------------------------------
#generar un archivo json

# with open('registro.json', 'w') as file:
#   json.dump(registro, file, indent = 4)

# -----------------------------------------------------------------
#leer un archivo json

# with open('registro.json') as file:
#   data = json.load(file)
  
#   for cliente in data['clientes']:
#     for clave in cliente.keys():
#       print(clave, ':', cliente[clave])
#     print()

# -----------------------------------------------------------------
#convertir una cadena de texto con JSON en un diccionario

# rq = requests.get('http://ip-api.com/json/208.80.152.201')
# contenido = json.loads(rq.content)
# for clave in contenido.keys():
#   print(clave, '->', contenido[clave])

# -----------------------------------------------------------------
#codificacion unicode

personaje = {'nombre' : 'antonio', 'apellido' : 'récio'}

# with open('personaje.json', 'w') as file:
#   json.dump(personaje, file, indent = 4, ensure_ascii = False)

#solo ver sin guardar el archivo
# print(json.dumps(personaje, ensure_ascii = False))

# -----------------------------------------------------------------
#ordenación de json
# print(json.dumps(personaje, sort_keys = True, ensure_ascii = False))