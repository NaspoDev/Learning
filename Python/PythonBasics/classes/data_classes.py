# Dataclasses are classes specifically used to hold data, that would otherwise require lots of
# constructor parameters. (Ex. A playlist class, inventory class, user info class, etc...)
# https://docs.python.org/3/library/dataclasses.html#module-dataclasses

# MANDATORY IMPORT
from dataclasses import dataclass


# Format:
# <variable_name>: <type> [= <optional default>]
@dataclass()
class User:
    name: str
    age: int
    weight: float
    favourite_drinks: list[str]
    children: int = 0
    # this is only 5, but you can really keep going...

    def display_drinks_nicely(self):
        print("Favourite Drinks:")
        for i, drink in enumerate(self.favourite_drinks):
            print(f"#{i + 1} {drink}")


bob = User(
    "Bob Mannings",
    20,
    50.5,
    ["orange juice", "coffee", "bubble tea"],
)

print(bob.name)
print(bob.children)
bob.display_drinks_nicely()