package me.naspo.customfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {

    File file;
    Reading(File file){
        this.file = file;
    }

    private Scanner read;

    public void read() {
        try {
            read = new Scanner(file);
            System.out.println(read.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
