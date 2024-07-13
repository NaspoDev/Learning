import mysql.connector

from main import cursor, db_connection

# Creating a new appointment based on user input, and posting it to the appointments table.

# appointment params to be used when posting to db.
appointment_params = {
    'customer_id': None,
    "pet_id": None,
    'datetime': None,
    'details': None
}


# Returns a list of strings. Each strings holds the pet id and pet name.
def get_customer_pets(customer_id):
    cursor.execute(
        f"SELECT * FROM pets "
        f"WHERE owner_id={customer_id}"
    )
    response = cursor.fetchall()
    pets = []
    for pet in response:
        pets.append(f"{pet['id']} - {pet['name']}")

    return pets


# get the appointment parameters from the user.
def get_params_from_user():
    print("Enter the details for the new appointment...")
    for key in appointment_params.keys():
        # if key is "pet", get pets and ask which pet
        if key == "pet_id":
            appointment_params[key] = input(f"Which pet?\n"
                                            f"{get_customer_pets(appointment_params['customer_id'])}\n"
                                            f"Enter the id: ")
        elif key == "datetime":
            appointment_params[key] = input(f"{key} (YYYY-MM-DD HH:MM:SS): ")
        else:
            appointment_params[key] = input(f"{key}: ")


# Post the new appointment to the database
def create_appointment(params):
    try:
        cursor.execute(
            "INSERT INTO appointments "
            "(customer_id, pet_id, datetime, details) "
            f"VALUES ({params['customer_id']}, {params['pet_id']}, \"{params['datetime']}\", \"{params['details']}\")"
        )
        # Important! Posting data requires calling commit() from the database connection itself!
        db_connection.commit()
    except mysql.connector.Error as error:
        print(error.msg)


get_params_from_user()
create_appointment(appointment_params)