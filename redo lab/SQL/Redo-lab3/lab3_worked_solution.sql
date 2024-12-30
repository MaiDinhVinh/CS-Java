use NORTHWIND;

-- ex: find all countries which have more than 2 suppliers

SELECT Country, COUNT(SupplierID)
FROM Suppliers
GROUP BY Country
HAVING COUNT(SupplierID) > 2;

-- ex: find all ContactTitle in Customers table which have less than 4 customerIDs

SELECT ContactTitle, COUNT(CustomerID)
FROM Customers
GROUP BY ContactTitle
HAVING COUNT(CustomerID) < 4;

-- find all companyName, contactName in suppliers table, ordered by City desc

SELECT CompanyName, ContactName
FROM Suppliers
ORDER BY City DESC;

-- find all contactName in suppliers table, ordered by City asc, companyName desc

SELECT ContactName
FROM suppliers
ORDER BY City ASC, CompanyName DESC;

-- find CompanyName (Suppliers table) who supply products (Products table) of which unitprice > 90

SELECT CompanyName
FROM Suppliers
RIGHT JOIN Products ON Suppliers.SupplierID = Products.SupplierID
WHERE Products.UnitPrice > 90
ORDER BY Suppliers.SupplierID;

-- find CategoryName (Categories table) which have products' unitInStock = 0 (products tables)

SELECT CategoryName
FROM Categories
LEFT JOIN Products ON Categories.CategoryID = Products.CategoryID
WHERE Products.UnitsInStock = 0;

-- run the following insert
insert into Suppliers (CompanyName)
values ('Aptech');

-- then find all CompanyName (Suppliers table) who do not supply any products (Products table).

SELECT CompanyName, COUNT(Products.SupplierID)
FROM Suppliers
LEFT JOIN Products ON Suppliers.SupplierID = Products.SupplierID
GROUP BY CompanyName
HAVING COUNT(Products.SupplierID) = 0;

-- run the following insert (This insert is commented because the db file doesn't contain the Region table)
/*
insert into Region (RegionID, RegionDescription)
values (5, 'Asia');
*/
-- then find all RegionDescription (Region table) which do not have territories(Territories table) (This insert is commented because the db file doesn't contain the Region table)
-- find all orders (Orders table) which have ShipCountry: France, Brazil, Belgium

SELECT *
FROM Orders
WHERE ShipCountry = 'France' OR
ShipCountry = 'Brazil' OR
ShipCountry = 'Belgium';

-- find all orders (orders table) which were ordered by customers (customers table) who are NOT from Spain, Austria and Mexico

SELECT *
FROM Orders
RIGHT JOIN Customers ON Orders.CustomerID = Customers.CustomerID
WHERE Customers.Country <> 'Spain' AND
Customers.Country <> 'Austria' AND
Customers.Country <> 'Mexico'
ORDER BY Orders.OrderID;

-- find the productName (products table) which is:
-- Seafood (categories table)
-- supplied by Tokyo Traders (suppliers table)

SELECT *
FROM Products
JOIN Categories ON Products.CategoryID = Categories.CategoryID
JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE Categories.CategoryName = 'Seafood' AND Suppliers.CompanyName = 'Tokyo Traders';

-- find the productName (products table) which is:
-- 'Condiments' (categories table)
-- supplied by 'New Orleans Cajun Delights' (suppliers table)
-- has the MAX unitprice (products table)
-- hint: the product is Chef Anton's Cajun Seasoning

SELECT *
FROM Products
         JOIN Categories ON Products.CategoryID = Categories.CategoryID
         JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
WHERE Categories.CategoryName = 'Condiments' AND
    Suppliers.CompanyName = 'New Orleans Cajun Delights' AND
    Products.UnitPrice = (
        SELECT MAX(Products.UnitPrice)
        FROM Products
                 JOIN Categories ON Products.CategoryID = Categories.CategoryID
                 JOIN Suppliers ON Products.SupplierID = Suppliers.SupplierID
        WHERE Categories.CategoryName = 'Condiments' AND
            Suppliers.CompanyName = 'New Orleans Cajun Delights'
);

