import requests
import pandas as pd

url = 'https://cat-fact.herokuapp.com/facts'
response = requests.get(url)

print(response.json())

facts = pd.DataFrame(response.json())
print(facts)

