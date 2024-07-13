from enum import Enum


class Bills(Enum):
    FIVE = 5
    TEN = 10
    TWENTY = 20
    FIFTY = 50
    HUNDRED = 100


class Coins(Enum):
    NICKEL = .05
    DIME = .1
    QUARTER = .25
    LOONIE = 1
    TOONIE = 2
