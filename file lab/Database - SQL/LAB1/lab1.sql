--Refer to DIAGRAM_0.pdf

--ex0
--Create database LTN_357_AM, --all tables in the following exercises are created in LTN_357_AM


--ex: create table Suppliers WITHOUT Fax and Homepage columns (refer to the diagram)

--ex: insert into Suppliers the following data
--SupplierID||CompanyName||ContactName||ContactTitle||Address||City||Region||PostalCode||Country||Phone
--1||Exotic Liquids||Charlotte Cooper||Purchasing Manager||49 Gilbert St.||London||NULL||EC1 4SD||UK||(171) 555-2222
--2||New Orleans Cajun Delights||Shelley Burke||Order Administrator||P.O. Box 78934||New Orleans||LA||70117||USA||(100) 555-4822
--3||Grandma Kelly's Homestead||Regina Murphy||Sales Representative||707 Oxford Rd.||Ann Arbor||MI||48104||USA||(313) 555-5735
--4||Tokyo Traders||Yoshi Nagase||Marketing Manager||9-8 Sekimai Musashino-shi||Tokyo||NULL||100||Japan||(03) 3555-5011
--5||Cooperativa de Quesos 'Las Cabras'||Antonio del Valle Saavedra||Export Administrator||Calle del Rosal 4||Oviedo||Asturias||33007||Spain||(98) 598 76 54


--ex: alter Suppliers to have Fax and Homepage columns


--ex: update Suppliers Fax and Homepage as follow:
--SupplierID||Fax||HomePage
--1||NULL||kagoo.com
--2||NULL||#CAJUN.HTM#
--3||(313) 555-3349||NULL
--4||(233) 34331-322||NULL
--5||NULL||sample.com


--ex: delete data of Tokyo Traders and Cooperativa de Quesos 'Las Cabras'

--ex: create table Categories WITHOUT Picture column (refer to the diagram)

--ex: insert into Categories the following data
--CategoryID||CategoryName||Description
--1||Beverages||Soft drinks, coffees, teas, beers, and ales
--2||Condiments||Sweet and savory sauces, relishes, spreads, and seasonings
--3||Confections||Desserts, candies, and sweet breads
--4||Dairy Products||Cheeses
--5||Grains/Cereals||Breads, crackers, pasta, and cereal
--6||Meat/Poultry||Prepared meats
--7||Produce||Dried fruit and bean curd
--8||Seafood||Seaweed and fish


--ex: create table Products (refer to the diagram)

--ex: apply foreign key to SupplierID referring to primary key SupplierID in Suppliers table

--ex: apply foreign key to CategoryID referring to primary key CategoryID in Categories table

--ex: insert into Products
--ProductID||ProductName||SupplierID||CategoryID||QuantityPerUnit||UnitPrice||UnitsInStock||UnitsOnOrder||ReorderLevel||Discontinued
--1||Chai||1||1||10 boxes x 20 bags||18.00||39||0||10||0
--2||Chang||1||1||24 - 12 oz bottles||19.00||17||40||25||0
--3||Aniseed Syrup||1||2||12 - 550 ml bottles||10.00||13||70||25||0
--4||Chef Anton's Cajun Seasoning||2||2||48 - 6 oz jars||22.00||53||0||0||0
--5||Chef Anton's Gumbo Mix||2||2||36 boxes||21.35||0||0||0||1

--ex: update products 'Chai', 'Chang' to have supplierId = 4

--ex: delete all products that have UnitsOnOrder = 0


