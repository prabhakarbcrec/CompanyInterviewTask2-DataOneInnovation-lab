# CompanyInterviewTask2-DataOneInnovation-lab
This was a second task which given to me by dataOne innovation lab

Task 2:

Our microservice architecture has a service to create and manage products. We now would like to add another microservice that offers search and filter capabilities for products. To quickly provide a working endpoint to our frontend team, we agreed on the following details.

Read Data from In-memory (H2) Database
The service should connect to In-memory H2 store, where it can read products with the following structure:

{
	"id": 1,
	"name": "Product A",
	"price": 12.99,
	"brand": "Brand A",
	"onSale": true
}
Pre-load database with at least 10 products.

Expected Response
Our Frontend Team expects a response matching the following requirements

All products are returned
Products are grouped by brand, sorted alphabetically
Property brand should be omitted on products
Products inside a brand should be sorted ascending by price
Property onSale should be converted to a property event of type String with the value "ON SALE"
