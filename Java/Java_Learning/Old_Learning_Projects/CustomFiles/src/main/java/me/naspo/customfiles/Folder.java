package me.naspo.customfiles;

import java.io.File;

public class Folder {

    private File dir; //Directory

    Folder() {
         dir = new File("TestFolder");

        if (!dir.exists()) {
            try {
                dir.mkdir();
                System.out.println("Folder created successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Did not create folder, it already exists.");
        }
    }

    public File get() {
        return dir;
    }
}
