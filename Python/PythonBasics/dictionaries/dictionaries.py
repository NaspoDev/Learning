# A hashmap in python is called a dictionary

customer = {
    "name" : "John Smith",
    "age" : 30,
    "is_verified" : True
}
print(customer.get("name"))
print(customer['name'])
customer["birthdate"] = 'Jan 1, 1970'
print(customer['birthdate'])

# Secondary optional param in .get method to use if specified key does not exist
print(customer.get("height", "7\"11'"))

