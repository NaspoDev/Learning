class Point:
    def __init__(self, x, y): # Constructor. init = initialize as in initializing the class
        # self is basically the 'this' keyword in java. But because its python we can define the class
        # referenced x variable in the same statement (i.e. self.x =)
        self.x = x
        self.y = y

    def move(self):
        self.x += 1
        print("Moved one unit in the x axis!")
        print(f"New x value: {self.x}")

    def draw(self):
        print("draw")


point1 = Point(1, 2)
point1.y = 3  # we can also define new variables in classes like this
print(f"x: {point1.x}, y: {point1.y}, z: {point1.y}")
point1.move()

print("\n")

# --- Inheritance ---
class Mammal:
    def walk(self):
        print("walk")


class Dog(Mammal):
    def bark(self):
        print('bark')

class Cat(Mammal):
    def be_annoying(self):
        print("im a small tiger in your home m8")


chihuahua = Dog()
chihuahua.walk()
chihuahua.bark()

orange_cat = Cat()
orange_cat.walk()
orange_cat.be_annoying()





