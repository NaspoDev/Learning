from cryptography.fernet import Fernet

# A simple password manager learning project

master_password = input("What is your master password? (No point right now) ")


def load_key():
    file = open('key.key', 'rb')
    key = file.read()
    file.close()
    return key


key = load_key()
fer = Fernet(key)

'''
def write_key():
    key = Fernet.generate_key()
    with open('key.key', 'wb') as key_file:
        key_file.write(key)'''


def view():
    with open('passwords.txt', 'r') as file:
        for line in file.readlines():
            data = line.rstrip()
            user, password = data.split("|")
            print(f"User: {user}, Password: {fer.decrypt(password.encode()).decode()}")


def add():
    name = input("Account Name: ")
    password = input("Password: ")

    with open('passwords.txt', 'a') as file:
        file.write(name + "|" + fer.encrypt(password.encode()).decode() + "\n")


while True:
    mode = input("Would you like to add a new password, or view existing ones? (view | add | quit) ").lower()

    if mode == "view":
        view()
    elif mode == "add":
        add()
    elif mode == "quit":
        break
    else:
        print("Invalid mode.")


