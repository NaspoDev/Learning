import requests

print('Search for "The Weeknd"')
url = 'https://api.spotify.com/v1/search'
auth_token = 'BQBQJFA_h_yVpMalXdi335F4BEKAwWKW8GRXTdnqEMtD59T5DNwMjCFN38AaGTp9_oSfU_0IzftLsTmDQPYB-vySyjzmkJ6OAwhFLw__ejQVW1j0pIQ6qQT6UnK7c-otWhukOg8iGG1b-PJDRZB79PXHVvGbm_RcxMQu5JNG6pQ3AKyFjg'

response = requests.get(url,
                        headers={
                            'Authorization': f'Bearer {auth_token}',
                        },
                        params={
                            'q': 'The Weeknd',
                            'type': 'artist'
                        })
print(response.json())

