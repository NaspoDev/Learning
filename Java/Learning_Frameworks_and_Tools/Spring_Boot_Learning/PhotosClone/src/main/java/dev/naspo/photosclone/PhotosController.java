package dev.naspo.photosclone;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

// The @RestController annotation defines a class as a REST controller. (The class handles requests).
@RestController
public class PhotosController {
    // mock database of photos.
    private List<Photo> db = new ArrayList<>();

    public PhotosController() {
        db.add(new Photo("hello.jpg"));
    }

    // @GetMapping("/route") defines this method as a GET method for the specified route.
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    // Spring Boot will automatically convert the List object of photos into JSON, and return that.
    @GetMapping("/photos")
    public List<Photo> getPhotos() {
        return db;
    }

    // @PathVariable sets the parameter variable in the URL to the method parameter.
    @GetMapping("/photos/{id}")
    public Photo getPhoto(@PathVariable String id) {
        for (Photo p : db) {
            if (p.getId().equals(id)) {
                return p;
            }
        }

        // Throw 404 error if photos doesn't exist.
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    // Delete a photo.
    @DeleteMapping("/photos/{id}")
    public void deletePhoto(@PathVariable String id) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getId().equals(id)) {
                db.remove(i);
                return;
            }
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    // Post a photo.
    // @RequestBody annotation automatically converts the JSON post request body into
    // the Java object provided. (In this case it will create a Photo object with it).
    @PostMapping("/photos")
    public Photo createPhoto(@RequestBody @Valid Photo photo) {
        db.add(photo);
        return photo;
    }
}
