def asignarCita(pacientes):
  for x in range(len(pacientes)):
    if int(pacientes[x][2]) in range(8, 12): pacientes[x].append('Juan Perez')
    if int(pacientes[x][2]) in range(14, 18): pacientes[x].append('Maria Lopez')
    if int(pacientes[x][2]) in range(18, 20): pacientes[x].append('Pedro Rodriguez')
  #salida
  cita = ''
  cita += 'Identificación\tPaciente\tHora\tMédico asignado\n\n'
  for x in range(len(pacientes)):
    cita += ('{}\t{}\t{}\t{}\n'.format(pacientes[x][0], pacientes[x][1], pacientes[x][2], pacientes[x][3]))
  return cita

print(asignarCita([['1110569478', 'Alexander Pinto', 14], ['1110934100','Nicolas Machado', 10],
['1110312456', 'Rebeca Vega', 8]]))
