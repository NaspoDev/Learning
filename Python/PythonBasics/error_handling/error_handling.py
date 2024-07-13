loop = True

while loop:
    try:
        age = int(input("Age: "))
        print(f"Age = {age}. Thank you!")
        break
    except ValueError:
        print("Error! Please enter a valid integer.")
