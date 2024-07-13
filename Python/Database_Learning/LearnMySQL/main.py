import mysql.connector

# establish the connection to the database
# (best to put it in a try except)
try:
    db_connection = mysql.connector.connect(user='root',
                                            password='nfbz3QL!@okPYQSH',
                                            host='localhost',
                                            database='pet_groomer')
except mysql.connector.Error as error:
    print(error.errno, error.msg)

# establish the cursor. We use the cursor to interact with the database.
# by default cursor will return things in tuples, you can manually set it to
# return dictionaries instead if you prefer. (As dealing with indexes is trickier).
cursor = db_connection.cursor(dictionary=True)

# executing statements: Ex. SELECT * FROM customers
cursor.execute("SELECT * FROM customers")  # execute a statement with the cursor.execute() function
# fetch results. cursor.fetchall() returns a list of tuples, where each tuple is a record.
customers = cursor.fetchall()  # fetching results and assign to a variable
print(customers)