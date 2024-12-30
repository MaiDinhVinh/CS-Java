use NORTHWND;

--The HAVING clause was added to SQL because the WHERE keyword could not be used with aggregate functions: min, max, count, avg, sum.
--HAVING is used to filter data based on aggregate conditions
SELECT Country, COUNT(CustomerID) AS '# Customers'
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerID) > 5;


--The ORDER BY keyword is used to sort the result-set in ascending or descending order.
--The ORDER BY keyword sorts the records in ascending order by default.
SELECT * FROM Customers
ORDER BY Country /*ASC*/;

SELECT * FROM Customers
ORDER BY Country DESC;

SELECT * FROM Customers
ORDER BY Country, CompanyName; 

SELECT * FROM Customers
ORDER BY Country ASC, CompanyName DESC; 


--A (INNER) JOIN clause is used to combine rows from two or more tables, based on a related column between them.
--exp relationship between customers and orders tables (maybe draw a diagram)
SELECT Orders.OrderID, Customers.CompanyName, Orders.OrderDate
FROM Orders JOIN Customers ON Orders.CustomerID=Customers.CustomerID; --2 tables

SELECT Orders.OrderID, 
		Customers.CompanyName as 'Customer Company', 
		Shippers.CompanyName as 'Shipping Company'
FROM (
		Orders JOIN Customers ON Orders.CustomerID = Customers.CustomerID
		JOIN Shippers ON Orders.ShipVia = Shippers.ShipperID
	); 

--LEFT JOIN
--draw diagram to explain
SELECT Customers.CompanyName, Orders.OrderID
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID
ORDER BY Orders.OrderID;


--RIGHT JOIN
--draw diagram to explain
insert into Employees (LastName, FirstName)
values ('Le', 'Bach');

SELECT Orders.OrderID, Employees.LastName, Employees.FirstName
FROM Orders
RIGHT JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
ORDER BY Orders.OrderID; 

--self study: FULL JOIN, SELF JOIN
--https://www.w3schools.com/sql/sql_join_full.asp
--https://www.w3schools.com/sql/sql_join_self.asp


--subquery - nested query
SELECT * FROM Orders
WHERE OrderDate = (
	SELECT MAX(OrderDate)
	FROM Orders
);


--EXISTS 
--The EXISTS operator returns true if the subquery returns one or more records.
SELECT CompanyName
FROM Suppliers
WHERE EXISTS (
	SELECT ProductName 
	FROM Products 
	WHERE Products.SupplierID = Suppliers.SupplierID 
	AND UnitPrice < 20
); 

--Any, all
--exp OrderDetails and Products (show schema diagram)
SELECT ProductName
FROM Products
WHERE ProductID = ANY (SELECT ProductID FROM [Order Details] WHERE Quantity = 10); 
--spaces in table name
--Note: The operator must be a standard comparison operator (=, <>, !=, >, >=, <, <=). 


SELECT ProductName
FROM Products
WHERE ProductID <> ALL (SELECT ProductID FROM [Order Details] WHERE Quantity = 10); 




--In
SELECT * FROM Customers
WHERE Country = 'Germany'
	OR Country = 'France'
	OR Country = 'UK';

SELECT * FROM Customers
WHERE Country IN ('Germany', 'France', 'UK');

--NOT IN
SELECT * FROM Customers
WHERE Country NOT IN ('Germany', 'France', 'UK');

SELECT * FROM Customers
WHERE Country IN (SELECT Country FROM Suppliers);


-- OPTIONAL
--Venn Diagram
--UNION (no duplicate), UNION ALL (allow duplicate)
--The UNION operator is used to combine the result-set of two or more SELECT statements.
--Each SELECT statement within UNION must have the same number of columns
--The columns must also have similar data types
--The columns in each SELECT statement must also be in the same order
SELECT City FROM Customers
UNION
SELECT City FROM Suppliers
ORDER BY City;

SELECT City FROM Customers
UNION ALL
SELECT City FROM Suppliers
ORDER BY City;

--self study: Intersect, Except