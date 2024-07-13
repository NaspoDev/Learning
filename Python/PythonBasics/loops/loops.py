i = 1
while i <= 5:
    print(i)
    i += 1

a = 1
while a <= 5:
    print(a * "*")
    a += 1

# for loops are used as an iterator (through data sets)
fruits = ["apple", "banana", "pear", "strawberry", "blueberry"]
for fruit in fruits:
    if fruit == "pear":
        print("The pear has been found!\n"
              "It shall not be printed.")
    else:
        print(fruit)

print("\nEnumeration...")
# With enumeration
for index, object in enumerate(fruits):
    print(f"{index}, {object}")