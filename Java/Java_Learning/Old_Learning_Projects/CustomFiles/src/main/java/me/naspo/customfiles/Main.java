package me.naspo.customfiles;

public class Main {

    public static void main(String[] args) {

        Folder folder = new Folder();
        CustomFile customFile = new CustomFile();
        Reading reading = new Reading(customFile.get());
        customFile.setup();
        reading.read();
    }
}
