import pandas as pd
import numpy as np

# ventas = pd.Series([15000, 25000, 20000], index = ['Enero', 'Febrero', 'Marzo'])

# print(ventas[2])
# print(ventas['Marzo'])

# dataframe

# tabla = {'Manzana' : [1, 2, 3, 4, 5], 'Pera' : [2, 3, 4, 5, 6]}

# # venta = pd.DataFrame(tabla)
# venta = pd.DataFrame(tabla, index = ['Edied', 'Jhon', 'Harold', 'Royer', 'David'])


# # print(venta.shape)
# # print(venta.values)
# # print(venta.axes)
# # print(venta.columns)

# venta.index.name = 'Clientes'
# venta.columns.name = 'Productos'

# print(venta)

# más de Series

# opciones = {'Primero' : 5, 'Segundo' : 3, 'Tercero' : 5}

# serie = pd.Series(opciones);

# print(serie)

# s = pd.Series(7, index = ['First', 'Second', 'Third'])

# print(s)


# más de DataFrame

# elementos = { 
#   "Numero atómico":[1, 6, 47, 88],
#   "Masa atómica":[1.008, 12.011, 107.87, 226],
#   "Familia":["No metal", "No metal", "Metal", "Metal"]
# }

# # tabla = pd.DataFrame(elementos)

# tabla = pd.DataFrame(elementos, index = ['H', 'C', 'Ag', 'Ra'], columns = ['Familia', 'Numero Atomico', 'Masa atomica'])

# print(tabla)

# matriz = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])

# print(matriz)

# info = pd.DataFrame(matriz, index = ['Primero', 'Segundo', 'Tercero'], columns = ['Tipo 1', 'Tipo 2', 'Tipo 3'])

# datos = {
#   'first' : [1, 2, 3],
#   'second' : [4, 5, 6],
#   'third': [7, 8, 9]
# }

# info = pd.DataFrame(datos, index = ['Primero', 'Segundo', 'Tercero'])

# print(info)

# info = pd.Series(['edied', 'es', 'un', 'crack'], ['nth(1)', 'nth(2)', 'nth(3)', 'nth(4)'])

# print(info[0:3])
# print(info['nth(1)':'nth(3)'])
# print(info['nth(3)'])
# print(info[['nth(4)', 'nth(1)']])

# info = pd.Series([10, 20, 30, 40])
# info = pd.Series([10, 20, 30, 40], index = [1, 2, 3, 4])
# print(info[[2, 3, 1, 4]])
# print(type(info[[2, 3, 1, 4]]))
# print(info.get(3))
# print(info.loc['nth(3)'])
# print(info.loc[['nth(4)', 'nth(1)']])
# print(info.loc[: 'nth(2)'])
# print(info.iloc[3])
# print(info.iloc[[3, 2, 1, 0]])
# print(info.iloc[[-1, 2, 1, 0]])
# print(info.iloc[::-1])
# print(info[[True, False, True, False]])
# print(info[info != 'edied'])
# print((info != 'edied').values)
# print(info.iloc[(info != 'edied').values])
# print(info.sample(frac = 1, replace = True, random_state = 18))

# frutas = pd.Series(['naranja', 'manzana', 'papaya', 'pera'], index = ['primero', 'segundo', 'tercero', 'cuarto'])

# print(frutas.pop('cuarto'))

# print(frutas.iloc[1])

# ahora mas de dataframe

info = pd.DataFrame({'Nombre' : ['Edied', 'Camilo', 'Alejandra', 'Andrea'], 'Edad' : [21, 20, 22, 22], 'Correo' : ['edied@xxx', 'camilo@xxx', 'aleja@ndra', 'andre@gmail']}, index = ['a', 'b', 'c', 'd'])

# print(info['Nombre']['b'])
# info['Nombre'] = ['roberto', 'maite', 'amador', 'antonio']
# info['Nombre'] = 'antonio recio' #propaga el valor por toda la columna
# print(info)

