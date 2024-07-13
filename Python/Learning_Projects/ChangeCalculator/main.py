from money_types import Bills, Coins

if __name__ == '__main__':
    pass
else:
    print("Run as import!")
    quit()

print("Exact Change Calculator")

change = None
money_pieces = []

# Gets initial change input. (Rounds to 2 decimals if input exceeds standard money format).
while True:
    try:
        change = round(float(input("How much change is owed? ")), 2)
        break
    except Exception:
        print("Enter a valid value!")

if change <= 0:
    print("No change is owed")
    quit()
else:  # Rounding to nearest 0.05 and outputting.
    change = float((.05 * round(change/.05)))
    print(f"\nRounded: ${change:.2f}")

# Bill Calculations
highest_bill = None
while True:
    for b in Bills:
        if b.value <= change:
            highest_bill = b

    if highest_bill is None:
        break
    else:
        money_pieces.append(highest_bill)
        change = change - highest_bill.value
        highest_bill = None

# Coin Calculations
highest_coin = None
while True:
    for c in Coins:
        if c.value <= change:
            highest_coin = c

    if highest_coin is None:
        break
    else:
        money_pieces.append(highest_coin)
        change = change - highest_coin.value
        highest_coin = None

# Money pieces output
print("Give...")
for i, obj in enumerate(money_pieces):
    if i != 0:
        if money_pieces[i - 1] == obj:
            continue

    # Formatting enum name to look better.
    name_formatted = str(obj.name)[:1] + str(obj.name)[1:].lower()
    if money_pieces.count(obj) > 1:
        name_formatted = name_formatted + "s"

    print(f"{money_pieces.count(obj)} {name_formatted}")

