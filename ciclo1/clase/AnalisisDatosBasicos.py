#para instalar matplotlib -> pip install matplotlib
import matplotlib.pyplot as mpl


#conjunto de puntos 1
x1 = [1, 5, 10, 20]
y1 = [1, 5, 5, 20]

#conjunto de puntos 2
x2 = [1, 5, 2, 10]
y2 = [3, 2, 10, 20]

#se le pasa un conjunto de puntos, se contectan esos puntos formando líneas...
#además se agregan ciertos parámetros
# mpl.plot(x1, y1, color = 'red', linewidth = 4, label = 'Linea 1')
# mpl.plot(x2, y2, color = 'cyan', linewidth = 4, label = 'Linea 2')

#se agrega un título a la gráfica
# mpl.title('2 Líneas')
# se nombra el eje X
# mpl.xlabel('Eje X')
#se nombre el eje Y
# mpl.ylabel('Eje Y')
#se activa la leyenda
# mpl.legend()
#se le ponen cuadrículas
# mpl.grid()
#se muestra
# mpl.show()

#barra
# mpl.bar(x1, y1, color = 'green', linewidth = 4, label = 'Barra 1')
# mpl.bar(x2, y2, color = 'violet', linewidth = 4, label = 'Barra 2')
# mpl.legend()
# mpl.xlabel('Eje X')
# mpl.ylabel('Eje Y')
# mpl.show()

#histogramas
# Datos = [20,22,21,20,23,25,28,40,22,23,22,15,16,18,18,19,21,22,24,4,12,17,17,22,30,]
# Rangobin=[0,10,20,20,30,40]

# mpl.hist(Datos, Rangobin, histtype='bar',rwidth=0.8, color='lightgreen')

# mpl.title('Histograma')
# mpl.xlabel('Eje X')
# mpl.ylabel('Eje Y')
# mpl.grid()  #la grid no es necesaria (lineas horizontales y verticales)
# mpl.show()

#Scatter
# mpl.scatter(x1,y1, color="red",  label = 'Puntos 1')

# mpl.title('Dos Graficas juntas')
# mpl.xlabel('Eje X')
# mpl.ylabel('Eje Y')
# mpl.legend()
# mpl.grid()
# mpl.show()

#Pie
# valores =[20,40,60,80]

# mpl.pie(valores, labels=['Prekinder', 'kinder', 'primaria', 'secundaria'], colors=['red','purple','blue','orange']
#         , startangle=90,shadow=True, explode=(0.1,0,0,0),autopct='%1.1f%%')
# mpl.title('Grafico circular')
# mpl.show()

