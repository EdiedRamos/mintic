import csv
import requests
import pandas as pd

def analizarDatos(url, porc):
  counter = {
    8000 : 0,
    10000 : 0,
    12000 : 0,
    15000 : 0
  }
  with requests.Session() as s:
    dw = s.get(url)
    cnt = dw.content.decode('utf-8')
    data = list(csv.reader(cnt.splitlines(), delimiter = ','))
    for x in data:
      xxx = x[0].split(';')
      if xxx[1] == 'PRECIO': continue
      counter[int(xxx[1])] += 1
    result = {
      'Precio seleccionado' : 0,
      'Veces seleccionado' : 0,
      'proyección' : 0
    }
    for x in counter.keys():
      if counter[x] > result['Veces seleccionado']:
        result['Veces seleccionado'] = counter[x]
        result['Precio seleccionado'] = x
    result['proyección'] = result['Precio seleccionado'] + result['Precio seleccionado'] * porc
    return result

print(analizarDatos('https://raw.githubusercontent.com/ciaocamilo/misiontic2022/main/encuesta_chololates.csv', 0.053))