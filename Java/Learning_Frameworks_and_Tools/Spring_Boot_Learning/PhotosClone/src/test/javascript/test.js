// Using JS to send test requests.
const url = "http://localhost:8080/photos";
const photo = {
  fileName: "my_new_photo.jpg",
};

async function createPhoto(url, photo) {
  await fetch(url, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(photo),
  })
    .then((response) => response.text())
    .then((data) => console.log(data));
}

async function deletePhoto(url, photoId) {
  await fetch(`${url}/${photoId}`, {
    method: "DELETE",
    headers: {
      "Content-Type": "application/json",
    },
    body: {
      id: "",
    },
  });
}

createPhoto(url, photo);
// deletePhoto(url, "72b3e543-5d78-45a3-9346-de8b28f612a7");
