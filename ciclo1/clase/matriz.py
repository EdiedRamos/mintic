filas = int(input("Ingrese filas: "))
columnas = int(input("Ingrese columnas: "))
matriz = []
for i in range(filas):
  matriz.append([])
  for j in range(columnas):
    dato = int(input("Ingrese el dato: "))
    matriz[i].append(dato)
for i in range(len(matriz)):
  for j in range(len(matriz[i])):
    print('[',matriz[i][j],']', sep="", end="")
  print(k)