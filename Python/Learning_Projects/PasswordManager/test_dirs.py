import os

dir_name = 'Fruits'
path = str(os.environ['HOMEPATH']) + '\\Documents\\' + dir_name + '\\'
os.mkdir(path)

if os.path.isdir(path):
    with open(path + 'rex.txt', 'a') as file:
        file.write("test\n")
        file.write("yelp\n")
else:
    print("No such folder!")