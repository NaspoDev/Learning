# No such thing as arrays in python, there are lists.

# Lists:
names = ["John", "Bob", "Athanasios", "Mary", "Sam"]
print(names)
print(names[2])
print(names[-1])
print(names[0:3])

numbers = [1, 2, 3, 4, 5]
numbers.append(6)
print(numbers)
numbers.insert(2, 45)
print(numbers)
numbers.remove(3)
print(numbers)
print(1 in numbers)
print(10 in numbers)
print(len(numbers))

# Tuples:
# Tuples are immutable. (They can not be altered once created).
# They are similar to lists, but represented by regular brackets as opposed to square brackets.
nums = (1, 2, 3, 3)
print(nums.index(2))
print(nums.count(3))

# Unpacking example, with tuples
# Assigning each item in the tuple to a variable:
coordinates = (1, 2, 3)
x, y, z = coordinates

# 2D Lists (Each item in the list is a list
print('2D Lists')
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
print(matrix[0][2])
