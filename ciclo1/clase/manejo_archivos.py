import pandas as pd

datos = {
  'nombre' : ['edied', 'royer', 'harold', 'jhon', 'david'],
  'apellido' : ['ramos', 'ramos', 'ramos', 'ramos', 'ramos'],
  'edad' : [21, 30, 40, 18, 9]
}

datos_frame = pd.DataFrame(datos)

# print(datos_frame)

# archivos csv

# datos_frame.to_csv('ejemplo.csv')

# lectura = pd.read_csv('ejemplo.csv')
# lectura = pd.read_csv('ejemplo.csv', skiprows = 1, names = ['Id', 'Nombre', 'Apellido', 'Edad', 'xxx'])


# print(lectura)

# archivos xlsx - excel

# datos_frame.to_excel('ejemplo.xlsx')

# datos_excel = pd.read_excel('ejemplo.xlsx')

# print(datos_excel)

# archivos txt

fichero = open('info.txt', 'w')

# fichero.write('hola, soy edied\nme siento motivado\n')

# print("edied es el puto amo", file = fichero)

datos = ['edied', 'el puto amo', 'yeahhhhhh']

# fichero.writelines("edied isaias ramos\nesto va super\n")
# fichero.writelines("esto es como un write\nedied ramos\n")
fichero.writelines('%s\n' % i for i in datos)

fichero.close()