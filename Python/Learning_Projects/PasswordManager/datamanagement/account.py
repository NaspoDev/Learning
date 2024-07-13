# import data_manager as dm


class Account:
    passwords = {}  # login : password

    def __init__(self, user, master_pwd):
        self.user = user
        self.master_pwd = master_pwd

    def add_login(self, login, password):
        self.passwords[login] = password