nuevo = pd.Series(['antonio recio', 'enrique pastor', 'amador rivas', 'maite figueroa', 'pollete'], index = ['b', 'a', 'c', 'f', 'd'])

# info['Nombre dos'] = nuevo
# info.Nombre = nuevo

# print(info['Nombre'].values)
# print(info.Nombre.values)
# print(info['b':'d'])
# print(info.get('Nombre'))
# print(type(info.loc['d']))
# print(info.loc['d'])
# print(type(info.loc[['a', 'c']]))
# print(info.loc[['a', 'c']])
# print(info.loc['a':'b'])
# print(info.loc['a', 'Edad'])
# print(info.loc['b':'c'])
# print(info.loc['b':])

# print(info.iloc[3, 0])

# print(info.columns.get_loc('Correo'))
# print(info.index.get_loc('a'))
# print(info.columns.get_indexer(['Nombre', 'Edad', 'Correo']))
# print(info.index.get_indexer(['d', 'c', 'a']))

# print(info.iloc[info.index.get_loc('d'), info.columns.get_loc('Nombre')])
# print(info.iloc[[0, 2], info.columns.get_indexer(['Nombre', 'Correo'])])

# seleccion = [True, False, True, True]
# print(info[seleccion])
# print(info[info['Nombre'] != 'Edied'])
# print(info.loc[info.Edad > 18])
# print(info.iloc[(info.Edad > 18).values])
# print(info[info.Edad > 18])
# print(info.loc[info.Nombre != 'Edied', ['Nombre', 'Correo']])
# print(info.iloc[(info.Nombre != 'Edied').values, info.columns.get_indexer(['Correo', 'Nombre'])])


# print(info.sample(3, replace = True))

# print(info.pop('Nombre'))
# print(info)


# print(nuevo)
# nuevo[:] = 'troll'

# numeros = pd.Series(np.arange(0, 11))

# print(numeros.where(numeros % 2 == 0))

# datos = pd.DataFrame(np.arange(25).reshape(5, 5), index = ['a', 'b', 'c', 'd', 'e'], columns = ['A', 'B', 'C', 'D', 'E'])

# print(datos.where(datos % 2 == 0, -datos))

# serie1 = pd.Series(['rojo', 'verde', 'amarillo', 'azul'], index = ['color1', 'color2', 'color3', 'color4'])
# serie2 = pd.Series(['negro', 'morado', 'magenta', 'cyan'], index = ['color1', 'color2', 'color3', 'color4'])

# # print(serie1)
# # print(serie2)

# serie3 = pd.concat([serie1, serie2])


# print(serie3)

# a = pd.Series([1, 2, 3, 4, 5,], index = ["a", "b", "c", "d", "e"])
# b = pd.Series([10, 11, 12], index = ["a", "b", "f"])

# print(a)
# print(b)
# # print(pd.concat([a, b], axis = 1, sort = True))

# c = pd.concat([a, b])

# print(c)

# print(c.index.get_loc('b'))

# append

# c = a.append(b)
# c = a.append(b, ignore_index = True)

# print(c)

df1 = pd.DataFrame(np.arange(9).reshape([3, 3]),
  index = ["a", "b", "d"],
  columns = ["A", "B", "C"])

df2 = pd.DataFrame(np.arange(12).reshape([4, 3]),
  index = ["a", "b", "c", "e"],
  columns = ["B", "C", "D"])

print(df1)
print(df2)
# print(pd.concat([df1, df2], sort = False))
# print(pd.concat([df1, df2], axis = 1, sort = False))
# print(pd.concat([df1, df2], join = "inner"))
# print(pd.concat([df1, df2], axis = 1, join = "inner"))
# print(pd.concat([df1, df2], axis = 1, join = "inner", ignore_index = True))

print(df1.append(df2, sort = False))
print(df1.append(df2))