use NORTHWND;

--ex: find all countries which have more than 2 suppliers

--ex: find all ContactTitle in Customers table which have less than 4 customerIDs


-- find all companyName, contactName in suppliers table, ordered by City desc

-- find all contactName in suppliers table, ordered by City asc, companyName desc

-- find CompanyName (Suppliers table) who supply products (Products table) of which unitprice > 90


-- find CategoryName (Categories table) which have products' unitInStock = 0 (products tables)

--run the following insert
insert into Suppliers (CompanyName)
values ('Aptech');
--then find all CompanyName (Suppliers table) who do not supply any products (Products table).

--run the following insert
insert into Region (RegionID, RegionDescription)
values (5, 'Asia');
--then find all RegionDescription (Region table) which do not have territories(Territories table)



--find all orders (Orders table) which have ShipCountry: France, Brazil, Belgium


--find all orders (orders table) which were ordered by customers (customers table) who are NOT from Spain, Austria and Mexico


-- find the productName (products table) which is:
--Seafood (categories table)
--supplied by Tokyo Traders (suppliers table)



-- find the productName (products table) which is:
--'Condiments' (categories table)
--supplied by 'New Orleans Cajun Delights' (suppliers table)
-- has the MAX unitprice (products table)
--hint: the product is Chef Anton's Cajun Seasoning

