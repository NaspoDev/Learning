# Main API learning script.

import requests  # requests HTTP library is required for requesting information over the web from an API

# store the main requests.get return value to a variable conventionally named response.
# response can be used to work with the API request
response = requests.get('https://randomfox.ca/floof/')

# Examples of working with the response...

if response.status_code == 200:
    print(response.status_code, "OK!")

# response.text returns raw text value of the api request
print(response.text)
# response.json returns the api request formatted in json, usually as a dictionary. (Much easier to work with).
print(response.json())

# we've now stored the json response in a dictionary called fox
fox = response.json()
print(fox['image'])