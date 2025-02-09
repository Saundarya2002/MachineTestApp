# MachineTestApp
checkout to Master branch for Project folder.
Created this application on intelliJ IDE
Here is the steps to run application
Used postman to test API's
# 1. Create a Database on Mysql Server
Create Database using mysql server and change username, password and datasource url in application.properties file 

# 2. Run the application

# 3. GET All Categories
to get all categories go to postman create a new tab and select GET method and paste URL  http://localhost:8080/api/categories?page=2

# 4. Create new category 
To create category on new tab select POST method and paste URL http://localhost:8080/api/categories
Body as: JSON
{
  "name": "Electronics"
}

It will create a new category with an Id.

# 5. GET Category by Id
To get a particular category select method GET and pase URL as http://localhost:8080/api/categories/{id} 
and replace id with actual id.

# 6. Update Category by Id
To update category
Method: PUT
URL: http://localhost:8080/api/categories/{id}
replace with actual id and use Body(json) as:
{
  "name": "Home Appliances"
}


# 7. Category by Id
To Delete Category
Method: Delete
URL: http://localhost:8080/api/categories/{id}
replace with actual id

# 8. Create a New Product
To Create New Product
Method: POST
URL: http://localhost:8080/api/products
use Body As: json
{
  "name": "Smartphone",
  "price": 699.99,
  "category": {
    "id": 1
  }
}

# 9. GET Product by Id
To get product by id
Method: GET
URL: http://localhost:8080/api/products/{id}
replace with actual id

# 10. Update Product by Id
To update product
Method: PUT
URL: http://localhost:8080/api/products/{id}
replace with actual id and use Body(json) as:
{
  "name": "Smart TV",
  "price": 1299.99,
  "category": {
    "id": 1
  }
}

# 11. Delete Product by Id
To delete product by id
Method : DELETE
URL: http://localhost:8080/api/products/{id}
replace with actual id.
