import utils

if __name__ == "__main__":
    pass
else:
    print("Run as import")
    quit()

# Intro
print("Welcome to Rock Paper Scissors!")
print("You vs the computer. Best of three wins!")

game_stats = []  # Holds game outcomes, appended in order. (0 = Win | 1 = Loss).

game = 1
# Game execute logic, repeats until three games have been completed.
while game <= 3:
    print(f"\n=== Game {game} ===")
    user_move = utils.get_user_move()
    computer_move = utils.get_computer_move()

    match utils.outcome(user_move, computer_move):
        case 0:
            print("You won!")
            game_stats.append(0)
            game += 1
        case 1:
            print("You lost :(")
            game_stats.append(1)
            game += 1
        case 2:
            print("Draw! Redo...")

# Checking if the user won or lost the best of three.
best_of_three_counter = 0
for stat in game_stats:
    if stat == 0:
        best_of_three_counter += 1

# Printing the final outcome.
print()
if best_of_three_counter >= 2:
    print("Congratulations! You won the best of three!")
else:
    print("You lost! You were beat in rock paper scissors by a computer. :(")



