import random

random_num = random.randrange(1, 11)
guesses = 1
guess = 0

print("Guessing Game! Guess a number 1 through 10.\n")
while guess != random_num:
    guess = int(input(f"Guess {guesses}: "))
    if guess != random_num:
        print("Nope, try again.")
        guesses += 1

print(f"Correct! After {guesses} guesses, you got it right.")
