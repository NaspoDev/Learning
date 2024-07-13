from main import cursor

# More stuff to do with learning queries
# Inner join query

my_join_params = {
    'left_table': 'customers',
    'left_key': 'id',
    'right_table': 'pets',
    'right_key': 'owner_id'
}


def inner_join(params):
    cursor.execute(
        f"SELECT * FROM {params['left_table']} "
        f"INNER JOIN {params['right_table']} "
        f"ON {params['right_table']}.{params['right_key']} = {params['left_table']}.{params['left_key']}"
    )
    return cursor.fetchall()


my_inner_join = inner_join(my_join_params)

print(f"Raw response:\n {my_inner_join}")
print(f"Raw example of a relationship:\n {my_inner_join[0]}")

for pair in my_inner_join:
    print(f"Owner name: {pair['first_name']}, Pet name: {pair['name']}")

