import requests

user_id = 'a.topaltsis'
url = f'https://api.spotify.com/v1/users/{user_id}/playlists'
auth_token = 'BQBKvsReaZ3T972HNgS41C4J3RCvpI_TPeIJ3nLA6XuKNZXlnKVke_dMa-pkq0Fnh76wie5RX_2ezTIWcq64PC-SE7c8xthF9DIDFAUP8GNdtb-1iRcl9ZRsB6bVHPTP9h9K5sAeHP7uYuAWixikLDScsgGQa2xp8VuD-9_ySGF7XcvLxWh5xQ9PXvLk-1ZMrg'

response = requests.get(url,
                        headers={
                            'Authorization': f'Bearer {auth_token}'
                        })

print("Raw JSON Response:")
print(response.json())

# Formatting the data as I want
print("\nDesired data pulled and formatted as pleased:")

# Variables
data = response.json()

playlists_amount = len(data['items'])
playlists_raw = data['items']
playlists = []


class Playlist:
    def __init__(self, collaborative, description, url, cover, name, owner, public, tracks):
        self.collaborative = collaborative
        self.description = description
        self.url = url
        self.cover = cover
        self.name = name
        self.owner = owner
        self.public = public
        self.tracks = tracks

    def display(self):
        format_preset = "{:<40} {:<40} {:<40} {:<40} {:<20} {:<20} {:<20} {:<20}"
        print(format_preset
              .format("Name", "Description", "Tracks", "URL", "Cover", "Public", "Collaborative", "Owner"))
        print(format_preset
              .format(self.name, self.description, self.tracks, self.url, self.cover, self.public, self.collaborative,
                      self.owner))


def get_playlist(index):
    try:
        return playlists_raw[index]['images'][0]['url']
    except Exception:
        return ""


for i in range(playlists_amount):
    playlists.append(Playlist(
        playlists_raw[i]['collaborative'],
        playlists_raw[i]['description'],
        playlists_raw[i]['external_urls']['spotify'],
        get_playlist(i),
        playlists_raw[i]['name'],
        playlists_raw[i]['owner']['display_name'],
        playlists_raw[i]['public'],
        playlists_raw[i]['tracks']['total']
    ))

for i in range(len(playlists)):
    playlists[i].display()





