from functools import reduce

def generarResultados(datos):
  prom = 0
  for i in range(len(datos)):
    datos[i] = list(map(lambda x : x if x > 2 else 3, datos[i]))
    datos[i] = reduce(lambda x, y : x + y, datos[i])
    prom += datos[i]
  pos = {datos[0] : 1, datos[1] : 2, datos[2] : 3}
  prom /= 9
  dicc = {
    'puntaje promedio' : round(prom, 2),
    'puntaje participante 1' : datos[0],
    'puntaje participante 2' : datos[1],
    'puntaje participante 3' : datos[2],
    'participante ganador' : pos[reduce(lambda x, y : x if x > y else y, datos)]
  }
  return dicc


print(generarResultados([[2, 5, 4], [7, 6, 5], [9, 7, 5]]))