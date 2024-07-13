from enum import Enum  # we only need the Enum class from the enum module


class Outcomes(Enum):
    WIN = 0
    LOSS = 1
    DRAW = 2
    UNDEFINED = 3


state = Outcomes.UNDEFINED
user_move = 'rock'
computer_move = 'scissors'

if user_move == 'rock' and computer_move == 'scissors':
    state = Outcomes.WIN

if state == Outcomes.WIN:
    print("You won!")
    print(f"State value: {state.value}")

