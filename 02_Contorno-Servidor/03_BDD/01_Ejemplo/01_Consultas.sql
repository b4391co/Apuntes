use w3schools;
-- 1- Obtener los identificadores, nombres, país y ciudad de la tabla customers cuyo país sea Spain o ciudad 
-- sea Lisboa ordenados primero por país y luego por ciudad

SELECT customerName, Country, city 
FROM customers
WHERE Country = "Spain" or City = "Lisboa"
ORDER BY Country,City;

-- 2- Inserta un nuevo registro en la tabla categories con un nombre y una descripción, 
-- pero sin indicar el CategoryID (se asignará automáticamente)

INSERT INTO categories (CategoryName,Description)
VALUES ("produccion", "Quesos");

-- 3- Averigua el CategoryID asignado al nuevo registro y actualiza el valor de la descripción del registro que acabas de insertar:

SELECT CategoryID FROM categories WHERE CategoryName = "producion" ORDER BY CategoryID DESC;

UPDATE categories SET Description = 'nuevo queso2'
WHERE categoryID = (SELECT CategoryID WHERE CategoryName = "producion" ORDER BY CategoryID DESC); 

-- 4- Elimina el registro que acabas de añadir en categories

DELETE FROM categories WHERE CategoryID = 9;

-- 5- Obtén los 5 productos de mayor precio:

SELECT * 
FROM products 
ORDER BY price DESC 
LIMIT 5;

-- 6- Obtén la fecha más reciente para la tabla orders

SELECT * 
FROM orders 
ORDER BY OrderDate DESC
LIMIT 1;

-- 7- Obtén el número de registros en la tabla customers

SELECT count(*) 
FROM customers;

-- 8- Obtén el número de distintos clientes que han hecho un pedido.

SELECT count(DISTINCT(CustomerID))
FROM orders;

-- 9- Obtén los empleados que, tienen en la columna Notes, la palabra psychology

SELECT * 
FROM employees 
WHERE notes like "%psychology%";

-- 10-Obtén los nombres de los productos y el identificador de la categoría a la que pertenecen de aquellos productos 
-- cuyo proveedor tienen los identificadors 5 o 6. Utiliza la cláusula IN. Ordena el resultado por CategoryID, luego por ProductName

SELECT ProductName, CategoryID 
FROM products
WHERE SupplierID = 5 or SupplierID = 6;

-- 11- Modifica la consulta número 8 para que el resultado se muestre en una columna llamada "Nº clientes con pedidos".

SELECT count(DISTINCT(CustomerID)) as "Nº clientes con pedidos"
FROM orders;

-- 12- Obtén el nombre identificador y los nombres de cada producto y su categoría

SELECT pro.ProductId, pro.ProductName, pro.CategoryID , cat.CategoryName
FROM products pro, categories cat
WHERE pro.CategoryID = cat.CategoryID;

-- 13- Obtén todos los datos de los clientes que no han hecho ningún pedido. Utiliza algún tipo de JOIN

SELECT customers.* 
FROM customers 
LEFT JOIN orders ON customers.CustomerID = orders.CustomerID 
WHERE orders.CustomerID IS NULL;