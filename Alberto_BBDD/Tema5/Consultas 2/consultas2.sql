/* 1. Obtener el nombre del cliente con mayor límite de crédito. */

SELECT NombreCliente
FROM Clientes
WHERE LimiteCredito = (SELECT MAX(LimiteCredito) FROM Clientes)

/* 2. Obtener el nombre, apellido1 y puesto de los empleados que no representen a ningún cliente. */

SELECT NombreEmpleado, Apellido1, Puesto
FROM Empleados
WHERE IdEmpleado NOT IN (SELECT DISTINCT IdEmpleado FROM Clientes)

/* 3. Obtener el nombre del producto más caro. */

SELECT NombreProducto
FROM Productos
WHERE PrecioUnitario = (SELECT MAX(PrecioUnitario) FROM Productos)

/* 4. Obtener el nombre del producto del que más unidades se hayan vendido en un mismo pedido. */

SELECT NombreProducto
FROM Productos
WHERE IdProducto = (
  SELECT IdProducto
  FROM DetallesPedidos
  GROUP BY IdProducto
  ORDER BY SUM(Cantidad) DESC
  LIMIT 1
)

/* 5. Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado. */

SELECT NombreCliente
FROM Clientes
WHERE LimiteCredito > (
  SELECT IFNULL(SUM(Cantidad), 0)
  FROM Pagos
  WHERE Pagos.IdCliente = Clientes.IdCliente
)

/* 6. Sacar el producto que más unidades tiene en stock y el que menos unidades tiene en stock. */

SELECT NombreProducto
FROM Productos
WHERE UnidadesEnStock = (
  SELECT MAX(UnidadesEnStock)
  FROM Productos
) OR UnidadesEnStock = (
  SELECT MIN(UnidadesEnStock)
  FROM Productos
)

/* 7. Sacar la media de unidades en stock de los productos agrupados por gama. */

SELECT Gama, AVG(UnidadesEnStock)
FROM Productos
GROUP BY Gama

/* 8. Sacar los clientes que residan en ciudades donde no hay oficinas ordenado por la ciudad donde residen. */

SELECT NombreCliente, Ciudad
FROM Clientes
WHERE Ciudad NOT IN (
  SELECT DISTINCT Ciudad
  FROM Oficinas
) ORDER BY Ciudad

/* 9. Sacar un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas. */

SELECT c.NombreCliente, e.NombreEmpleado, e.Apellido1
FROM Clientes c
JOIN Empleados e ON c.IdEmpleado = e.IdEmpleado

/* 10. Mostrar el nombre de los clientes que no hayan realizado pagos junto con el nombre de su representante de ventas. */

SELECT c.NombreCliente, e.NombreEmpleado, e.Apellido1
FROM Clientes c
JOIN Empleados e ON c.IdEmpleado = e.IdEmpleado
WHERE c.IdCliente NOT IN (
  SELECT DISTINCT IdCliente
  FROM Pagos
)

/* 11. Listar las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA). */

SELECT p.NombreProducto, SUM(d.Cantidad) AS UnidadesVendidas, 
  ROUND(SUM(d.PrecioUnitario*d.Cantidad), 2) AS TotalFacturado,
  ROUND(SUM(d.PrecioUnitario*d.Cantidad*1.21), 2) AS TotalFacturadoIVA
FROM Productos p
JOIN DetallesPedidos d ON p.IdProducto = d.Id

/* 12. Listar la dirección de las oficinas que tengan clientes en Fuenlabrada. */

SELECT DISTINCT direccion
FROM oficina
WHERE id_oficina IN (
    SELECT id_oficina
    FROM empleado
    WHERE id_empleado IN (
        SELECT id_empleado
        FROM cliente
        WHERE ciudad = 'Fuenlabrada'
    )
);

/* 13. Sacar el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante. */

SELECT cliente.nombre, cliente.apellido1, empleado.nombre, empleado.apellido1, oficina.ciudad
FROM cliente
INNER JOIN empleado ON cliente.id_empleado = empleado.id_empleado
INNER JOIN oficina ON empleado.id_oficina = oficina.id_oficina;


/* 14. Sacar la misma información que en la pregunta anterior pero sólo con los clientes que no hayan hecho pagos. */

SELECT cliente.nombre, cliente.apellido1, empleado.nombre, empleado.apellido1, oficina.ciudad
FROM cliente
INNER JOIN empleado ON cliente.id_empleado = empleado.id_empleado
INNER JOIN oficina ON empleado.id_oficina = oficina.id_oficina
WHERE cliente.id_cliente NOT IN (
    SELECT DISTINCT id_cliente
    FROM pedido
    WHERE fecha_pago IS NOT NULL
);

/* 15. Obtener un listado con el nombre de los empleados junto con el nombre de sus jefes. */

SELECT e.nombre AS empleado_nombre, e.apellido1 AS empleado_apellido, 
    j.nombre AS jefe_nombre, j.apellido1 AS jefe_apellido
FROM empleado e
LEFT JOIN empleado j ON e.id_jefe = j.id_empleado;

/* 16. Obtener el nombre de los clientes a los que no se les ha entregado a tiempo un pedido (FechaEntrega>FechaEsperada). */

SELECT DISTINCT cliente.nombre
FROM cliente
INNER JOIN pedido ON cliente.id_cliente = pedido.id_cliente
WHERE pedido.fecha_entrega > pedido.fecha_esperada;

/* 17. Sacar el cliente que hizo el pedido de mayor cuantía. */

SELECT cliente.nombre, MAX(pedido.total) as max_cuantia
FROM cliente
INNER JOIN pedido ON cliente.id_cliente = pedido.id_cliente
GROUP BY cliente.nombre
ORDER BY max_cuantia DESC
LIMIT 1;