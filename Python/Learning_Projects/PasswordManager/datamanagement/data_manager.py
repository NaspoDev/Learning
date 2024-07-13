import os
from datamanagement.account import Account

accounts = []

class DataManagement:

    dir_name = 'Accounts'
    parent_dir = 'Documents'
    path = str(os.environ["HOMEPATH"]) + '\\' + parent_dir + '\\' + dir_name + '\\'

    def mkdir(self):
        if not os.path.isdir(self.path):
            os.mkdir(self.path)

    def __init__(self):
        self.mkdir()

    def restore_data(self):
        # for file in

    def new_account(self, user, master_pwd):
        print(user, master_pwd)
        acc = Account(user, master_pwd)
        accounts.append(acc)

    def get_account(self, user, master_pwd):
        for filename in os.listdir(self.path):
            if filename.lower() == (user + '.txt'):
