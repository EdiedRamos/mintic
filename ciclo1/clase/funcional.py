from functools import reduce

# suma = lambda a, b : a + b
# fn = lambda suma, a, b : suma(a, b)
# print(fn(suma, 10, 20))

# par = lambda n : "impar" if n & 1 else "par"
# print(par(52))

# suma = lambda *lista : sum(lista)
# print(suma(1, 3, 2, 5, 2))

# a, b = map(int, input().split())
# print(a, b)

# def generar_funcion(operador):
#   if operador == '+':
#     # def suma(a, b):
#     #   return a + b
#     # return suma
#     return lambda a, b : a + b
#   if operador == '-':
#     # def resta(a, b):
#     #   return a - b
#     # return resta
#     return lambda a, b : a - b

# print(generar_funcion('-')(10, 5))

# lista = [1, 2, 3, 4, 5]
# reduccion = map(lambda x : x % 2, lista)
# for i in reduccion:
#   print(i)

# lista = [1, 2, 3, 4, 5]
# res = reduce(lambda a, b : a + b, lista)
# print(res)

# nombre = ['Edied', 'Alejandra', 'Marcos', 'Daniela']
# apellido = ['Ramos', 'Ortiz', 'Hernandez', 'Mendoza']
# completo = zip(nombre, apellido)
# print(list(completo))