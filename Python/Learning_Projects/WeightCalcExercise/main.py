# Convert the users weight into the other unit of measurement.

weight = float(input("Weight: "))
unit = str(input("kg (K) or lbs (L): "))

if unit.lower() == "k":
    print("Weight in lbs: " + str((weight / 0.45)))
elif unit.lower() == "l":
    print("Weight in kg: " + str((weight * 0.45)))
else:
    print("You did not enter a valid input. Try again!")
