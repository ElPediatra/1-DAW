/* 1. Obtener el nombre del cliente con mayor límite de crédito. */

SELECT NombreCliente
FROM Clientes
WHERE LimiteCredito = (SELECT MAX(LimiteCredito) FROM Clientes);

/* 2. Obtener el nombre, apellido1 y puesto de los empleados que no representen a ningún cliente. */

SELECT NombreEmpleado, Apellido1, Puesto
FROM Empleados
WHERE IdEmpleado NOT IN (SELECT DISTINCT IdEmpleado FROM Clientes);

/* 3. Obtener el nombre del producto más caro. */

SELECT NombreProducto
FROM Productos
WHERE PrecioUnitario = (SELECT MAX(PrecioUnitario) FROM Productos);

/* 4. Obtener el nombre del producto del que más unidades se hayan vendido en un mismo pedido. */

SELECT NombreProducto
FROM Productos
WHERE IdProducto = (
  SELECT IdProducto
  FROM DetallesPedidos
  GROUP BY IdProducto
  ORDER BY SUM(Cantidad) DESC
  LIMIT 1
);

/* 5. Obtener los clientes cuya línea de crédito sea mayor que los pagos que haya realizado. */

SELECT NombreCliente
FROM Clientes
WHERE LimiteCredito > (
  SELECT IFNULL(SUM(Cantidad), 0)
  FROM Pagos
  WHERE Pagos.IdCliente = Clientes.IdCliente
);

/* 6. Sacar el producto que más unidades tiene en stock y el que menos unidades tiene en stock. */

SELECT NombreProducto
FROM Productos
WHERE UnidadesEnStock = (
  SELECT MAX(UnidadesEnStock)
  FROM Productos
) OR UnidadesEnStock = (
  SELECT MIN(UnidadesEnStock)
  FROM Productos
);

/* 7. Sacar la media de unidades en stock de los productos agrupados por gama. */

SELECT Gama, AVG(UnidadesEnStock)
FROM Productos
GROUP BY Gama;

/* 8. Sacar los clientes que residan en ciudades donde no hay oficinas ordenado por la ciudad donde residen. */

SELECT NombreCliente, Ciudad
FROM Clientes
WHERE Ciudad NOT IN (
  SELECT DISTINCT Ciudad
  FROM Oficinas
) ORDER BY Ciudad;

/* 9. Sacar un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas. */

SELECT c.NombreCliente, e.NombreEmpleado, e.Apellido1
FROM Clientes c
JOIN Empleados e ON c.IdEmpleado = e.IdEmpleado;

/* 10. Mostrar el nombre de los clientes que no hayan realizado pagos junto con el nombre de su representante de ventas. */

SELECT c.NombreCliente, e.NombreEmpleado, e.Apellido1
FROM Clientes c
JOIN Empleados e ON c.IdEmpleado = e.IdEmpleado
WHERE c.IdCliente NOT IN (
  SELECT DISTINCT IdCliente
  FROM Pagos
);

/* 11. Listar las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA). */

SELECT p.NombreProducto, SUM(d.Cantidad) AS UnidadesVendidas, 
  ROUND(SUM(d.PrecioUnitario*d.Cantidad), 2) AS TotalFacturado,
  ROUND(SUM(d.PrecioUnitario*d.Cantidad*1.21), 2) AS TotalFacturadoIVA
FROM Productos p
JOIN DetallesPedidos d ON p.IdProducto = d.Id;

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

/* 18. Sacar el importe medio de los pedidos. */

SELECT AVG(Cantidad * PrecioUnidad) AS ImporteMedio
FROM DetallePedidos;

/* 19. Sacar un listado de clientes indicando el nombre del cliente y cuántos pedidos ha realizado. */

SELECT NombreCliente, COUNT(*) AS NumeroPedidos
FROM Clientes c
INNER JOIN Pedidos p ON c.CodigoCliente = p.CodigoCliente
GROUP BY NombreCliente;

/* 20. Sacar un listado con los nombres de los clientes y el total pagado por cada uno de ellos. */

SELECT NombreCliente, SUM(Cantidad) AS TotalPagado
FROM Clientes c
INNER JOIN Pagos p ON c.CodigoCliente = p.CodigoCliente
GROUP BY NombreCliente;

/* 21. Sacar el nombre de los clientes que hayan hecho pedidos en 2008. */

SELECT DISTINCT NombreCliente
FROM Clientes c
INNER JOIN Pedidos p ON c.CodigoCliente = p.CodigoCliente
WHERE YEAR(FechaPedido) = 2008;

