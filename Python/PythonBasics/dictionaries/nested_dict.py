people = {
    1 : {'name' : "John Dover", 'age' : 45, 'sex' : 'Male'},
    2 : {'name': "Helen Panos", 'age': 33, 'sex': 'Female'}
}

print(people)
print(people[1]['name'])

print(people.items())

# Smooth brain way of iterating through this dict
for n in people:
    print(f"\n--- Person {n} ---")
    print(f"Name: {people[n]['name']}")
    print(f"Age: {people[n]['age']}")
    print(f"Sex: {people[n]['sex']}")

# Textured brain way of iterating through the dict
for p_id, p_info in people.items():
    print("\nPerson ID:", p_id)

    for key in p_info:
        print(key + ':', p_info[key])