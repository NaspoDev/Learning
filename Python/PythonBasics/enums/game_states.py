from enum import Enum, auto

# If the value of an enum doesn't matter, set it to the auto() functions. It will assign each enum a meaningless,
# but unique integer value.
# (Also make sure to import auto like done above).


class States(Enum):
    PLAYING = auto()
    MENU = auto()
    PAUSED = auto()
    GAME_OVER = auto()


state = States.PLAYING

if state == States.PLAYING:
    print("The game is being played.")
    print(f"auto value of enum: {state.value}")