/* 22. Listar el nombre del cliente y el nombre y apellido de sus representantes de aquellos que no hayan realizado pagos. */

SELECT c.NombreCliente, e.Nombre, e.Apellido1
FROM Clientes c
LEFT JOIN Pagos p ON c.CodigoCliente = p.CodigoCliente
INNER JOIN Empleados e ON c.CodigoEmpleadoRepVentas = e.CodigoEmpleado
WHERE p.IDTransaccion IS NULL;

/* 23. Sacar un listado de clientes donde aparezca el nombre de su comercial y la ciudad donde está su oficina. */

SELECT c.NombreCliente, e.Nombre, e.Apellido1, o.Ciudad
FROM Clientes c
INNER JOIN Empleados e ON c.CodigoEmpleadoRepVentas = e.CodigoEmpleado
INNER JOIN Oficinas o ON e.CodigoOficina = o.CodigoOficina;

/* 24. Sacar el nombre, apellidos, oficina y cargo de aquellos que no sean representantes de ventas. */

SELECT Nombre, Apellido1, Apellido2, Oficinas.Ciudad, Oficinas.Pais, Puesto
FROM Empleados
LEFT JOIN Oficinas ON Empleados.CodigoOficina = Oficinas.CodigoOficina
WHERE CodigoEmpleado NOT IN (SELECT CodigoEmpleadoRepVentas FROM Clientes WHERE CodigoEmpleadoRepVentas IS NOT NULL);

/* 25. Sacar cuantos empleados tiene cada oficina, mostrando el nombre de la ciudad donde está la oficina. */

SELECT Oficinas.Ciudad, COUNT(*) AS NumeroEmpleados
FROM Empleados
INNER JOIN Oficinas ON Empleados.CodigoOficina = Oficinas.CodigoOficina
GROUP BY Oficinas.Ciudad;

/* 26. Sacar los clientes que residan en la misma ciudad donde hay una oficina, indicando dónde está la oficina. */

SELECT c.nombre AS nombre_cliente, c.ciudad AS ciudad_cliente, o.ciudad AS ciudad_oficina
FROM clientes c 
JOIN empleados e ON c.comercial_asignado = e.codigo_empleado
JOIN oficinas o ON e.codigo_oficina = o.codigo_oficina
WHERE c.ciudad = o.ciudad;

/* 27. Sacar el número de clientes que tiene asignado cada representante de ventas. */

SELECT r.nombre AS representante, COUNT(*) AS num_clientes
FROM clientes c
INNER JOIN representantes r ON c.representante_id = r.id
GROUP BY r.id;

/* 28. Sacar cuál fue el cliente que hizo el pago con mayor cuantía y el que hizo el pago con menor cuantía. */

SELECT c.nombre AS cliente_max, MAX(p.importe) AS importe_max, 
       c2.nombre AS cliente_min, MIN(p.importe) AS importe_min
FROM clientes c 
INNER JOIN pedidos p ON c.id = p.cliente_id
INNER JOIN clientes c2 ON c2.id = p.cliente_id
GROUP BY c.id, c2.id
ORDER BY importe_max DESC, importe_min ASC
LIMIT 1;

/* 29. Sacar un listado con el precio total de cada pedido. */

SELECT p.id AS pedido, SUM(d.cantidad * d.precio_unitario) AS total
FROM pedidos p 
INNER JOIN detalles_pedido d ON p.id = d.pedido_id
GROUP BY p.id;

/* 30. Sacar los clientes que hayan hecho pedidos en el 2008 por una cuantía superior a 2000 euros. */

SELECT c.nombre, SUM(d.cantidad * d.precio_unitario) AS total
FROM clientes c 
INNER JOIN pedidos p ON c.id = p.cliente_id
INNER JOIN detalles_pedido d ON p.id = d.pedido_id
WHERE YEAR(p.fecha_pedido) = 2008
GROUP BY c.id
HAVING total > 2000;

/* 31. Sacar cuantos pedidos tiene cada cliente en cada estado. */

SELECT customers.customerName, orders.status, COUNT(*) as num_orders
FROM customers
INNER JOIN orders ON customers.customerNumber = orders.customerNumber
GROUP BY customers.customerNumber, orders.status
ORDER BY customers.customerName, orders.status;

/* 32. Sacar los clientes que han pedido más de 200 unidades de cualquier producto. */

SELECT DISTINCT customers.customerName
FROM customers
INNER JOIN orders ON customers.customerNumber = orders.customerNumber
INNER JOIN orderdetails ON orders.orderNumber = orderdetails.orderNumber
WHERE orderdetails.quantity > 200;