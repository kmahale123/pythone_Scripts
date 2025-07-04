import json

employee_data='''
{
"people": [
{
"name":"Komal",
"email":["k@gmail.com","gg@gmail.com"],
"married": false
},
{
"name":"Mahale",
"email":["kmahale@gmail.com","mahalepatil@gmail.com"],
"married": true
}
]}
'''
print(employee_data)
data=json.loads(employee_data)
print(data)