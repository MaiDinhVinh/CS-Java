-- Restore NORTHWIND database

USE NorthWind;

-- ex: find all information of Orders table

SELECT *
FROM Orders;

-- ex: find orderID, customerID, employeeID of Orders table

SELECT OrderID, CustomerID, EmployeeID
FROM Orders;

-- ex: find ShipCity, ShipAddress of Orders table

SELECT ShipCity, ShipAddress
FROM Orders;

-- ex: concat ShipCity and ShipAddress as 1 column (eg. Adenauerallee 900-Stuttgart)

SELECT CONCAT(ShipCity, ' ', ShipAddress)
FROM Orders;


-- ex: find CompanyName and ContactName of Customers table

SELECT CompanyName, ContactName
FROM Customers;

-- ex: find CustomerID, CompanyName as 'Customer Name' and ContactName as 'The Person' of Customers table

SELECT CustomerID AS 'Customer Name',
       CompanyName AS 'Contact Name'
FROM Customers;

-- ex: find all Freight of Orders after 15% tax applied, named as 'Freight after 15% tax'

SELECT Freight * 0.85 AS 'Freight after 15% tax',
       Freight AS 'Original Freight'
FROM Orders;

-- ex: find all distinct customerID of Orders table

SELECT DISTINCT CustomerID
FROM Orders;

-- ex: select all information of Orders table (except Freight + 20% tax) into new table OrdersWithTax (DEPRECATED)
-- ex: find all Orders which have Freight greater than 60

SELECT *
FROM Orders
WHERE Freight > 60;

-- ex: find all Orders which have Freight less than 10

SELECT *
FROM Orders
WHERE Freight < 10;

-- ex: find all Orders which have Freight between 40 and 50

SELECT *
FROM Orders
WHERE Freight BETWEEN 40 AND 50;

-- ex: find all customers from Germany

SELECT *
FROM Customers
WHERE Country = 'Germany';

-- ex: find all customers whose contactName is %Paul%

SELECT *
FROM Customers
WHERE ContactName like '%Paul%';

-- ex: find all Mexico customers whose ContactTitle is Owner

SELECT *
FROM Customers
WHERE Country = 'Mexico' AND ContactTitle = 'Owner';

-- ex: find all Orders such that OrderDate in 1997 and employeeID = 4 (Orders table doesn't consist of 1997 order date => switch to 1994)

SELECT *
FROM Orders
WHERE (OrderDate BETWEEN '1994-01-01 00:00:00' AND '1994-12-31 00:00:00') AND EmployeeID = 4;

-- ex: find all Orders such that ShippedDate in November-1997 and Freight between 10 and 30 (Orders table doesn't consist of 1997 order date => switch to 1994)

SELECT *
FROM Orders
WHERE (OrderDate BETWEEN '1994-11-01 00:00:00' AND '1994-11-30 00:00:00')
AND Freight BETWEEN 10 AND 30;

-- ex: find maximum freight in Orders in which EmployeeId = 3

SELECT MAX(Freight)
FROM Orders
WHERE EmployeeID = 3;

-- ex: find how many Orders placed by customerID 'EASTC'

SELECT CustomerID, COUNT(ShipName)
FROM Orders
WHERE CustomerID = 'EASTC'
GROUP BY CustomerID;

-- ex: find how many Orders placed by customerID 'EASTC' and orderDate in 1998 (Orders table doesn't consist of 1997 order date => switch to 1994)

SELECT CustomerID, COUNT(ShipName)
FROM Orders
WHERE CustomerID = 'EASTC' AND (OrderDate BETWEEN '1994-01-01 00:00:00' AND '1994-12-31 00:00:00')
GROUP BY CustomerID;

