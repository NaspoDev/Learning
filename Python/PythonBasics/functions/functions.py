# Functions are methods in java

# def is short for define (i.e. defining a functions)
def greet_user(first_name, last_name):
    print(f"Hi there, {first_name} {last_name}!")
    print("Welcome aboard")


greet_user("John", "Smith")

# in certain situations, you can use keyword arguments so that you don't have to follow order of params
greet_user(last_name="Smith", first_name="John")

print("\n")


def square(number):
    return number * number


print(square(3))
