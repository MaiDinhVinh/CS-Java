-- Restore NORTHWIND database
USE NorthWind;

-- ex: find all information of Orders table
SELECT *
FROM orders;

-- ex: find orderID, customerID, employeeID of Orders table
SELECT OrderID, CustomerID, EmployeeID
FROM orders;

-- ex: find ShipCity, ShipAddress of Orders table
SELECT ShipCity, ShipAddress
FROM orders;

-- ex: concat ShipCity and ShipAddress as 1 column (eg. Adenauerallee 900-Stuttgart)
SELECT CONCAT(ShipCity, ShipAddress) AS 'Shipping Address'
FROM orders;

-- ex: find CompanyName and ContactName of Customers table
SELECT CompanyName, ContactName
FROM customers;

-- ex: find CustomerID, CompanyName as 'Customer Name' and ContactName as 'The Person' of Customers table
SELECT
    CustomerID AS 'Customer Name',
    CompanyName AS 'The Person'
FROM customers;

-- ex: find all Freight of Orders after 15% tax applied, named as 'Freight after 15% tax'
SELECT Freight * 0.85 AS 'Freight after 15% tax'
FROM orders;

-- ex: find all distinct customerID of Orders table
SELECT DISTINCT CustomerID
FROM orders;


-- (REMOVED) ex: select all information of Orders table (except Freight + 20% tax) into new table OrdersWithTax

-- ex: find all Orders which have Freight greater than 60
SELECT Freight
FROM orders
where Freight > 60;

-- ex: find all Orders which have Freight less than 10
SELECT Freight
FROM orders
WHERE Freight < 10;

-- ex: find all Orders which have Freight between 40 and 50
SELECT Freight
FROM orders
WHERE Freight > 40 AND Freight < 50;

-- ex: find all customers from Germany
SELECT *
FROM customers
WHERE Country = 'Germany';

-- ex: find all customers whose contactName is %Paul%
SELECT *
FROM customers
WHERE ContactName like '%Paul%';

-- ex: find all Mexico customers whose ContactTitle is Owner
SELECT *
FROM customers
WHERE Country = 'Mexico' and ContactTitle = 'Owner';

-- ex: find all Orders such that OrderDate in 1997 and employeeID = 4
SELECT *
FROM orders
WHERE OrderDate >= '1995-01-01' AND OrderDate <= '1996-12-31' AND EmployeeID = 4;

--  ex: find all Orders such that ShippedDate in November-1997 and Freight between 10 and 30
SELECT *
FROM orders
WHERE ShippedDate >= '1995-11-01' AND ShippedDate <= '1995-11-30'
  AND Freight > 10 AND Freight < 30;

-- ex: find maximum freight in Orders in which EmployeeId = 3
SELECT MAX(Freight) AS 'Maximum Freight'
FROM orders
WHERE EmployeeID = 3;
-- ex: find how many Orders placed by customerID 'EASTC'
SELECT COUNT(CustomerID) AS 'Order placed'
FROM orders
WHERE CustomerID = 'EASTC';
-- ex: find how many Orders placed by customerID 'EASTC' and orderDate in 1998
SELECT COUNT(CustomerID) AS 'Order placed'
FROM orders
WHERE CustomerID = 'EASTC' AND OrderDate >= '1994-01-01' AND OrderDate <= '1994-12-31';
