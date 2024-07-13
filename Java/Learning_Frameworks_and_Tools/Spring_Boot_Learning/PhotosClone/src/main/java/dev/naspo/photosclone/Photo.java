package dev.naspo.photosclone;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

// Photo Data Class
public class Photo {
    private String id;
    @NotNull
    private String fileName;

     /*
     Data classes that need to be deserialized from JSON need to also have a 0 arg constructor.
     It has to do with how the JSON deserialization library works.

     * Note that the deserializer runs through the no-arg constructor and creates the object
     based on the fields defined in the class, not based on the args defied in the regular constructor.
     So, if you want to run logic alongside the creation of a class when it's being deserialized,
     you must also add the logic to the no-arg constructor.
        - Notice below how creating the id is in both constructors.
      */
    public Photo() {
        this.id = UUID.randomUUID().toString();
    }

    public Photo(String fileName) {
        this.id = UUID.randomUUID().toString();
        this.fileName = fileName;
    }

    // == Getters and Setters ==

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
