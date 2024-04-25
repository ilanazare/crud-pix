# crud-pix

## swagger
### http://localhost:8080/swagger-ui/index.html#/

### use json in /customer/{customer} for test
...
{
"customer": "2345434501000",
"name": "daniela",
"cpf": "7787233958790",
"email": "iva@hotmail",
"phone": "71984376654",
"account": [
{
"customer": "2345434501000",
"bank": "BRADESCO",
"agency": "3454-4",
"account": "8987769-0",
"payment": [
{
"customer": "2345434501000",
"account": "8987769-00",
"pixType": "PHONE_NUMBER",
"pixKey": "71984191099"
}
]
}
]
}
...