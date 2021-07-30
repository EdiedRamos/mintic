-- solución al primer ejercicio
select 
	Documento_Identidad, 
	Nombre || " " || Primer_Apellido || " " || Segundo_Apellido as Lider,
	Ciudad_Residencia,
	Salario
from Lider
where Cargo = "Gerente"
order by Documento_Identidad;

-- solución al segundo ejercicio
select distinct
	Constructora,
	Clasificacion,
	Ciudad
from Proyecto
where Banco_Vinculado = 'Bancolombia'
order by Constructora, Clasificacion, Ciudad

-- solución al tercer ejercicio
select
	l.Nombre || ' ' || l.Primer_Apellido as Lider,
	l.Cargo,
	count(l.ID_Lider) as [# Proyectos]
from Proyecto as p, Lider as l
where p.ID_Lider = l.ID_Lider and p.Constructora = 'Pegaso'
group by l.ID_Lider
order by l.Cargo, Lider

-- solución al cuarto ejercicio
select
	mc.ID_MaterialConstruccion,
	mc.Nombre_Material,
	c.Cantidad,
	mc.Precio_Unidad,
	c.Cantidad * mc.Precio_Unidad as Precio_Total
from Compra c, MaterialConstruccion mc, Proyecto p
where
	c.ID_Proyecto = p.ID_Proyecto and mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion and (p.ID_Proyecto in (14, 20, 18, 36, 45, 48, 56))
order by p.ID_Proyecto, mc.Precio_Unidad desc

-- solución al quinto ejercicio
select
	p.ID_Proyecto,
	p.Ciudad,
	p.Clasificacion,
	sum(c.Cantidad * mc.Precio_Unidad) Costo_Proyecto
from Proyecto p, Compra c, MaterialConstruccion mc
where
	p.ID_Proyecto = c.ID_Proyecto and
	c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion and
	p.Ciudad in ('Sta. Rosa de Cabal', 'Pereira')
group by p.ID_Proyecto
having Costo_Proyecto > 87000
order by p.Ciudad, p.Clasificacion