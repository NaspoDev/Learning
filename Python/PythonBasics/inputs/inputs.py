import datetime

name = input("What is your name? ")
print("Hello " + name)

birth_year = int(input("Enter your birth year: "))
today = datetime.datetime.now()
current_year = today.year
age = current_year - birth_year
print("You are " + str(age) + " years old!")