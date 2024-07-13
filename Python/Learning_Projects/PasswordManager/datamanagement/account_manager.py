import utils
from account import Account

accounts = []  # List of accounts (stored here from data files in runtime).
session_account = None  # The current account signed in.


def sign_in():
    while True:
        mode = input("Login (1) | Create Account (2)").lower()
        if mode == "login" or mode == "1":
            __log_in()
            break
        elif mode == "create account" or mode == "2":
            __create_account()
            break
        else:
            print("Invalid selection!")


def __log_in():
    user = input("Enter your username: ")
    account = next((acc for acc in accounts if acc.user == user), None)
    if account is None:
        print("Could not find an account with that username.")
        sign_in()
    else:
        if input("Enter the master password: ") == account.master_pwd:
            print(f"Welcome back, {account.user}")


def __create_account():
    user = None
    master_pwd = None

    # Setting a username
    while True:
        user = input("Enter your preferred username: ")
        if utils.has_space(user):
            print("Your username cannot contain a space.")
        else:
            if any(acc.user.lower() == user.lower() for acc in accounts):
                print("That username has already been taken! Please try again.")
            else:
                break

    # Setting a password
    while True:
        master_pwd = input("Create a master password. (Keep this secure elsewhere): ")
        if utils.has_space(master_pwd):
            print("Your master password cannot contain spaces! Please try again.")
        else:
            break

    # Create the account and add it to the list
    account = Account(user, master_pwd)
    accounts.append(account)




