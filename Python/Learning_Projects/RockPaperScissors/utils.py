import random

# Utility Module

options = ("rock", "paper", "scissors")


def get_user_move():
    while True:
        user_move = input("What is your move? (Rock | Paper | Scissors | or Q to quit) ").lower()

        if user_move == "q":
            quit()
        elif user_move not in options:
            print("Please enter a valid input.")
        else:
            return user_move


def get_computer_move():
    return random.choice(options)


def outcome(user_move, computer_move):
    # Win cases
    if user_move == 'rock' and computer_move == 'scissors':
        return 0
    elif user_move == 'paper' and computer_move == 'rock':
        return 0
    elif user_move == 'scissors' and computer_move == 'paper':
        return 0
    # Draw case
    elif user_move == computer_move:
        return 2
    # Otherwise, loss
    else:
        return 1
