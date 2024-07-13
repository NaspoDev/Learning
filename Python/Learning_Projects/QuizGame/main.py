# Simple quiz game. Learning purposes.

# Does the user want to play? Receiving input.
while True:
    is_playing = input("Do you want to play? (Yes | No) ").lower()
    if (is_playing != "yes") and (is_playing != "no"):
        print("Invalid input, try again.")
    else:
        break

# Processing is_playing input.
if is_playing.lower() != 'yes':
    quit()

print("\nGreat! Let's play...")

# Initializing questions dict and score int.
q_and_a = {
    "What does CPU stand for?": "central processing unit",
    "How many days are there in a year?": "365",
    "What does GPU stand for?": "graphics processing unit",
    "How many seconds are there in a minute?": "60",
    "What is the best Minecraft server?": "deltarealms"
}

score = 0

# for loop for asking questions, receiving answers, and processing score.
for q in q_and_a:
    correct_answer = q_and_a[q]
    user_answer = input("\n" + q + " ").lower()

    if user_answer == correct_answer:
        print("Correct! +1")
        score += 1
    else:
        print("Incorrect. The correct answer was:")
        print(q_and_a[q])

# Quiz conclusion.
print(f"\nQuiz over! Your score is: {score} / {len(q_and_a)}.")
print("Thanks for playing!")



