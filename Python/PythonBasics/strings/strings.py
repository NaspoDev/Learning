course = "Python for Beginners"
print(course.isupper())
print(course.upper())
print(course.find("y"))
print(course.find("for"))
print(course.replace("for", "4"))
print("Python" in course)  # 'in' operator. Is there "Python" in the course string? Returns a boolean value
first_char = course[0]

# Printing stuff on the same line using multiple print statements.
# Add  end='' (separated by a comma before). Whatever goes into the brackets will carry over to the next
# line (ex. a space).
print("Hello", end=' ')
print("my name is:", end=' ')
print("Athanasios.")

# f prints are just better:
name = "Justin"
age = 19
print(f"Hello {name}, you are {age} years old.")

# formatting
my_decimal = 5.319394029545839205
print(f"{my_decimal:.3f}")

for i in range(1, 11):
    print(f"The value is {i:02}")

titles = ["Name", "Age", "Gender"]
values = [["Bartholomew", 22, "Male"],
          ["Justin", 19, "Male"],
          ["Laya", 18, "Female"]]

print(f"{titles[0]:>15} {titles[1]:>20} {titles[2]:>25}")
print(f"{values[0][0]:>15} {values[0][1]:>20} {values[0][2]:>25}")
print(f"{values[1][0]:>15} {values[1][1]:>20} {values[1][2]:>25}")
print(f"{values[2][0]:>15} {values[2][1]:>20} {values[2][2]:>25}")
