price = 25
print(price > 10 and price < 30)
print(price > 10 or price > 30)
print(10 < price < 30)
print(not (price > 50))

temperature = 21
if temperature > 30:
    print("It's hot outside!")
    print("Make sure to dink lots of water.")
elif temperature == 22:
    print("Ahh it's perfect outside.")
else:
    print("You tell me if its hot or cold bruh.")
print("Done")

sport = "soccer"
match sport:
    case "soccer":
        print("The best sport!")
    case "basketball":
        print("Ball is life dawg.")
    case "chess boxing":
        print("Ah, we have a man of culture.")