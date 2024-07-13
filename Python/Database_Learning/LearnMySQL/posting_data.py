from main import cursor, db_connection

# Learning to post data.

sql = ("INSERT INTO customers "
       "(first_name, last_name, phone_number, email) "
       "VALUES (%s, %s, %s, %s)")
# you can add multiple values at once by passing in a list of tuples
value = ("Peter", "Topaltsis", 4166256464, "ptop49@yahoo.ca")

cursor.execute(sql, value)

# you can also add multiple values at once by passing in a list of tuples,
# and using cursor.executemany()
values = [("Peter", "Topaltsis", 4166256464, "ptop49@yahoo.ca"),
          ("Joy", "Topaltsis", 6472849204, "jtsubway@icloud.com"),
          ("Despina", "Theradorakopoulos", 6472353537, "despos@hotmail.com")]
cursor.executemany(sql, values)

db_connection.commit()
