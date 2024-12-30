use NORTHWND;

-- *: all columns in the table
-- from <table name>
select * from Suppliers; 


-- select specific columns
select SupplierID, CompanyName, ContactName 
from Suppliers;

-- concat columns and constant text
select CompanyName + ': ' + ContactName + ' <' + ContactTitle + '>'
from Suppliers;

-- rename column name
select	CompanyName as 'Provider', 
		ContactName as 'The person'
from Suppliers;


-- compute values
select	ProductName,
		UnitPrice as 'Original Price',
		UnitPrice * 0.9 as 'Price after 10% discount'
from Products;


-- prevent duplicate record
select ReorderLevel
from Products;

select distinct ReorderLevel
from Products;


-- top, percent
select top 15 ProductName 
from Products;

select top 15 percent ProductName 
from Products;

-- select into a new table (created on the fly)
select ProductID, ProductName, UnitPrice*0.9 as DiscountedPrice
into Product10PercentDiscount
from Products;

-- select where: select on condition
--Operator		Description
--	=			Equal
--	<>			Not equal. Note: In some versions of SQL this operator may be written as !=
--	>			Greater than
--	<			Less than
--	>=			Greater than or equal
--	<=			Less than or equal
--	BETWEEN		Between a certain range
--	LIKE		Search for a pattern
--	IN			To specify multiple possible values for a column
select ProductID, ProductName
from Products
where ProductID = 5;

select ProductID, ProductName, UnitPrice
from Products
where UnitPrice > 50;

select CompanyName, Country
from Suppliers
where Country = 'USA';

select CompanyName, Address
from Suppliers
where Address like '%ed%';


--And, or, Not
select ProductID, ProductName, UnitPrice
from Products
where UnitPrice > 50 and UnitPrice < 60;

select ProductID, ProductName, UnitPrice
from Products
where UnitPrice > 90 or UnitPrice < 5;

select ProductID, ProductName, UnitPrice
from Products
where (UnitPrice > 90 or UnitPrice < 5)
and ProductID <> 33;

--group by
-- (COUNT, MAX, MIN, SUM, AVG)
select Country, count(SupplierID) as 'Number of suppliers'
from Suppliers
group by Country;

select Country, 
		count(SupplierID) as '#Suppliers'
from Suppliers
where Country <> 'Italy'
	and Country <> 'Germany'
	and Country <> 'Japan'
group by Country